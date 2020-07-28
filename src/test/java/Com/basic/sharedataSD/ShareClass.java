package Com.basic.sharedataSD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ShareClass {

	WebDriver driver;
	
	@Before
	public WebDriver setup() {
		
		if(driver==null) {
			WebDriverManager.chromedriver().setup();
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
