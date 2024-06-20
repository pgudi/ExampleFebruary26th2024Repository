#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
@Smoke
Feature: Get Employee Functionality


Scenario: Validate the Get Employee functionality
Given I provide Get Employee EndPoint
And I create RequestSpecification object
And I provide header for the request
When I run the GET Http Method
Then I get the status code as 200


Scenario Outline: Validate the Multiple Employees functionality
Given I provide Get Employee <Request> EndPoint
And I create RequestSpecification object
And I provide header for the request
When I run the GET Http Method
Then I get the status code as 200

Examples:
|Request|
|http://localhost:8082/sgtest-employee/api/v1/employees/4|
|http://localhost:8082/sgtest-employee/api/v1/employees/5|
|http://localhost:8082/sgtest-employee/api/v1/employees/1|