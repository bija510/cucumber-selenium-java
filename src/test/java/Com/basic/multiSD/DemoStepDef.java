package Com.basic.multiSD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.fbSignUpPage;

public class DemoStepDef {

	
WebDriver driver=null;
fbSignUpPage fb;

	@Given("^User need to be on demo site page$")     //^ and $ so that it will match exactly with feature file
	public void user_need_to_be_on_demo_site_page() throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		Thread.sleep(1000);
	  }
	@When("^User enters first name$")
	public void User_enters_first_name() {
		fb = new fbSignUpPage(driver);
		fb.setFirstName("Tom");
	
   } 

	@When("^User enters last name$")
	public void User_enters_last_name() throws InterruptedException {
		fb = new fbSignUpPage(driver);
		fb.setFirstName("Johnson");
		driver.quit();
 }
	
    }
 

