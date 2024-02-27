package Axis.qa;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class praticebuttonclicks {
	public static void main(String[] args) throws InterruptedException 
	{
		 
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\gvija\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
 
		WebDriver driver = new ChromeDriver();
 
		driver.get("https://webdriveruniversity.com/Click-Buttons/index.html");
 
		driver.manage().window().maximize();
		
		WebElement webelement = driver.findElement(By.xpath("//span[@id='button1']"));
		webelement.click();
		
		
		
		//javascript clicks
		//WebElement js = driver.findElement(By.xpath("//span[@id='button2']"));
		//js.click();
		
	}

}
