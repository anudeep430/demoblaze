package com.stepdefinition.signup;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;


import com.pages.SignUpPage;
import com.stepdefinition.login.Login_TC;
import com.utility.DataDriven;
import com.utility.ScreenShot;
import com.wrapperclass.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class SignUp_TC extends BaseClass{
	WebDriver driver=null;
	SignUpPage signUp;
	ScreenShot screenShot;
	DataDriven dataDriven;
	final static Logger logger = LogManager.getLogger(Login_TC.class.getName());

	
	@Given("^user clicks on signup button$")
    public void user_clicks_on_signup_button() throws Throwable {
    	driver=launchApplication("chrome");
    	logger.info("Demoblaze site launches");
		launchSite();
		signUp = new SignUpPage(driver); 
	 	screenShot =new ScreenShot(driver);
	 	dataDriven = new DataDriven();
	   	signUp.signUpBtn();
    }

    @Then("^user enters (.+) and (.+)$")
    public void user_enters_and(String username, String password) throws Throwable {
        Thread.sleep(3000);
        logger.trace("Fill with valid credentials");
    	signUp.setUserName(dataDriven.excel_username(1));
        signUp.setPassword(dataDriven.excel_password(1));
        
    }

    @Then("^click on signup$")
    public void click_on_signup() throws Throwable {
    	logger.info("Signup");
        signUp.signUp();
        Thread.sleep(5000);
        logger.warn("Window Alert");
        windowAlert();
        quit();
        
    }

}
