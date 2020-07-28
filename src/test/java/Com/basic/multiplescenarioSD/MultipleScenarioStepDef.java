package Com.basic.multiplescenarioSD;

import java.sql.Driver;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleScenarioStepDef {
 
	WebDriver driver;
	
	@Given("^User need to be on facebook login page$")     //^ and $ so that it will match exactly with feature file
	public void user_need_to_be_on_facebook_login_page() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
	}
	@When("^User enter user first name$")
	public void user_enter_user_first_name() throws InterruptedException {
		driver.findElement(By.cssSelector("input#u_0_m")).sendKeys("David");
        Thread.sleep(1000);
	}
	
	@Then("^User checks user first name is present$")
	public void user_checks_user_first_name_is_present() throws Throwable {
	
	String userNameActual=driver.findElement(By.cssSelector("input#u_0_m")).getAttribute("value");
	Assert.assertEquals("David",userNameActual ); //take object
	 Thread.sleep(1000);
	 
	}
	
	@When("^User enters user lastname$")
	public void user_enters_user_lastname() throws Throwable {
		 driver.findElement(By.xpath("//input[@id='u_0_o']")).sendKeys("Rogers");
		 Thread.sleep(1000);
		 
	 }
	
	 @Then("^User mobile fields should be blank$")
	 public void user_mobile_fields_should_be_blank() {
		 String mobileActual =driver.findElement(By.xpath("//input[@id='u_0_r']")).getAttribute("value");
			Assert.assertEquals("", mobileActual );
	 }
	 @Then("close browser")
	 public void close_browser() {
		 driver.quit();
		 driver=null;
	 }
	 
}
