Feature: account registration feature 


Scenario Outline: cook and chef registration scenario 
	Given user is already on signup Page 
	When  user clicks on iamACook signin button
	Then user select thecooktype 
	Then user enters the name "<name>" 
	Then user enters the email "<emailAddress>" 
	Then user enters the mobile number "<mobile>" 
	Then user enters the password "<password>" and enters the confirm password "<cpassword>" 
	Then user select the gender "<gender>" 	
	Then user clicks on signup button 
	Then user enters the otp on otp page "<otp>"
	Then user clicks on otp submit button on otp verification page
	Then user is on userHomePage 
	
	Examples: 
		| name                | emailAddress            | mobile     | password | cpassword | gender |  otp   |
		| Test account        | test123q@youpmail.com   | 8542658711 | Welcome1@| Welcome1@ | Male   | 111111 |
#		| Test account        | test1235@youpmail.com   | 8574526854 | Welcome1@|Welcome1@  | Female | 111111 |
#		| Test account        | test1236@youpmail.com   | 8574522524 | Welcome1@|Welcome1@  | Female | 111111 |
#		| Test account        | test1237@youpmail.com   | 8572526854 | Welcome1@|Welcome1@  | Female | 111111 |