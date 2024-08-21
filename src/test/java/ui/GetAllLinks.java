package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAllLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		
		List<WebElement> allItems = driver.findElements(By.tagName("a"));
		System.out.println("Total tags are:"+allItems.size());
		
		for(int i=0;i<allItems.size();i++) {
			System.out.println("Links on page are:"+allItems.get(i).getAttribute("href"));
			System.out.println("Links on page are:"+allItems.get(i).getText());
			
		}

	}

}
