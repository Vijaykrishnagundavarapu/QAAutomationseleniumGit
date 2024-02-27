package Axis.qa;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datepicker 
{

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gvija\\Downloads\\chromedriver-win64\\chromedriver-win64/chromedriver.exe");

		 WebDriver driver = new ChromeDriver();
		driver.get("");
	}

}
