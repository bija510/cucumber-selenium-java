package Com.basic.FirstFeatureFile;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MyFirstStepDef {

	WebDriver driver;
	
	@Given("^User need to be on facebook login page$") // ^ and $ so that it will match exactly with feature file
	public void user_need_to_be_on_facebook_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println("opening URL");
	}
	
	
	@When("^User enter user first name$")
	public void user_enter_user_first_name() {
		WebElement firstName = driver.findElement(By.cssSelector("input#u_0_m"));
		firstName.sendKeys("David");

	}

	@Then("^User checks user first name is present$")
	public void user_checks_user_first_name_is_present() {
		String actName = driver.findElement(By.cssSelector("input#u_0_m")).getAttribute("value");
		Assert.assertEquals("David", actName);
	}
	
		

}
