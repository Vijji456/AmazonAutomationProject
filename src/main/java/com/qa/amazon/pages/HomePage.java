package com.qa.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.amazon.base.BaseTest;
import com.qa.amazon.util.TestUtil;

public class HomePage extends BaseTest{
	
	@FindBy(xpath="//span[@class='nav-sprite nav-logo-base']")WebElement amazonLogo;
	
	@FindBy(id="twotabsearchtextbox")WebElement searchBox;
	
	@FindBy(xpath="//input[@type='submit' and @value='Go'] ")WebElement search;
	
	@FindBy(xpath="//div[@class='rush-component']//div[@class='rush-component']"
			+ "//span[@class='a-size-medium a-color-base a-text-normal'][contains(text(),'Redmi 7A (Matte Blue, 2GB RAM, 16GB Storage)')] ")
	WebElement mobileProduct;
	
	@FindBy(id="add-to-cart-button")WebElement addToCart;
	
	@FindBy(xpath="//span[@id='nav-cart-count']")WebElement cart;
	
	@FindBy(xpath="//input[@name='proceedToCheckout']")WebElement proceed;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean verifyHomePageLogo() {
		return amazonLogo.isDisplayed();
	}
	
	public void selectProduct() {
		searchBox.sendKeys("mobiles");
		search.click();
		mobileProduct.click();
		TestUtil.switchToWindow();
		addToCart.click();
		cart.click();
		proceed.click();
	}
	
	
			

}
