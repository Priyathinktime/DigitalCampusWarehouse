@WarehouseTest
@EmployeeTest
Feature: Employee Tests
This feature includes Employee tests using RESTFul services

Scenario: TC-01 Create Employee
Given I send a POST request for Employee with the request body from "Create Employee.json" and capture the response body
When The order request response for Employee has a '200' response code
Then the response body for Employee should contain key "type" with value "success"

Scenario: TC-02 Update Employee
Given I send a PUT request for Employee with the request body from "Update Employee.json" and capture the response body
When The order request response for Employee has a '200' response code
Then the response body for Employee should contain key "type" with value "success"

Scenario: TC-03 Fetch all Employees
 Given I send a GET request for Employee from "Fetch all Employees" and capture the response body
When The order request response for Employee has a '200' response code
Then the response body for Employee should contain key "type" with value "success"

 Scenario: TC-04 Delete Employee
 Given I send a DELETE request for Employee from "Delete Employee" and capture the response body
When The order request response for Employee has a '200' response code
Then the response body for Employee should contain key "type" with value "success"