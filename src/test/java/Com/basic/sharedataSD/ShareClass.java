package Com.basic.sharedataSD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class ShareClass {

	WebDriver driver;
	
	@Before
	public WebDriver setup() {
		
		if(driver==null) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Bijaya Chhetri\\eclipse-workspace\\CucumberAuto\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		
		}
		return driver;
	}
	@After
	public void teardown() {
		driver.quit();
		driver=null;
	}
}
