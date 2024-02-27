package Axis.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class praticeautocompletetextfield {
	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gvija\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		 WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Autocomplete-TextField/autocomplete-textfield.html");
		driver.manage().window().maximize();
		Thread.sleep(500);
		
		WebElement textField = driver.findElement(By.xpath("//input[@id='myInput']"));

        // Enter letters into the text field
        textField.sendKeys("app");
        Thread.sleep(500);
        WebElement selectone = driver.findElement(By.xpath("//div[@id='myInputautocomplete-list']//div[1]"));
        selectone.click();
        Thread.sleep(500);
        WebElement submit = driver.findElement(By.xpath("//input[@id='submit-button']"));
        submit.click();

	}

}
