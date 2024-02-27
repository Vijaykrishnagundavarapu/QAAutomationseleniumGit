package Axis.qa;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class praticeupload {
	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gvija\\Downloads\\chromedriver-win64\\chromedriver-win64/chromedriver.exe");

		 WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/File-Upload/index.html");
		driver.manage().window().maximize();
		

		 WebElement upload=driver.findElement(By.xpath("//input[@id='myFile']"));
		 upload.sendKeys("C:\\Users\\gvija\\OneDrive\\Pictures\\Screenshots\\Screenshot 2024-02-23 103226.png");
		 Thread.sleep(500);
		 
		 WebElement submit = driver.findElement(By.xpath("//input[@id='submit-button']"));
		 submit.click();

			Alert a1= driver.switchTo().alert();
			a1.accept();
			
			
			
	}
	
	

}
