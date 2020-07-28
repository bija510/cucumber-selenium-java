package Com.basic.tagsSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



	@RunWith(Cucumber.class)
	@CucumberOptions(
			monochrome=true,
//			dryRun=true,
//			tags = {"@Important"}, //all senerios will executed
//					tags = {"@Smoke"}, 
//					tags = {"@Smoke","@Regression"}, // AND Condation
					tags = {"@Smoke,@Regression"},   // OR Condation 
					
					
			features={"src/test/resources/Com/basic/tagsFF/"}, //feature file
					
			glue= {"Com/basic/tagsSD/"}, //step defn
			
			plugin = {"pretty",
					"html:target/cucumber-htmlreport", // this both will help in Jenkin
					"json:target/cucumber-report11.json",
					//this is extent Report from lecture 28
					"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport10.html"
			}
		
			)
	
	public class RunTagsTest {
	
}
