package com.stepdefinition.monitor;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.BasePage;
import com.pages.MonitorsPage;
import com.utility.ScreenShot;
import com.wrapperclass.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Monitor_TC extends BaseClass {
	MonitorsPage monitorpage;
	BasePage basePage;
	ScreenShot screenShot;
	WebDriver driver = null;
	final static Logger logger = LogManager.getLogger(Monitor_TC.class.getName());

	@Given("^user click on monitor$")
	public void user_click_on_monitor() throws Throwable {

		driver = launchApplication("chrome");
		logger.info("Demoblaze site launches");
		launchSite();
	 	screenShot =new ScreenShot(driver);
		basePage = new BasePage(driver);
		monitorpage = new MonitorsPage(driver);
		logger.info("Click on monitor");
		monitorpage.monitor();
	}

	@Then("^user click on dersired monitor$")
	public void user_click_on_dersired_monitor() throws Throwable {
		Thread.sleep(3000);
		logger.info("Slect a monitor");
		monitorpage.selectMonitor();
	}

	@Then("^456user click on add to cart$")
	public void user_click_on_add_to_cart() throws Throwable {
		Thread.sleep(5000);
		logger.info("Add monitor to cart");
		monitorpage.cart();
	}

	@Then("^456handle window alert$")
	public void handle_window_alert() throws Throwable {
		Thread.sleep(5000);
		logger.warn("Window Alert");
		windowAlert();
	}

	@Then("^456click on cart page$")
	public void click_on_cart_page() throws Throwable {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		basePage.cart();
		Thread.sleep(3000);
		screenShot.takeSnapShot("C:\\Users\\segus\\eclipse-workspace\\demoblaze\\src\\test\\resources\\Screenshot\\Monitor.png");
		quit();
	}

}
