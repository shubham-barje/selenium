package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoIframe {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		driver.manage().window().maximize();
		
		//move to another frame2 from other frame
		WebElement frame1 = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(frame1);
		
		driver.findElement(By.xpath("/html/body/button")).click();
		String alertMsg = driver.switchTo().alert().getText();
		System.out.println(alertMsg);
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
		driver.switchTo().parentFrame();
		String title = driver.getTitle();
		System.out.print(title);

	}

}
