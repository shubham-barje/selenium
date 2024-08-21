package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiSelectDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver  = new ChromeDriver();
		
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		WebElement ddown = driver.findElement(By.id("cars"));
		Select select = new Select(ddown);
		select.selectByValue("volvo");
		Thread.sleep(2000);
		select.selectByIndex(3);
		Thread.sleep(2000);
		select.selectByVisibleText("Saab");
		Thread.sleep(2000);
		
		List<WebElement> allItems = select.getAllSelectedOptions();//it specifies all selected items
		Thread.sleep(2000);
		select.deselectAll();//It remove all selected values
		Thread.sleep(2000);
		select.selectByValue("volvo");
		Thread.sleep(2000);
		driver.close();
		

	}

}
