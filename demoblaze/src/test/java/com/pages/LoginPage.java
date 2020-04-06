package com.pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{
	@FindBy(id="login2")
	WebElement loginBtn;
	@FindBy(id="loginusername")
	WebElement usernameElement;
	@FindBy(id="loginpassword")
	WebElement passwordElement;
	@FindBy(xpath="//button[contains(text(),'Log in')]")
	WebElement login;
	@FindBy(xpath="//a[@id='logout2']")
	WebElement logout;
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	//TO click on login button in menu bar
	public void loginBtn() {
		loginBtn.click();
	}
	//To enter username
	public void setUserName(String userName)
	{
		
		usernameElement.sendKeys(userName);
	}
	//To enter password
	public void setPassword(String passWord) {
		
		passwordElement.sendKeys(passWord);
	}
	//Click on login button
	public void login() {
		login.click();
	}
	
}
