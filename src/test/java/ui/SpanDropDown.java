package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpanDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.goindigo.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[@id=\"salePopupCloseBtn\"]")).click();
//		driver.findElement(By.xpath("//span[@class=\"commonModal__close\"]")).click();
//		driver.findElement(By.xpath("//span[text()='From']")).click();
		driver.findElement(By.xpath("//input[@placeholder=\"From\"]")).sendKeys("Mumbai");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder=\"From\"]")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder=\"From\"]")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.close();
		
		
		
		

	}

}
