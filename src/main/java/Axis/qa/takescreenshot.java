package Axis.qa;
import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class takescreenshot {
	public static void main(String[] args) throws InterruptedException, IOException 
	{

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gvija\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		 WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com");
		driver.manage().window().maximize();
		Thread.sleep(500);
		
		//take screenshot
		
		
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//Path to the location to save screenshot
		Files.copy(f, new File("C:\\Users\\gvija\\OneDrive\\pictures\\screenshot.png"));
		System.out.println("Screenshot is captured");
	}

}
