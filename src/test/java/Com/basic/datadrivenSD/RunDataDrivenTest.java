package Com.basic.datadrivenSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			monochrome=true,
//			dryRun=true,					
			features={"src/test/resources/Com/basic/datadrivenFF/"},					
			glue= {"Com/basic/datadrivenSD/"},
			plugin = {"pretty",
					"html:target/cucumber-htmlreport",
					"json:target/cucumber-report3.json",
					"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport2.html"
			}
		
			)
	
	public class RunDataDrivenTest {
	
}
