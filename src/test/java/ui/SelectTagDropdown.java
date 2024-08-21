package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectTagDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver  = new ChromeDriver();
		
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.findElement(By.name("email")).sendKeys("barjeshubham69@gmail.com");
		
		WebElement selectDropDown = driver.findElement(By.id("how-select"));
		Select select = new Select(selectDropDown);
		
		select.selectByIndex(5);
		select.selectByValue("YouTube");
		select.selectByVisibleText("Internet");
		
		driver.findElement(By.xpath("//input[@class=\"element-container my-2 btn btn-primary\"]"));
		driver.close();

	}

}
