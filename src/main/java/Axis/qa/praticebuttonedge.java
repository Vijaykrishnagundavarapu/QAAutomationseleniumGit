package Axis.qa;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class praticebuttonedge {
	 public static void main(String[] args) throws InterruptedException {

	        System.setProperty("webdriver.edge.driver",
	                "C:\\Users\\gvija\\Downloads\\edgedriver_win64\\msedgedriver.exe");

	        WebDriver driver = new EdgeDriver();

	        driver.get("https://webdriveruniversity.com/Click-Buttons/index.html");  // Replace with the actual URL

	        driver.manage().window().maximize();
	        
	       
	        WebElement webElementClickButton = driver.findElement(By.xpath("//p[contains(text(),'CLICK ME!')]"));

	        System.out.println("Clicking Click me: Web Element Click button");
	        webElementClickButton.click();
	        Thread.sleep(1000);

	      
	        WebElement javaScriptClickButton = driver.findElement(By.xpath("//span[@id='button2']"));

	        System.out.println("Clicking Click me: JavaScript Click button using JavaScript click");
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", javaScriptClickButton);
	        Thread.sleep(1000);

	        

	        WebElement actionMoveClickButton = driver.findElement(By.xpath("//span[@id='button3']"));

	        System.out.println("Clicking Click me: Action Move & Click button using JavaScript click");
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", actionMoveClickButton);

	        Thread.sleep(1000);

	        driver.quit();
	 }
	

}


