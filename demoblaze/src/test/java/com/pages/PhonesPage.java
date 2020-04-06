package com.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PhonesPage extends BasePage{
	@FindBy(xpath="//a[contains(text(),'Phones')]")
	WebElement phones;
	@FindBy(linkText="Sony xperia z5")
	WebElement mobileSelect;
	@FindBy(linkText="Add to cart")
	WebElement cart;
	
	public PhonesPage(WebDriver driver)
	{	
		super(driver);
		PageFactory.initElements(driver, this);
	}
	//TO click on mobile
	public void mobile() {
		
		phones.click();
	}
	//To click on desired mobile
	public void selectMobile() {
		mobileSelect.click();
	}
	//Add to cart
	public void cart() {
	
		cart.click();
	}
	
	
}
