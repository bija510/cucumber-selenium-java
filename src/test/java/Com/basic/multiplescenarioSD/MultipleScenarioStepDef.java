package Com.basic.multiplescenarioSD;

import org.junit.Assert;
import Base.BaseUtil;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.fbSignUpPage;

public class MultipleScenarioStepDef extends BaseUtil {
 
	private BaseUtil base;
	public MultipleScenarioStepDef(BaseUtil base) {
		this.base = base;
	}
	fbSignUpPage signUpPage;
	
	@Given("^User need to be on facebook login page$")
	public void user_need_to_be_on_facebook_login_page() throws InterruptedException {		
		Thread.sleep(1000);
	}
	@When("^User enter user first name$")
	public void user_enter_user_first_name() throws InterruptedException {
		signUpPage = new fbSignUpPage(base.driver);	
		signUpPage.setFirstName("David");
	}
	
	@Then("^User checks user first name is present$")
	public void user_checks_user_first_name_is_present() throws Throwable {
		String actName = signUpPage.getFirstNameTxtAttribute();
		Assert.assertEquals("David", actName);	 
	}
	
	@When("^User enters user lastname$")
	public void user_enters_user_lastname() throws Throwable {
		signUpPage.setLastName("Johnson");		 
	 }
	
	 @Then("^User mobile fields should be blank$")
	 public void user_mobile_fields_should_be_blank() {
		String mobileActual=signUpPage.getMobileNumAttribute();
		Assert.assertEquals("", mobileActual );
	 }
	 
	 @Then("close browser")
	 public void close_browser() {
		 
	 }
	 
}
