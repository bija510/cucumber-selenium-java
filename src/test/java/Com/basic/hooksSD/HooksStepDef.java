package Com.basic.hooksSD;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.fbSignUpPage;

public class HooksStepDef {

	WebDriver driver = null;
	fbSignUpPage fb;

	@Before(order = 1)
	public void beforeSetup1() {
		System.out.println("in before1");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	@Before(order = 2)
	public void beforeSetup2() {
		System.out.println("in before2");
	}

	@Given("^User need to be on facebook login page$")
	public void user_need_to_be_on_facebook_login_page() throws InterruptedException {
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(1000);
	}

	@When("^User enter user \"([^\"]*)\" first name$")
	public void user_enter_user_first_name(String userName) throws InterruptedException {
		fb = new fbSignUpPage(driver);
		fb.setFirstName(userName);
	}

	@Then("^User checks user \"([^\"]*)\" first name is present$")
	public void user_checks_user_first_name_is_present(String userName) throws InterruptedException {
		String userNameActual = fb.getFirstNameTxtAttribute();
		Assert.assertEquals(userName, userNameActual);
		Thread.sleep(1000);

	}

	@When("^User enter user \"([^\"]*)\" lastname$")
	public void user_enters_user_first_name(String lastName) throws InterruptedException { // s
		fb.setLastName(lastName);
		Thread.sleep(1000);
	}

	@Then("User mobile fields should be blank")
	public void user_mobile_fields_should_be_blank() {
		String mobileActual = fb.getMobileNumAttribute();
		Assert.assertEquals("", mobileActual);
	}

//	 @Then("close browser")
//	 public void close_browser() {
//		 driver.quit();
//		 driver=null;
//	 }
	@After(order = 2) // Multiple hook in rare senerio
	public void tearDown1() {
		System.out.println("in After1");
		driver.quit();
		driver = null;
	}

	@After(order = 1)
	public void tearDown2() {
		System.out.println("in After2");

	}
}
