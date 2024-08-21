package ui;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWait1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[2]/a"));

		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		//polling interval means it check the condition is fullfilled or not 
		Wait<ChromeDriver> wait = new FluentWait<>(driver)
				.withTimeout(Duration.ofSeconds(10))
		        .pollingEvery(Duration.ofSeconds(2))
		        .withMessage("Shubham")
		        .ignoring(ElementNotInteractableException.class);//it ignore the exception if occured
		;
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[2]/div[2]/div[1]/nav[1]/ul/li[2]/a"))).click();
				

	}

}
