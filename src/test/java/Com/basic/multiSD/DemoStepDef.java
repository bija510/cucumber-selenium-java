package Com.basic.multiSD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class DemoStepDef {

	
WebDriver driver=null;
	
	@Given("^User need to be on demo site page$")     //^ and $ so that it will match exactly with feature file
	public void user_need_to_be_on_demo_site_page() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Bijaya Chhetri\\eclipse-workspace\\CucumberAuto\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		Thread.sleep(1000);
	  }
	@When("^User enters first name$")
	public void User_enters_first_name() {
     driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("tom");
	
   } 

	@When("^User enters last name$")
	public void User_enters_last_name() throws InterruptedException {
   driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("jerry");
	Thread.sleep(1000);
 }
	
    }
 

