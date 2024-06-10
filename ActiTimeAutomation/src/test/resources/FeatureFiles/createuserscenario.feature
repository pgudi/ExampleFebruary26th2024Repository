#Author: 
#User Story Name:
#User Story No:
#Scenario Names:
#Testcase Name:
#Testcase Id:
#Description:
@Execute
Feature: Verify create user functionalities
Scenario Outline: Verify create user functionality
Given I launch chrome Browser
And I navigate <url> of the application
And I find the login page
When I enter username in <username> text field
And I enter password in <password> text field
And I click on login button in login page
And I minimize the flyout window
Then I find the home page
When I click on Users Menu
And I click on Add Users button
And I enter firstName in <firstName> text field
And I enter lastName in <lastName> text field
And I enter email in <email> text field
And I enter username in <userusername> text field of user page
And I enter password in <userpassword> text field of user page
And I enter retype password in <userretypepassword> text field of user page
And I click on create user button
Then I find the UserList page
When I click on existing user in the user list page
And I click on delete button
And I click on ok button in the alert window
Given I find the UserList page
When I click on logout link
Then I find the login page
And I close chrome browser

Examples:
|username|password|url|firstName|lastName|email|userusername|userpassword|userretypepassword|
|admin|manager|http://localhost/login.do|demo|User1|demo@gss.com|DemoUser1|welcome1|welcome1|
|admin|manager|http://localhost/login.do|demo22|User22|demo22@gss.com|DemoUser22|welcome2|welcome2|