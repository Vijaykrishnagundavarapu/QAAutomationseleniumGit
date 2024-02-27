package Axis.qa;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class DropDowneg {
	 
	public static void main(String[] args) throws InterruptedException {
 
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\\\gvija\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
 
		WebDriver driver = new ChromeDriver();
 
		driver.get("http://www.dummypoint.com/seleniumtemplate.html");
 
		driver.manage().window().maximize();
 
		Thread.sleep(500);
 
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown']"));
 
		Select sel = new Select(dropdown);
 
		// select by visible text
 
		sel.selectByVisibleText("Option3");
 
		Thread.sleep(500);
 
		// select by value
 
		sel.selectByValue("OptionFive");
 
		// select by indexing
 
		sel.selectByIndex(1);
 
	}
 
}