Feature: cook and chef Login feature

  #Scenario: cook and chef Login scenario
  #Given user is already on login Page
  #When title of login page is Login Title
  #Then user enters username "Test@yopmail.com" and enters password "Welcome1@"
  #Then user clicks on login button
  #Then user is on homepage
  
  Scenario Outline: cook and chef Login scenario
    Given user is already on login Page
    When title of login page is Login Title
    Then user enters username "<username>" and enters password "<password>"
    Then user clicks on login button
    Then user is on homepage

    Examples: 
      | username            | password  |
      | Test@yopmail.com    | Welcome1@ |
      | test123@yopmail.com | Welcome1@ |
      
  #Scenario: cook and chef Sucessful LogOut
    #When user is on homepage
    #Then user clicks on logout button
    #Then message displayed LogOut Sucessfully