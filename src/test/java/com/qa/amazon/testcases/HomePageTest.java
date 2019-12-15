package com.qa.amazon.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.amazon.base.BaseTest;
import com.qa.amazon.pages.HomePage;
import com.qa.amazon.pages.SignInPage;
import com.qa.amazon.util.TestUtil;

public class HomePageTest extends BaseTest {
	SignInPage signInPage;
	HomePage homePage;
	
	
	
public HomePageTest() {
	super();
}

@BeforeMethod
public void setUp() {
	initialization();
	signInPage=new SignInPage();
	homePage=new HomePage();
	
	signInPage.login(prop.getProperty("mobilNumber"), prop.getProperty("password"));
}
@Test(priority=1)
public void verifyHomePageLogoTest() {
	boolean flag = homePage.verifyHomePageLogo();
	Assert.assertTrue(flag);
}
@Test(priority=1)
public void selectProductTest() {
	homePage.selectProduct();
}
@AfterMethod
public void tearDown() {
	driver.quit();
}
}
