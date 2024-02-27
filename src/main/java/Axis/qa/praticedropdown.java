package Axis.qa;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class praticedropdown {
	 
	public static void main(String[] args) throws InterruptedException {
 
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\\\gvija\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
 
		WebDriver driver = new ChromeDriver();
 
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
 
		driver.manage().window().maximize();
 
		Thread.sleep(500);
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']"));
		Select sel = new Select(dropdown);
		 
		// select by visible text
 
		sel.selectByVisibleText("SQL");
		
		//select by value

		WebElement dropdown1 = driver.findElement(By.xpath("//select[@id='dropdowm-menu-2']"));
		Select dp1 = new Select(dropdown1);
		dp1.selectByVisibleText("Maven");
		

		WebElement dropdown2 = driver.findElement(By.xpath("//select[@id='dropdowm-menu-3']"));
		Select dp2 = new Select(dropdown2);
		dp2.selectByIndex(3);
		
		WebElement checkbox2 = driver.findElement(By.xpath("(//input[@type = 'checkbox'])[2]"));
		Thread.sleep(500);
		if(checkbox2.isEnabled()) 
		{
		checkbox2.click();
		
		}
		WebElement checkbox1 = driver.findElement(By.xpath("(//input[@type = 'checkbox'])[1]"));
		if(checkbox1.isEnabled()) {
			checkbox1.click();
		}
		
		WebElement rdbutton = driver.findElement(By.xpath("//input[@value='blue']"));
		rdbutton.click();
		 
		 
	}
	
}


