package StepDefinations;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/fblogin.feature",glue= {"StepDefinations"} ,
		monochrome=true,
		plugin = {"pretty",
				"html:target/htmlReports", // this both will help in Jenkin
				"json:target/JSONReports/report.json",
				"junit:target/JUnitReports/report.xml"
		}
	
		)


public class fbloginRunnerTest {

	
}
