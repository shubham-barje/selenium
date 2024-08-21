package ui;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CapturingScreenShotDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Date currentDate = new Date();
		String screenshotfilename = currentDate.toString().replace(" ", "-").replace(":", "-");
		System.out.println(screenshotfilename);
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com.au/");
		driver.manage().window().maximize();
		
		File ScreenShotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ScreenShotFile, new File(".//screenshot//"+screenshotfilename+".png"));
		 
		
	}

}
