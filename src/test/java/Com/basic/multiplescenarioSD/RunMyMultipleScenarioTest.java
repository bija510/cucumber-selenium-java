package Com.basic.multiplescenarioSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



	@RunWith(Cucumber.class)
	@CucumberOptions(
			monochrome=true, //this is we do to remove the junk character character
			//dryRun=true,     //this check wheather all code is correcrt for run if any error it will give you and you just fix it before run
					
			features={"src/test/resources/Com/basic/multiplescenarioFF/"}, //feature file
					
			glue= {"Com/basic/multiplescenarioSD/"}, //step defn
			
			plugin = {"pretty",
					"html:target/cucumber-htmlreport", // this both will help in Jenkin
					"json:target/cucumber-report7.json",
					"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport6.html"
			}
		
			)
	
	public class RunMyMultipleScenarioTest {
	
}
