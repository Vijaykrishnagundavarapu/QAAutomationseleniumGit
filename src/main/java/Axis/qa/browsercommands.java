package Axis.qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class browsercommands 
{
	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gvija\\Downloads\\chromedriver-win64\\chromedriver-win64/chromedriver.exe");

		 WebDriver driver = new ChromeDriver();
		
		//getpageurl
		driver.get("https://automationexercise.com/");
		//get page title
		String title = getTitle();
		System.out.println(title);
		
		//getcurrentURL
		String currenturl = getCurrentUrl();
		System.out.println(currenturl);
		//pagesorce
		String pagesource = getPageSource();
		System.out.println(pagesource);
		//close 
		driver.close();
		
		
		
		
	}

	private static String getPageSource() {
		// TODO Auto-generated method stub
		return null;
	}

	private static String getCurrentUrl() {
		// TODO Auto-generated method stub
		return null;
	}

	private static String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}


}
