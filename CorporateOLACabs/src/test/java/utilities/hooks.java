package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooks {

	public static WebDriver driver;
	
	
	@Before
		public static WebDriver beforeScenario() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Laptop Data\\Project\\Training SDET\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		return driver;
	}
	
	@After
		public static void afterScenario() {
		driver.quit();
	}
	
	
	
}
