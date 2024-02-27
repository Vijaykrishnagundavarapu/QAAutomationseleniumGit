package Axis.qa;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class practicenavigationcommands
{
	

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gvija\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		//getpageurl
		driver.get("https://webdriveruniversity.com");
		
		//forward
		driver.navigate().forward();
		Thread.sleep(500);
		
		//backward
		driver.navigate().back();
		Thread.sleep(500);
		
		//refresh
		driver.navigate().refresh();
		
		driver.close();
				
	}

}
