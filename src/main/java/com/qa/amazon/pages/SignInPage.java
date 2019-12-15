package com.qa.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.amazon.base.BaseTest;

public class SignInPage extends BaseTest{

	@FindBy(xpath="//div[@id='nav-flyout-ya-signin']//span[@class='nav-action-inner'][contains(text(),'Sign in')]")WebElement signIn;
	
	@FindBy(xpath="//span[contains(@class,'nav-line-2')][contains(text(),'Account & Lists')]")WebElement accountsList;
	
	@FindBy(xpath="//i[@class='a-icon a-icon-logo']")WebElement amazonLogo;
	
	@FindBy(id="ap_email")WebElement moblie;
	
	@FindBy(id="continue")WebElement Continue;
	
	@FindBy(id="ap_password")WebElement pswd;
	
	@FindBy(id="signInSubmit")WebElement loginbtn;
	
	
	public SignInPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifySignInPageTitle() {
		return driver.getTitle();
	}
	public HomePage login(String mobileNum,String password) {
		Actions action=new Actions(driver);
		action.moveToElement(accountsList).build().perform();
		signIn.click();
		moblie.sendKeys(mobileNum);
		Continue.click();
		pswd.sendKeys(password);
		loginbtn.click();
		
		return new HomePage();
		
	}
	
	
	
}