package Axis.qa;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class invokefirefoxdricer {
	public static WebDriver driver;
	
	public static void main(String[] args) {
				 WebDriver driver = new FirefoxDriver();
		  driver.get("https://www.selenium.dev/");

	}

}


