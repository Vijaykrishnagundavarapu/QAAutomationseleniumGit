package Axis.qa;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.FluentWait;
public class webtables {
	public static void main(String[] args) throws InterruptedException {
		 
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\\\gvija\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
 
		WebDriver driver = new ChromeDriver();
 
		driver.get("https://the-internet.herokuapp.com/tables");
 
		driver.manage().window().maximize();
 
		Thread.sleep(500);
		
		//find no of rows
		
		List<WebElement> rowno = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
		int rowcount = rowno.size();
		System.out.println(rowcount);
		
		//find no of columns

		List<WebElement> colno = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr[1]/td"));
		int columncount = colno.size();
		System.out.println(columncount);
		//explicit wait is used to wait for a particular element based on the expected condition
		// explicit wait - to wait for the compose button to be click-able
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id = 'table1']/tbody/tr[4]/td[3]")));
				
		 
		//fetch the cell data from particular cell
		WebElement celldata = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[4]/td[3]"));
		String  text = celldata.getText();
		System.out.println(text);
		
		
		String exceptedtext = "tconway@earthlink.net";
		if(text.equals(exceptedtext)	) {
			System.out.println("the cell data is right");
			
		}else {
			System.out.println("the cell data is wrong");
		}
		
	}

}
