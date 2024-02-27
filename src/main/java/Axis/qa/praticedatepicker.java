package Axis.qa;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class praticedatepicker{
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\\\\\gvija\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://webdriveruniversity.com/");
			driver.manage().window().maximize();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement ele = driver.findElement(By.xpath("//a[@id='datepicker']"));
			js.executeScript("arguments[0].scrollIntoView(true);", ele);
			Thread.sleep(1000);

			WebElement fn = driver.findElement(By.xpath("//a[@id='datepicker']"));
			fn.click();
			Thread.sleep(1000);

			Set<String> windowHandles = driver.getWindowHandles();
			for (String windowHandle : windowHandles) {
				driver.switchTo().window(windowHandle);
			}


			WebElement fn2 = driver.findElement(By.xpath("//span[@class='input-group-addon']"));
			fn2.click();
			Thread.sleep(1000);

			WebElement fn3 = driver.findElement(By.xpath("//td[@class='day'][normalize-space()='26']"));
			fn3.click();
			Thread.sleep(1000);

			System.out.println(" Successfull");

			driver.close();

			

		 
	}
}
		
		

