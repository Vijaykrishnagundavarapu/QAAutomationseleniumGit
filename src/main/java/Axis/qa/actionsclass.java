package Axis.qa;

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


public class actionsclass {
	public static void main(String[] args) throws InterruptedException, IOException 
	{

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gvija\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		 WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().window().maximize();
		Thread.sleep(500);
		
		//doubleclick
		WebElement doubleclick =  driver.findElement(By.xpath("//input[@id='double-click']"));
		Actions builder = new Actions(driver);
		builder.doubleClick(doubleclick).perform();
		//info alets
		Thread.sleep(500);
		Alert alt = driver.switchTo().alert();
		alt.accept();
		//context click ryt click
		builder.contextClick(doubleclick).perform();
		
	}

}
