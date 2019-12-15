package com.qa.amazon.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.amazon.base.BaseTest;
import com.qa.amazon.pages.SignInPage;

public class SignInPageTest extends BaseTest{
	SignInPage signInPage;
	
	public SignInPageTest() {
		super();
	}
	
	
	@BeforeMethod
	public void setUp() {
		initialization();
		signInPage=new SignInPage();
		
	}
@Test(priority=1)
public void verifySignInPageTitleTest() {
	String title=signInPage.verifySignInPageTitle();
	Assert.assertEquals(title, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
}

@Test(priority=2)
public void loginTest() {
	signInPage.login(prop.getProperty("mobilNumber"), prop.getProperty("password"));
}


@AfterMethod
public void tearDown() {
	driver.quit();
}
	
	
}
