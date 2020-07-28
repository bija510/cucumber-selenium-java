package Com.basic.sharedataSD;

import java.sql.Driver;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ShareDataStepDef {
 
	WebDriver driver;
	public ShareDataStepDef(ShareClass share) {
		driver= share.setup();
	}
	
	@Given("^User need to be on facebook login page$")     //^ and $ so that it will match exactly with feature file
	public void user_need_to_be_on_facebook_login_page() throws InterruptedException {
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
	}
	@When("^User enter user \"([^\"]*)\" first name$")
	public void user_enter_user_first_name(String userName) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='u_0_m']")).sendKeys(userName);
        Thread.sleep(1000);
	} 
	
}

