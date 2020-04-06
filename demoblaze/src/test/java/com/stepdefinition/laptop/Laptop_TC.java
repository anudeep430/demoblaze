package com.stepdefinition.laptop;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;


import com.pages.BasePage;
import com.pages.LaptopsPage;
import com.utility.ScreenShot;
import com.wrapperclass.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Laptop_TC extends BaseClass {
	WebDriver driver=null;
	ScreenShot screenShot;
	LaptopsPage laptopPage;
	BasePage basePage;
	final static Logger logger = LogManager.getLogger(Laptop_TC.class.getName());

	   @Given("^user click on laptop$")
	    public void user_click_on_laptop() throws Throwable {
		   
		   driver=launchApplication("chrome");
		   logger.info("Demoblaze site launches");
			launchSite();
			laptopPage = new LaptopsPage(driver);
		   	basePage = new BasePage(driver);
		   	screenShot =new ScreenShot(driver);
		   	logger.info("Click on laptop");
			laptopPage.laptop();
			
	    }  

	    @Then("^user click on desired laptop$")
	    public void user_click_on_desired_laptop() throws Throwable {
	        Thread.sleep(5000);
	        logger.info("Select laptop");
	    	laptopPage.selectLaptop();
	    }

	    @Then("^abcuser click on add to cart$")
	    public void user_click_on_add_to_cart() throws Throwable {
	    	 Thread.sleep(3000);
	    	 logger.info("Add product to cart");
	    	laptopPage.cart();
	    }

	    @Then("^abchandle window alert$")
	    public void handle_window_alert() throws Throwable {
	    	 Thread.sleep(5000);
	    	 logger.warn("Window alert");
	    	 windowAlert();
	    }

	    @Then("^abcclick on cart page$")
	    public void click_on_cart_page() throws Throwable {
	     	basePage.cart();
	     	Thread.sleep(3000);
	     	screenShot.takeSnapShot("C:\\Users\\segus\\eclipse-workspace\\demoblaze\\src\\test\\resources\\Screenshot\\Laptop.png");
	        quit();
	        }

}
