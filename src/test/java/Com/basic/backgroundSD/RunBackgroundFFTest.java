package Com.basic.backgroundSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			monochrome=true,
//			dryRun=true,					
			features={"src/test/resources/Com/basic/parameterizationFF/"}, 			
			glue= {"Com/basic/parameterizationSD/"},			
			plugin = {"pretty",
					"html:target/cucumber-htmlreport", 
					"json:target/cucumber-report2.json",
					"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport1.html"
			}
		
			)
	
	public class RunBackgroundFFTest {
	
}
