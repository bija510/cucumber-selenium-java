package Com.basic.sharedataSD;



import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ShareDataStepDef1 {
 
	WebDriver driver;
	public ShareDataStepDef1(ShareClass share) {
		driver= share.setup();
	}
	
	
	@Then("^User checks user \"([^\"]*)\" first name is present$")
	public void user_checks_user_first_name_is_present(String userName) throws InterruptedException {
	String userNameActual=driver.findElement(By.xpath("//input[@id='u_0_m']")).getAttribute("value");
	Assert.assertEquals(userName,userNameActual ); //take object
	 Thread.sleep(1000);
	}
	@When("^User enter user \"([^\"]*)\" lastname$")
	 public void user_enters_user_first_name(String lastName) throws InterruptedException { //s
		 driver.findElement(By.xpath("//input[@id='u_0_o']")).sendKeys(lastName);
		 Thread.sleep(1000);
	 }
	 @Then("User mobile fields should be blank")
	 public void user_mobile_fields_should_be_blank() {
		 String mobileActual =driver.findElement(By.xpath("//input[@id='u_0_r']")).getAttribute("value");
			Assert.assertEquals("", mobileActual );
	 }

}
