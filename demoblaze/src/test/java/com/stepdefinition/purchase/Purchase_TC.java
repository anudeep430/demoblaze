package com.stepdefinition.purchase;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;


import com.pages.BasePage;
import com.pages.PhonesPage;
import com.pages.PlaceOrder;
import com.utility.ScreenShot;
import com.wrapperclass.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Purchase_TC extends BaseClass {
	WebDriver driver=null;
	PlaceOrder placeOrder;
	PhonesPage phonePage;
	BasePage basePage;
	ScreenShot screenShot;
	final static Logger logger = LogManager.getLogger(Purchase_TC.class.getName());

	@Given("^user click on desired product$")
    public void user_click_on_desired_product() throws Throwable {
		driver= launchApplication("chrome");
		logger.info("Demoblaze site launches");
		launchSite();
		phonePage = new PhonesPage(driver);   
		basePage=new BasePage(driver);
		placeOrder = new PlaceOrder(driver);
	 	screenShot =new ScreenShot(driver);
		Thread.sleep(5000);
		logger.info("Select a product");
		phonePage.selectMobile();

    
    }

    @Then("^789user click on add to cart$")
    public void user_click_on_add_to_cart() throws Throwable {
        Thread.sleep(3000);
        logger.info("add product to cart");
    	phonePage.cart();
    	
    }

    @Then("^handle window alert$")
    public void handle_window_alert() throws Throwable {
        Thread.sleep(5000);
        logger.debug("Window Alert");
        windowAlert();
     
    }

    @Then("^789click on cart page$")
    public void click_on_cart_page() throws Throwable {
        basePage.cart();
    }

    @Then("^click on place order$")
    public void click_on_place_order() throws Throwable {
    	Thread.sleep(5000);
    	logger.info("Order product");
    	placeOrder.order();
    }

    @Then("^fill the details$")
    public void fill_the_details() throws Throwable {
    	Thread.sleep(3000);
    	logger.trace("Fill all the details");
    	placeOrder.name();
    	placeOrder.country();
    	placeOrder.city();
    	placeOrder.creditCard();
    	placeOrder.month();
    	placeOrder.year();
        
    }

    @Then("^click on purchase$")
    public void click_on_purchase() throws Throwable {
    	Thread.sleep(3000);
    	logger.info("Purchase product");
    	placeOrder.purchase();
    	
    }

    @Then("^click on ok$")
    public void click_on_ok() throws Throwable {
        Thread.sleep(2000);
        screenShot.takeSnapShot("C:\\Users\\segus\\eclipse-workspace\\demoblaze\\src\\test\\resources\\Screenshot\\Purchase.png");
    	placeOrder.confirmOrder();
    	quit();
    	
    	
      
    }
}
