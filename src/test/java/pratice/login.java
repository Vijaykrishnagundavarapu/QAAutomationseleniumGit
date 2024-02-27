package pratice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class login {
		
	
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
		
		username.sendKeys("abc@gmail.com");
		password.sendKeys("Admin@123");
		button.click();
		
		
	}

}

