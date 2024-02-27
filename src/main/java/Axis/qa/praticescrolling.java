package Axis.qa;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class praticescrolling {
	public static void main(String[] args) throws InterruptedException {
		 
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\\\gvija\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
 
		WebDriver driver = new ChromeDriver();
 
		driver.get("https://webdriveruniversity.com/Scrolling/index.html");
 
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0 , 800)", "");
		 Thread.sleep(1000);
		 js.executeScript("window.scrollBy(0 , -800)", "");
		 Thread.sleep(1000);
		 
		 WebElement scroll=driver.findElement(By.xpath("//div[@id='zone4']"));
		 js.executeScript("arguments[0].scrollIntoView(true);", scroll);

	}

}
