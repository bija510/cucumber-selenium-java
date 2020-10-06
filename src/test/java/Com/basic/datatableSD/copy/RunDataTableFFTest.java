package Com.basic.datatableSD.copy;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(
			monochrome=true,
//			dryRun=true,					
			features={"src/test/resources/Com/basic/dataTableFF/"},					
			glue= {"Com/basic/datatableSD/"},			
			plugin = {"pretty",
					"html:target/cucumber-htmlreport", 
					"json:target/cucumber-report4.json",
					"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport3.html"
			}
		
			)
	
	public class RunDataTableFFTest {
	
}
