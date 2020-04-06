package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
	@FindBy(id="signin2")
	WebElement signupBtn;
	@FindBy(id="sign-username")
	WebElement userElement;
	@FindBy(id="sign-password")
	WebElement passwordElement;
	@FindBy(xpath="//button[contains(text(),'Sign up')]")
	WebElement signup;
	public SignUpPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	//To click  on signup button
	public void signUpBtn() {
		signupBtn.click();
	}
	//Enter username
	public void setUserName(String username) {
		userElement.sendKeys(username);
	}
	//Enter password
	public void setPassword(String password) {
		passwordElement.sendKeys(password);
	}
	//To click on signup
	public void signUp() {
		signup.click();
	}
}