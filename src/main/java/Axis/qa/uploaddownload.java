package Axis.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class uploaddownload 
{
	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gvija\\Downloads\\chromedriver-win64\\chromedriver-win64/chromedriver.exe");

		 WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().window().maximize();
		

		 WebElement upload=driver.findElement(By.xpath("//input[@name = 'upload']"));
		 upload.sendKeys("C:\\Users\\gvija\\OneDrive\\Pictures\\Screenshots\\Screenshot 2024-02-23 103226.png");
		 Thread.sleep(500);
		
		
		WebElement download= driver.findElement(By.xpath("/input[@name = 'download']"));
		download.click();
		 Thread.sleep(500);
		 
		 
		
	}

}
