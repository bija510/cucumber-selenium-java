package Com.basic.parameterizationSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



	@RunWith(Cucumber.class)
	@CucumberOptions(
			monochrome=true,
//			dryRun=true,
					
			features={"src/test/resources/Com/basic/parameterizationFF/"}, //feature file
					
			glue= {"Com/basic/parameterizationSD/"}, //step defn
			
			plugin = {"pretty",
					"html:target/cucumber-htmlreport", // this both will help in Jenkin
					"json:target/cucumber-report9.json",
					"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport8.html"
			}
		
			)
	
	public class RunparameterizationFFTest {
	
}
