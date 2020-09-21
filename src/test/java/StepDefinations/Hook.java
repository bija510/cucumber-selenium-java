package StepDefinations;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import Base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hook extends BaseUtil{

	private BaseUtil base;
	
	public Hook(BaseUtil base) {
		this.base = base;
	}
	
	@Before
	public void InitializeTest() {
		WebDriverManager.chromedriver().setup();
	    base.Driver = new ChromeDriver();
	    base.Driver.manage().window().maximize();
	}
	
	
	@After
	public void teardown(Scenario scenario) {
		if (scenario.isFailed()) {
			try {
				File src = ((TakesScreenshot) Driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(src, new File(
						System.getProperty("user.dir") + "//Screenshots//" + "Failed_" + scenario.getName() + ".png"));
			} catch (Exception e) {

			}
		}
		base.Driver.quit();
	}
}