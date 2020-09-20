package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fblogin_pageFactory {
	WebDriver driver;

	public fblogin_pageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this); //This is new
	}
	
	@FindBy(xpath ="//input[@id='email']")
	WebElement userNameTxt;
	
	@FindBy(xpath ="//input[@id='pass']")
	WebElement passwordTxt;
	
	@FindBy(xpath = "//button[@id='u_0_b']")
	WebElement loginBtn;
	
	
	public void inputuserName(String userName) {
		userNameTxt.sendKeys(userName);
	}

	public void inputPassword(String password) {
		passwordTxt.sendKeys(password);
	}

	public void clickLoginBtn() {
		loginBtn.click();
	}
}
