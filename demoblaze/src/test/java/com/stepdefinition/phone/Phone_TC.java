package com.stepdefinition.phone;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



import com.pages.BasePage;

import com.pages.PhonesPage;

import com.utility.ScreenShot;
import com.wrapperclass.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Phone_TC extends BaseClass {

	PhonesPage phonePage;
	ScreenShot screenShot;
	BasePage basePage;
	final static Logger logger = LogManager.getLogger(Phone_TC.class.getName());

	 @Given("^user click on phone$")
	    public void user_click_on_phone() throws Throwable {
		 launchApplication("chrome");
		 logger.info("Demoblaze site launches");
		 launchSite();
		 
			phonePage = new PhonesPage(driver);   
			basePage=new BasePage(driver);
			screenShot =new ScreenShot(driver);
			logger.info("Click on mobile");
			phonePage.mobile();
	    }

	    @Then("^user click on the desired mobile phone$")
	    public void user_click_on_the_desired_mobile_phone() throws Throwable {
	    	Thread.sleep(5000);
	    	logger.info("Select a mobie");
	    	phonePage.selectMobile();
	    }

	    @Then("^123user click o add to cart$")
	    public void user_click_o_add_to_cart() throws Throwable {
	    	Thread.sleep(5000);
	    	logger.info("Add product to cart");
	    	phonePage.cart();
	    }

	    @Then("^123handle window alert$")
	    public void handle_window_alert() throws Throwable {
	    	Thread.sleep(5000);
	    	logger.warn("Window alert");
	    	windowAlert();
	       
	    }


	    @Then("^123click on cart page$")
	    public void click_on_cart_page() throws Throwable {
	    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    	basePage.cart();
	    	Thread.sleep(3000);
	    	screenShot.takeSnapShot("C:\\Users\\segus\\eclipse-workspace\\demoblaze\\src\\test\\resources\\Screenshot\\Phone.png");
	    	quit();
	    }
}
