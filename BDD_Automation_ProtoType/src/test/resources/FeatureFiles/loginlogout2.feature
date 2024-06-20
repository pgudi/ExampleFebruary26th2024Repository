#Author: 
#User Story Name:
#User Story No:
#Scenario Names:
#Testcase Name:
#Testcase Id:
#Description:
@Run
Feature: Verify login and logout functionalities

Scenario: Verify login functionality
Given I launch chrome Browser
And I navigate url of the application
And I find the login page
When I login and logout from application
|username|password|
|admin|manager|
|admin|manager|
|admin|manager|
And I close chrome browser

