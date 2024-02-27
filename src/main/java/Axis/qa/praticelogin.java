package Axis.qa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class praticelogin {
		
	
	public static void main(String[] args) throws InterruptedException 
	{
		 
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\gvija\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
 
		WebDriver driver = new ChromeDriver();
 
		driver.get("https://webdriveruniversity.com/Login-Portal/index.html");
 
		driver.manage().window().maximize();
 
		Thread.sleep(500);
		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
		
		username.sendKeys("webdriver");
		password.sendKeys("webdriver123");
		button.click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Alert a1= driver.switchTo().alert();
		a1.accept();
		
		
	}
	

}
