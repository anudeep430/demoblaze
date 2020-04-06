$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("demoBlaze.feature");
formatter.feature({
  "line": 2,
  "name": "DemoBlaze Application testing",
  "description": "       Login and buy products",
  "id": "demoblaze-application-testing",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "line": 6,
  "name": "Login with demoblaze",
  "description": "",
  "id": "demoblaze-application-testing;login-with-demoblaze",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@TC_0"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user launches demoblaze website",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user enter \u003cusername\u003e and \u003cpassword\u003e and click on login",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "demoblaze-application-testing;login-with-demoblaze;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 13,
      "id": "demoblaze-application-testing;login-with-demoblaze;;1"
    },
    {
      "cells": [
        "user_3",
        "user1pass"
      ],
      "line": 14,
      "id": "demoblaze-application-testing;login-with-demoblaze;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "Login with demoblaze",
  "description": "",
  "id": "demoblaze-application-testing;login-with-demoblaze;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    },
    {
      "line": 5,
      "name": "@TC_0"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user launches demoblaze website",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user enter user_3 and user1pass and click on login",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "Login_TC.user_launches_demoblaze_website()"
});
formatter.result({
  "duration": 13426518200,
  "status": "passed"
});
formatter.match({
  "location": "Login_TC.user_click_on_login_button()"
});
formatter.result({
  "duration": 74757600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "user_3",
      "offset": 11
    },
    {
      "val": "user1pass",
      "offset": 22
    }
  ],
  "location": "Login_TC.user_enter_and_and_click_on_login(String,String)"
});
formatter.result({
  "duration": 11293294300,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Add phone to cart",
  "description": "",
  "id": "demoblaze-application-testing;add-phone-to-cart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 18,
      "name": "@TC_0"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "user click on phone",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "user click on the desired mobile phone",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "123user click o add to cart",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "123handle window alert",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "123click on cart page",
  "keyword": "Then "
});
formatter.match({
  "location": "Phone_TC.user_click_on_phone()"
});
formatter.result({
  "duration": 11277077200,
  "status": "passed"
});
formatter.match({
  "location": "Phone_TC.user_click_on_the_desired_mobile_phone()"
});
formatter.result({
  "duration": 5763079000,
  "status": "passed"
});
formatter.match({
  "location": "Phone_TC.user_click_o_add_to_cart()"
});
formatter.result({
  "duration": 5179801900,
  "status": "passed"
});
formatter.match({
  "location": "Phone_TC.handle_window_alert()"
});
formatter.result({
  "duration": 5025401200,
  "status": "passed"
});
formatter.match({
  "location": "Phone_TC.click_on_cart_page()"
});
formatter.result({
  "duration": 4686321300,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "Add laptop to cart",
  "description": "",
  "id": "demoblaze-application-testing;add-laptop-to-cart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 26,
      "name": "@TC_0"
    }
  ]
});
formatter.step({
  "line": 28,
  "name": "user click on laptop",
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "user click on desired laptop",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "abcuser click on add to cart",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "abchandle window alert",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "abcclick on cart page",
  "keyword": "Then "
});
formatter.match({
  "location": "Laptop_TC.user_click_on_laptop()"
});
formatter.result({
  "duration": 11054283800,
  "status": "passed"
});
formatter.match({
  "location": "Laptop_TC.user_click_on_desired_laptop()"
});
formatter.result({
  "duration": 5732227300,
  "status": "passed"
});
formatter.match({
  "location": "Laptop_TC.user_click_on_add_to_cart()"
});
formatter.result({
  "duration": 3115496000,
  "status": "passed"
});
formatter.match({
  "location": "Laptop_TC.handle_window_alert()"
});
formatter.result({
  "duration": 5019238000,
  "status": "passed"
});
formatter.match({
  "location": "Laptop_TC.click_on_cart_page()"
});
formatter.result({
  "duration": 4744517500,
  "status": "passed"
});
formatter.scenario({
  "line": 35,
  "name": "Add Monitor to cart",
  "description": "",
  "id": "demoblaze-application-testing;add-monitor-to-cart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 34,
      "name": "@TC_0"
    }
  ]
});
formatter.step({
  "line": 36,
  "name": "user click on monitor",
  "keyword": "Given "
});
formatter.step({
  "line": 37,
  "name": "user click on dersired monitor",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "456user click on add to cart",
  "keyword": "Then "
});
formatter.step({
  "line": 39,
  "name": "456handle window alert",
  "keyword": "Then "
});
formatter.step({
  "line": 40,
  "name": "456click on cart page",
  "keyword": "Then "
});
formatter.match({
  "location": "Monitor_TC.user_click_on_monitor()"
});
formatter.result({
  "duration": 11096103200,
  "status": "passed"
});
formatter.match({
  "location": "Monitor_TC.user_click_on_dersired_monitor()"
});
formatter.result({
  "duration": 3764043800,
  "status": "passed"
});
formatter.match({
  "location": "Monitor_TC.user_click_on_add_to_cart()"
});
formatter.result({
  "duration": 5116730800,
  "status": "passed"
});
formatter.match({
  "location": "Monitor_TC.handle_window_alert()"
});
formatter.result({
  "duration": 5021621400,
  "status": "passed"
});
formatter.match({
  "location": "Monitor_TC.click_on_cart_page()"
});
formatter.result({
  "duration": 4733873500,
  "status": "passed"
});
formatter.scenario({
  "line": 43,
  "name": "Purchase a product",
  "description": "",
  "id": "demoblaze-application-testing;purchase-a-product",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 42,
      "name": "@TC_0"
    }
  ]
});
formatter.step({
  "line": 44,
  "name": "user click on desired product",
  "keyword": "Given "
});
formatter.step({
  "line": 45,
  "name": "789user click on add to cart",
  "keyword": "Then "
});
formatter.step({
  "line": 46,
  "name": "handle window alert",
  "keyword": "Then "
});
formatter.step({
  "line": 47,
  "name": "789click on cart page",
  "keyword": "Then "
});
formatter.step({
  "line": 48,
  "name": "click on place order",
  "keyword": "Then "
});
formatter.step({
  "line": 49,
  "name": "fill the details",
  "keyword": "Then "
});
formatter.step({
  "line": 50,
  "name": "click on purchase",
  "keyword": "Then "
});
formatter.step({
  "line": 51,
  "name": "click on ok",
  "keyword": "Then "
});
formatter.match({
  "location": "Purchase_TC.user_click_on_desired_product()"
});
formatter.result({
  "duration": 17440838000,
  "status": "passed"
});
formatter.match({
  "location": "Purchase_TC.user_click_on_add_to_cart()"
});
formatter.result({
  "duration": 3105737300,
  "status": "passed"
});
formatter.match({
  "location": "Purchase_TC.handle_window_alert()"
});
formatter.result({
  "duration": 5018372500,
  "status": "passed"
});
formatter.match({
  "location": "Purchase_TC.click_on_cart_page()"
});
formatter.result({
  "duration": 1181524900,
  "status": "passed"
});
formatter.match({
  "location": "Purchase_TC.click_on_place_order()"
});
formatter.result({
  "duration": 5095227200,
  "status": "passed"
});
formatter.match({
  "location": "Purchase_TC.fill_the_details()"
});
formatter.result({
  "duration": 3430884700,
  "status": "passed"
});
formatter.match({
  "location": "Purchase_TC.click_on_purchase()"
});
formatter.result({
  "duration": 3099797900,
  "status": "passed"
});
formatter.match({
  "location": "Purchase_TC.click_on_ok()"
});
formatter.result({
  "duration": 8225144600,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 54,
  "name": "Signup",
  "description": "",
  "id": "demoblaze-application-testing;signup",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 53,
      "name": "@TC_0"
    }
  ]
});
formatter.step({
  "line": 55,
  "name": "user clicks on signup button",
  "keyword": "Given "
});
formatter.step({
  "line": 56,
  "name": "user enters \u003cusername\u003e and \u003cpassword\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 57,
  "name": "click on signup",
  "keyword": "Then "
});
formatter.examples({
  "line": 59,
  "name": "",
  "description": "",
  "id": "demoblaze-application-testing;signup;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 60,
      "id": "demoblaze-application-testing;signup;;1"
    },
    {
      "cells": [
        "user_6",
        "user1pass"
      ],
      "line": 61,
      "id": "demoblaze-application-testing;signup;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 61,
  "name": "Signup",
  "description": "",
  "id": "demoblaze-application-testing;signup;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    },
    {
      "line": 53,
      "name": "@TC_0"
    }
  ]
});
formatter.step({
  "line": 55,
  "name": "user clicks on signup button",
  "keyword": "Given "
});
formatter.step({
  "line": 56,
  "name": "user enters user_6 and user1pass",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 57,
  "name": "click on signup",
  "keyword": "Then "
});
formatter.match({
  "location": "SignUp_TC.user_clicks_on_signup_button()"
});
formatter.result({
  "duration": 11463673100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "user_6",
      "offset": 12
    },
    {
      "val": "user1pass",
      "offset": 23
    }
  ],
  "location": "SignUp_TC.user_enters_and(String,String)"
});
formatter.result({
  "duration": 3205041700,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_TC.click_on_signup()"
});
formatter.result({
  "duration": 9405173600,
  "status": "passed"
});
});