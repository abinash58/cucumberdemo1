$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/Project/cookandchefBDDframework/src/main/java/Features/login_dataTable.feature");
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
        "Test@yopmail.com",
        "Welcome1@"
      ],
      "line": 6
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user is on homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefination_dataTable.user_is_already_on_login_Page()"
});
formatter.result({
  "duration": 11704909200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination_dataTable.title_of_login_page_is_Login_Title()"
});
formatter.result({
  "duration": 1014637500,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination_dataTable.user_enters_username_and_enters_password(DataTable)"
});
formatter.result({
  "duration": 234893700,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination_dataTable.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 3708720500,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination_dataTable.user_is_on_homepage()"
});
formatter.result({
  "duration": 1186011700,
  "status": "passed"
});
});