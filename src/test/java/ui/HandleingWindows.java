package ui;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleingWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =  new ChromeDriver();
		driver.get("https://www.salesforce.com/in/");
		driver.findElement(By.xpath("//*[@id=\"1682325589592_4ma\"]/div[1]/article/div[2]/div/pbc-button[1]/a")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> iterator = windowHandles.iterator();
		String parentWindow = iterator.next();
		String childWindow = iterator.next();
		
		driver.switchTo().window(childWindow);
		driver.findElement(By.name("UserFirstName")).sendKeys("Shubham");
		driver.findElement(By.name("UserLastName")).sendKeys("Barje");
		driver.switchTo().window(parentWindow);

	}

}
