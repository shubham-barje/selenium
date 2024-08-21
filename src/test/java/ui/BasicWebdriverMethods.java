package ui;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicWebdriverMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		String CuurentUrl = driver.getCurrentUrl();
		System.out.println(CuurentUrl);
		
		String Title = driver.getTitle();
		System.out.println(Title);
		
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		
//		driver.navigate().to("https://www.orangehrm.com/en/contact-sales/");
		
		List<WebElement> webelements = driver.findElements(By.xpath("//div[@class='inventory_list']/div"));
		System.out.println(webelements);
		
		driver.navigate().to("https://www.orangehrm.com/");
		String windowhandler = driver.getWindowHandle();
		System.out.println(windowhandler);
		
		
		driver.findElement(By.xpath("//button[@class=\"btn btn-ohrm btn-contact-sales\"]")).click();
		Thread.sleep(3000);
		Set<String> windowhandlers = driver.getWindowHandles();
		System.out.println(windowhandlers);
		
		
		
		driver.close();
	}

}
