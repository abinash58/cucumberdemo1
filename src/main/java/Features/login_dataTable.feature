Feature: cook and chef Login feature 
Scenario: cook and chef Login scenario 
	Given user is already on login Page 
	When title of login page is Login Title 
	Then user enters username  and enters password 
		|Test@yopmail.com|Welcome1@|
	Then user clicks on login button 
	Then user is on homepage 
	
	
      