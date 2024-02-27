package Axis.qa;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class praticetodolist {
	public static void main(String[] args) throws InterruptedException {
		 
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\\\gvija\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
 
		WebDriver driver = new ChromeDriver();
 
		driver.get("https://webdriveruniversity.com/To-Do-List/index.html");
 
		driver.manage().window().maximize();
		 Actions actions = new Actions(driver);
	        Thread.sleep(800);
	        WebElement removePracticeMagic = driver.findElement(By.xpath("//li[contains(text(),' Practice magic')]/span"));
	        Actions action = new Actions(driver);
	        action.moveToElement(removePracticeMagic).click().perform();

	        WebElement removeBuyNewRobes = driver.findElement(By.xpath("//li[contains(text(),' Buy new robes')]/span"));
	        Actions action1 = new Actions(driver);
	        action.moveToElement(removeBuyNewRobes).click().perform();

	        WebElement removePotionClass = driver.findElement(By.xpath("//li[contains(text(),' Go to potion class')]/span"));
	        Actions action11 = new Actions(driver);
	        action11.moveToElement(removePotionClass).click().perform();

	        WebElement addNewTodo = driver.findElement(By.xpath("//input[@placeholder='Add new todo']"));
	        addNewTodo.sendKeys("Manipal Training");
	        addNewTodo.sendKeys(Keys.ENTER);
	        addNewTodo.sendKeys("Axis Training");
	        addNewTodo.sendKeys(Keys.ENTER);
	}

}

