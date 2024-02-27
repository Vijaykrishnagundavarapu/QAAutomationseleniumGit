package Axis.qa;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class invokechromedriver {
	public static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gvija\\Downloads\\chromedriver-win64\\chromedriver-win64/chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
	}

}


