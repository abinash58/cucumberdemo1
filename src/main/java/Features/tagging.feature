@FunctionalTest
Feature: Tag feture cases 

@SmokeTest @Regression
Scenario: Login with correct username & correct password 
	Given This is a valid login case 

@SmokeTest
Scenario: Login with incorrect username & correct password 
	Given This is a invalid login case 
@Regression	
Scenario: Create a contact 
	Given This is a contact case 

@SmokeTest @Regression
Scenario: Create a deal 
	Given This is a deal test case 
@Regression
Scenario: Create a Task 
	Given This is a Task test case 
@SmokeTest	
Scenario: Create a case 
	Given This is a case test case 

@SmokeTest @Regression
Scenario: Verify left pannel links 
	Given Click on left pannel link 

@SmokeTest @Regression
Scenario: Search a deal 
	Given This search deal test 
	
@SmokeTest @Regression
Scenario: Search a contact 
	Given This search contact test 
@SmokeTest @Regression
Scenario: Search a case 
	Given This search case test 
@SmokeTest @Regression	
Scenario: Search a task 
	Given This search task test 
@SmokeTest @E2E	
Scenario: Search a call 
	Given This search call test 
@SmokeTest @E2E		
Scenario: Search a email 
	Given This search email test 		
@SmokeTest @E2E	
Scenario: Search a docs 
	Given This search docs test 
@SmokeTest @E2E	
Scenario: Search a forms 
	Given This search forms test 
@E2E	
Scenario: validate a report
	Given This is a report test
@E2E	
Scenario: application logout 
	Given this is logout test 
	