$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/Project/cookandchefBDDframework/src/main/java/Features/login.feature");
formatter.feature({
  "line": 1,
  "name": "cook and chef Login feature",
  "description": "",
  "id": "cook-and-chef-login-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 3,
      "value": "#Scenario: cook and chef Login scenario"
    },
    {
      "line": 4,
      "value": "#Given user is already on login Page"
    },
    {
      "line": 5,
      "value": "#When title of login page is Login Title"
    },
    {
      "line": 6,
      "value": "#Then user enters username \"Test@yopmail.com\" and enters password \"Welcome1@\""
    },
    {
      "line": 7,
      "value": "#Then user clicks on login button"
    },
    {
      "line": 8,
      "value": "#Then user is on homepage"
    }
  ],
  "line": 10,
  "name": "cook and chef Login scenario",
  "description": "",
  "id": "cook-and-chef-login-feature;cook-and-chef-login-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 11,
  "name": "user is already on login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "title of login page is Login Title",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user enters username \"\u003cusername\u003e\" and enters password \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user is on homepage",
  "keyword": "Then "
});
formatter.examples({
  "line": 17,
  "name": "",
  "description": "",
  "id": "cook-and-chef-login-feature;cook-and-chef-login-scenario;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 18,
      "id": "cook-and-chef-login-feature;cook-and-chef-login-scenario;;1"
    },
    {
      "cells": [
        "Test@yopmail.com",
        "Welcome1@"
      ],
      "line": 19,
      "id": "cook-and-chef-login-feature;cook-and-chef-login-scenario;;2"
    },
    {
      "cells": [
        "test123@yopmail.com",
        "Welcome1@"
      ],
      "line": 20,
      "id": "cook-and-chef-login-feature;cook-and-chef-login-scenario;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 19,
  "name": "cook and chef Login scenario",
  "description": "",
  "id": "cook-and-chef-login-feature;cook-and-chef-login-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 11,
  "name": "user is already on login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "title of login page is Login Title",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user enters username \"Test@yopmail.com\" and enters password \"Welcome1@\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user is on homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefination.user_is_already_on_login_Page()"
});
formatter.result({
  "duration": 9808274100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.title_of_login_page_is_Login_Title()"
});
formatter.result({
  "duration": 1486297600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test@yopmail.com",
      "offset": 22
    },
    {
      "val": "Welcome1@",
      "offset": 61
    }
  ],
  "location": "LoginStepDefination.user_enters_username_and_enters_password(String,String)"
});
formatter.result({
  "duration": 287247400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 3617507400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_is_on_homepage()"
});
formatter.result({
  "duration": 1618289800,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "cook and chef Login scenario",
  "description": "",
  "id": "cook-and-chef-login-feature;cook-and-chef-login-scenario;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 11,
  "name": "user is already on login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "title of login page is Login Title",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user enters username \"test123@yopmail.com\" and enters password \"Welcome1@\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user is on homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefination.user_is_already_on_login_Page()"
});
formatter.result({
  "duration": 9967002800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.title_of_login_page_is_Login_Title()"
});
formatter.result({
  "duration": 937696000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test123@yopmail.com",
      "offset": 22
    },
    {
      "val": "Welcome1@",
      "offset": 64
    }
  ],
  "location": "LoginStepDefination.user_enters_username_and_enters_password(String,String)"
});
formatter.result({
  "duration": 221067300,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 1728806900,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_is_on_homepage()"
});
formatter.result({
  "duration": 14974800,
  "error_message": "junit.framework.ComparisonFailure: expected:\u003cCookandChef[ | Cook Dashboard]\u003e but was:\u003cCookandChef[]\u003e\r\n\tat junit.framework.Assert.assertEquals(Assert.java:100)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:107)\r\n\tat stepDefination.LoginStepDefination.user_is_on_homepage(LoginStepDefination.java:58)\r\n\tat ✽.Then user is on homepage(E:/Project/cookandchefBDDframework/src/main/java/Features/login.feature:15)\r\n",
  "status": "failed"
});
});