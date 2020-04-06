@tag
Feature: DemoBlaze Application testing
         Login and buy products

  @TC_0
  Scenario Outline: Login with demoblaze
  Given user launches demoblaze website
  Then user click on login button
  Then user enter <username> and <password> and click on login
  

    Examples: 
      | username  | password  | 
      | user_3    | user1pass | 
      


@TC_0
Scenario: Add phone to cart
Given user click on phone
Then user click on the desired mobile phone
Then 123user click o add to cart
Then 123handle window alert
Then 123click on cart page

@TC_0
Scenario: Add laptop to cart
Given user click on laptop
Then user click on desired laptop
Then abcuser click on add to cart
Then abchandle window alert
Then abcclick on cart page

@TC_0
Scenario: Add Monitor to cart
Given user click on monitor
Then user click on dersired monitor
Then 456user click on add to cart
Then 456handle window alert
Then 456click on cart page

@TC_0
Scenario: Purchase a product
Given user click on desired product
Then 789user click on add to cart
Then handle window alert
Then 789click on cart page
Then click on place order
Then fill the details
Then click on purchase
Then click on ok

@TC_0
Scenario Outline: Signup
Given user clicks on signup button
Then user enters <username> and <password>
Then click on signup

 Examples: 
      | username  | password  | 
      | user_6  | user1pass | 













