package Axis.qa;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;

public class praticeajaxloader {
	 
	public static void main(String[] args) throws InterruptedException {
 
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\\\gvija\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
 
		WebDriver driver = new ChromeDriver();
 
		driver.get("https://webdriveruniversity.com/Ajax-Loader/index.html");
 
		driver.manage().window().maximize();
 
		Thread.sleep(500);
		driver.manage().window().maximize();
		@SuppressWarnings("deprecation")
		Timeouts wait = driver.manage().timeouts().implicitlyWait(8000, TimeUnit.MILLISECONDS);

		
		driver.findElement(By.xpath("//span[@type='button']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[contains(text(), 'Close')]")).click();

	}
}