package Com.basic.sharedataSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



	@RunWith(Cucumber.class)
	@CucumberOptions(
			monochrome=true,
//			dryRun=true,
					
			features={"src/test/resources/Com/basic/sharedataFF/"}, //feature file
					
			glue= {"Com/basic/sharedataSD/"}, //step defn
			
			plugin = {"pretty",
					"html:target/cucumber-htmlreport", // this both will help in Jenkin
					"json:target/cucumber-report10.json",
					"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport9.html"
			}
		
			)
	
	public class RunShareDataTest {
	
}
