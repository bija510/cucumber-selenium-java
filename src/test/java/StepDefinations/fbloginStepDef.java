package StepDefinations;

import Base.BaseUtil;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.fblogin_pageFactory;
import pages.fblogin_pageObjectModelPOM;

public class fbloginStepDef extends BaseUtil{

	private BaseUtil base;
	public fbloginStepDef(BaseUtil base) {
		this.base = base;
	}
	
	//fblogin_pageObjectModelPOM fbpage; //Just Comment This so Page Factory design will work viceVersa
	fblogin_pageFactory fbpage;	
	
	@Given("^User is in the facebook login page$")
	public void user_is_in_the_facebook_login_page() {
	    base.driver.get("https://www.facebook.com");	    
	}

	@And("^User enter user name$")
	public void user_enter_user_name() {
		//fbpage = new fblogin_pageObjectModelPOM(base.driver); //Just Comment This so Page Factory design will work viceVersa
		fbpage = new fblogin_pageFactory(base.driver);
		fbpage.inputuserName("Admin");
	}

	@And("^User enter password$")
	public void user_enter_password() {
		fbpage.inputPassword("Admin123");
	}

	@Then("^User click the login button$")
	public void user_click_the_login_button() {
		fbpage.clickLoginBtn();

	}

}
