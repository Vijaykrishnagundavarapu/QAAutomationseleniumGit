package Axis.qa;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import org.openqa.selenium.chrome.ChromeDriver;

public class radiobuttonmultiselect {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gvija\\Downloads\\chromedriver-win64\\chromedriver-win64/chromedriver.exe");

		 WebDriver driver = new ChromeDriver();
		driver.get("https://demo.seliniumeasy.com/basic-radiobutton-demo.html");
		driver.manage().window().maximize();
		
		List<WebElement> allradio =driver.findElements(By.xpath("\\input[@name='agegroup']"));
		for(WebElement wb : allradio) {
			wb.click();
		}
		
	}

}
