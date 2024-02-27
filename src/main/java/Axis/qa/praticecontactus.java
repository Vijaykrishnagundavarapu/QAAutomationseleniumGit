package Axis.qa;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import dev.failsafe.internal.util.Assert;


public class praticecontactus {
	public static void main(String[] args) throws InterruptedException 
	{
		 
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\gvija\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
 
		WebDriver driver = new ChromeDriver();
 
		driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");
 
		driver.manage().window().maximize();
 
		Thread.sleep(500);
		WebElement firstname = driver.findElement(By.xpath("//input[@name='first_name']"));
		WebElement lastname = driver.findElement(By.xpath("//input[@name='last_name']"));
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		WebElement comments = driver.findElement(By.xpath("//textarea[@name='message']"));
		WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
		
		firstname.sendKeys("vijay");
		lastname.sendKeys("krishna");
		email.sendKeys("gvijay@gmail.com");
		comments.sendKeys("good");
		submit.click();
		String URL = driver.getCurrentUrl();
	    if(URL.contains("https://webdriveruniversity.com/Contact-Us/contact-form-thank-you.html"))
	    {
	        System.out.println("Thank You");

	    }else
	    {
	        System.out.println("Landed in wrong URL");

	    }
	    
	    driver.navigate().back();
	    WebElement reset = driver.findElement(By.xpath("//input[@type='reset']"));
	    reset.click();

	}

}
