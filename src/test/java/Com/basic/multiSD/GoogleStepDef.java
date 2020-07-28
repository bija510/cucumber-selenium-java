package Com.basic.multiSD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class GoogleStepDef {

WebDriver driver=null;
	
	@Given("^User need to be on google page$")     //^ and $ so that it will match exactly with feature file
	public void user_need_to_be_on_google_page(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Bijaya Chhetri\\eclipse-workspace\\CucumberAuto\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	  }
	@When("^User enters search string$")
	public void User_enters_search_string() {
     driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium");
	
   } 
    }
 