package Com.basic.multiSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



	@RunWith(Cucumber.class)
	@CucumberOptions(
			monochrome=true,
//			dryRun=true,
					
			features={"src/test/resources/Com/basic/multiFF/"}, //feature file
					
			glue= {"Com/basic/multiSD/"}, //step defn
			
			plugin = {"pretty",
					"html:target/cucumber-htmlreport", // this both will help in Jenkin
					"json:target/cucumber-report8.json",
					"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport7.html"
			} 
		
			)
	
	public class RunMultiTest {
	
}
