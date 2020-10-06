package Com.basic.FirstFeatureFile;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.BaseUtil;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.fbSignUpPage;

public class MyFirstStepDef extends BaseUtil {

	private BaseUtil base;
	public MyFirstStepDef(BaseUtil base) {
		this.base = base;
	}
	fbSignUpPage signUpPage;
	
	@Given("^User need to be on facebook login page$") // ^ and $ so that it will match exactly with feature file
	public void user_need_to_be_on_facebook_login_page() {		
		base.driver.get("https://www.facebook.com/signup");
	}
	
	
	@When("^User enter user first name$")
	public void user_enter_user_first_name() {
		signUpPage = new fbSignUpPage(base.driver);	
		signUpPage.setFirstName("David");
		
	}

	@Then("^User checks user first name is present$")
	public void user_checks_user_first_name_is_present() {
		String actName = signUpPage.getFirstNameTxtAttribute();
		Assert.assertEquals("David", actName);
	}
	
}
