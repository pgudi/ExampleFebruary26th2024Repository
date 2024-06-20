#Author: 
#User Story Name:
#User Story No:
#Scenario Names:
#Testcase Name:
#Testcase Id:
#Description:

Feature: Verify login and logout functionalities

Scenario: Verify login functionality
Given I launch chrome Browser
And I navigate url of the application
And I find the login page
When I enter username in username text field
And I enter password in password text field
And I click on login button in login page
And I minimize the flyout window
Then I find the home page

Scenario: Verify logout functionality
Given I find the home page
When I click on logout link
Then I find the login page
And I close chrome browser

