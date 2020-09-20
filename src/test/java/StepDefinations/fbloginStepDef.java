package StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.fblogin_pageFactory;
import pages.fblogin_pageObjectModelPOM;

public class fbloginStepDef {
	
	WebDriver driver = null;
	
	//fblogin_pageObjectModelPOM fbpage; //Just Comment This so Page Factory design will work viceVersa
	fblogin_pageFactory fbpage;
	
	
	@Given("^User is in the facebook login page$")
	public void user_is_in_the_facebook_login_page() throws Throwable {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("https://www.facebook.com");
	    driver.manage().window().maximize();
	    
	}

	@And("^User enter user name$")
	public void user_enter_user_name() throws Throwable {
		//fbpage = new fblogin_pageObjectModelPOM(driver); //Just Comment This so Page Factory design will work viceVersa
		fbpage = new fblogin_pageFactory(driver);
		fbpage.inputuserName("Admin");
	}

	@And("^User enter password$")
	public void user_enter_password() throws Throwable {
		fbpage.inputPassword("Admin123");

	}

	@Then("^User click the login button$")
	public void user_click_the_login_button() throws Throwable {
		fbpage.clickLoginBtn();

	}

}
