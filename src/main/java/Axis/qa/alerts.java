package Axis.qa;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {
	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gvija\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		 WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().window().maximize();
		Thread.sleep(500);
		
		//infoalerts
		WebElement info = driver.findElement(By.xpath("//input[@name='alert']"));
		info.click();
		Thread.sleep(500);
		Alert alt = driver.switchTo().alert();
		alt.accept();
		
		//confo alerts
		WebElement confo = driver.findElement(By.xpath("//input[@name='confirmation']"));
		confo.click();
		Thread.sleep(500);
		Alert alt1 = driver.switchTo().alert();
		alt1.dismiss();
		
		//prompt alerts
		
		WebElement prompt = driver.findElement(By.xpath("//input[@name='prompt']"));
		prompt.click();
		Thread.sleep(500);
		Alert alt2 = driver.switchTo().alert();
		alt2.accept();
		
	}

}
