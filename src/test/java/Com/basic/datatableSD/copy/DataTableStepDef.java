package Com.basic.datatableSD.copy;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.fbSignUpPage;

public class DataTableStepDef {
 
	WebDriver driver=null;
	
	@Given("^User need to be on facebook login page$")
	public void user_need_to_be_on_facebook_login_page() throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(1000);
	}
	
	 //This is from here lecture21
	 @When("Enter following data")
	 public void enter_following_data(DataTable table) throws InterruptedException {
		 fbSignUpPage fbs = new fbSignUpPage(driver);
		List<List<String>> data =table.raw();
		 
		 String values1 = data.get(0).get(0);
		 String values2 = data.get(0).get(1);
		 String values3 = data.get(0).get(2);
		 
		 String values4 = data.get(1).get(0);
		 String values5 = data.get(1).get(1);
		 String values6 = data.get(1).get(2);
		 
		 System.out.println(values4+" "+ values5);
		 
		 fbs.setFirstName(values4);
		 fbs.setLastName(values5);
		 Thread.sleep(2000);
		 driver.quit();
		 driver = null;
		 
		 
		 
}
}