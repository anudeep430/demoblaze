package com.stepdefinition.login;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.pages.LoginPage;
import com.utility.DataDriven;
import com.utility.ScreenShot;
import com.wrapperclass.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Login_TC extends BaseClass {
	WebDriver driver=null;
	LoginPage loginPage;
	ScreenShot screenShot;
	DataDriven dataDriven;
	final static Logger logger = LogManager.getLogger(Login_TC.class.getName());


	@Given("^user launches demoblaze website$")
	public void user_launches_demoblaze_website() throws Throwable {
		 driver=launchApplication("chrome");
		 logger.info("DemoBlaze is launched");
			launchSite();
		   	loginPage = new LoginPage(driver);
		   	screenShot =new ScreenShot(driver);
		   	dataDriven = new DataDriven();

	}

	@Then("^user click on login button$")
	public void user_click_on_login_button() throws Throwable {
		
		loginPage.loginBtn();
	}

	@Then("^user enter (.+) and (.+) and click on login$")
	public void user_enter_and_and_click_on_login(String username, String password) throws Throwable {
		Thread.sleep(5000);
		logger.info("Processing login with valid credentials");
		
		loginPage.setUserName(dataDriven.excel_username(1));
		loginPage.setPassword(dataDriven.excel_password(1));
		
		loginPage.login();
		Thread.sleep(5000);
		screenShot.takeSnapShot("C:\\Users\\segus\\eclipse-workspace\\demoblaze\\src\\test\\resources\\Screenshot\\Login.png");
		quit();
	}
}