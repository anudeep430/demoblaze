package com.pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlaceOrder {
	@FindBy(xpath="//button[@class='btn btn-success']")
	WebElement placeOrder;
	@FindBy(id="name")
	WebElement nameElement;
	@FindBy(id="country")
	WebElement countryElement;
	@FindBy(id="city")
	WebElement cityElement;
	@FindBy(id="card")
	WebElement card;
	@FindBy(id="month")
	WebElement month;
	@FindBy(id="year")
	WebElement year;
	@FindBy(xpath="//button[contains(text(),'Purchase')]")
	WebElement purchase;
	@FindBy(xpath="//button[@class='confirm btn btn-lg btn-primary']")
	WebElement confirmOrder;
public PlaceOrder(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
//TO click on place order
public void order() {
	placeOrder.click();
}
//Enter name
public void name() {
	nameElement.sendKeys("user");
}
//Enter country
public void country() {
	countryElement.sendKeys("India");
}
//Enter city
public void city() {
	cityElement.sendKeys("Chennai");
}
//Enter Credit Card number
public void creditCard() {
	card.sendKeys("2154");
}
//Enter month
public void month() {
	month.sendKeys("xmonth");
}
//Enter year
public void year() {
	year.sendKeys("1987");
}
//To click on purchase
public void purchase() {
	
	purchase.click();
}
//To click on confirm order(i.e OK)
public void confirmOrder(){
	confirmOrder.click();
}
}
