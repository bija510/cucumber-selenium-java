package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class fblogin_pageObjectModelPOM {
	WebDriver driver;

	public fblogin_pageObjectModelPOM(WebDriver driver) {
		this.driver = driver;
		
		if(!driver.getTitle().equals("Facebook - Log In or Sign Up")){
			throw new IllegalStateException("---Not a facebook login page---"+ driver.getCurrentUrl());
		}
	}
	
	
	By userNameTxt_xpath = By.xpath("//input[@id='email']");
	By passwordTxt_xpath = By.xpath("//input[@id='pass']");
	By loginBtn_xpath = By.xpath("//button[@id='u_0_b']");
	
	
	public void inputuserName(String userName) {
		WebElement userNameTxt = driver.findElement(userNameTxt_xpath);
		userNameTxt.sendKeys(userName);
	}

	public void inputPassword(String password) {
		WebElement passwordTxt = driver.findElement(passwordTxt_xpath);
		passwordTxt.sendKeys(password);
	}

	public void clickLoginBtn() {
		WebElement loginBtn = driver.findElement(loginBtn_xpath);
		loginBtn.click();
	}
}
