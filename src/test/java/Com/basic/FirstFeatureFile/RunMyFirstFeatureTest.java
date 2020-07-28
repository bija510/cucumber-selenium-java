package Com.basic.FirstFeatureFile;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



	@RunWith(Cucumber.class)
	@CucumberOptions(
			monochrome=true,
//			dryRun=true,
			features={"src/test/resources/Com/basic/FirstFeatureFileFF/"},
			glue= {"Com/basic/FirstFeatureFile/"},
			
			plugin = {"pretty",
					"html:target/cucumber-htmlreport",
					"json:target/cucumber-report5.json",
					"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport4.html"
			}
		
			)
	
	public class RunMyFirstFeatureTest {
	
}
