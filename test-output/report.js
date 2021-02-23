$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/Project/cookandchefBDDframework/src/main/java/Features/login_mapdata.feature");
formatter.feature({
  "line": 1,
  "name": "cook and chef Login feature",
  "description": "",
  "id": "cook-and-chef-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "cook and chef Login scenario",
  "description": "",
  "id": "cook-and-chef-login-feature;cook-and-chef-login-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "user is already on login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "title of login page is Login Title",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user enters username  and enters password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 6
    },
    {
      "cells": [
        "Test@yopmail.com",
        "Welcome1@"
      ],
      "line": 7
    },
    {
      "cells": [
        "test123@yopmail.com",
        "Welcome1@"
      ],
      "line": 8
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user is on homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefination_withmap.user_is_already_on_login_Page()"
});
formatter.result({
  "duration": 11720886600,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination_withmap.title_of_login_page_is_Login_Title()"
});
formatter.result({
  "duration": 1946971800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination_withmap.user_enters_username_and_enters_password(DataTable)"
});
formatter.result({
  "duration": 520460300,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination_withmap.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 482962900,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination_withmap.user_is_on_homepage()"
});
formatter.result({
  "duration": 5312700,
  "error_message": "junit.framework.ComparisonFailure: expected:\u003cCookandChef[ | Cook Dashboard]\u003e but was:\u003cCookandChef[]\u003e\r\n\tat junit.framework.Assert.assertEquals(Assert.java:100)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:107)\r\n\tat stepDefination.LoginStepDefination_withmap.user_is_on_homepage(LoginStepDefination_withmap.java:59)\r\n\tat ✽.Then user is on homepage(E:/Project/cookandchefBDDframework/src/main/java/Features/login_mapdata.feature:10)\r\n",
  "status": "failed"
});
});