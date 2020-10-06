package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fbSignUpPage {

	WebDriver driver;
	
	public fbSignUpPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css ="input[id='u_0_n']")
	WebElement FirstNametxtBx;
	
	@FindBy(css ="input[id='u_0_p']")
	WebElement lastNameTxt;

	@FindBy(css ="input[id='u_0_s']")
	WebElement mobileNumTxt;
	
	public void setFirstName(String firstName) {
		FirstNametxtBx.sendKeys(firstName);
	}
	
	public String getFirstNameTxtAttribute() {
		return FirstNametxtBx.getAttribute("value");		 
	}

	public void setLastName(String lastName) {
		lastNameTxt.sendKeys(lastName);		
	}
	
	public void setMobileNum(String mobileNum) {
		lastNameTxt.sendKeys(mobileNum);		
	}
	
	public String getMobileNumAttribute() {
		return mobileNumTxt.getAttribute("value");		
	}
	
}
