package Axis.qa;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class praticealerts {
	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gvija\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		 WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Popup-Alerts/index.html");
		driver.manage().window().maximize();
		Thread.sleep(500);
		
		//javascriptalert
		WebElement jsalert = driver.findElement(By.xpath("//span[@id='button1']"));
		jsalert.click();
		
		Alert alt = driver.switchTo().alert();
		alt.accept();
		
		Thread.sleep(200);
		//modalpopup
		WebElement popupalert = driver.findElement(By.xpath("//span[@id='button2']"));
		jsalert.click();
		
		Alert alt1 = driver.switchTo().alert();
		alt1.dismiss();
		Thread.sleep(100);
		
		
		//jsconfirmation
		WebElement jsconfirmation = driver.findElement(By.xpath("//span[@id='button4']"));
		jsconfirmation.click();
		
		Alert alt3 = driver.switchTo().alert();
		alt3.dismiss();
		
		//ajaxloader
		WebElement popupalert1 = driver.findElement(By.xpath("//span[@id='button3']"));
		popupalert1.click();
		
		Alert alt2 = driver.switchTo().alert();
		alt2.dismiss();
		
	}
	

}

