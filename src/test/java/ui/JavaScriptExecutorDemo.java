package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		driver.manage().window().maximize();

		JavascriptExecutor jsexec = (JavascriptExecutor) driver;
		
		//Print the title of the page 
		String script = "return document.title;";
		String title = (String) jsexec.executeScript(script);
		System.out.println(title+"done");
		
		
		//Click button
		WebElement frame1 = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(frame1);
		
		jsexec.executeScript("myFunction()");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		System.out.println("done");
//		
		//heighlight
		WebElement button = driver.findElement(By.xpath("/html/body/button"));
		jsexec.executeScript("arguments[0].setAttribute('style','border:5px solid green;');", button);
		System.out.println("done");
		
		//Scroll
		driver.navigate().to("https://www.w3schools.com/");
		WebElement certifiedbutton = driver.findElement(By.xpath("//*[@id=\"main\"]/div[8]/div/div[4]/a/div"));
		jsexec.executeScript("arguments[0].scrollIntoView(true)",certifiedbutton);
		System.out.println("done");
		
		driver.close();
	}

}
