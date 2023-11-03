@WarehouseTest
@DepartmentsTest
Feature: Departments Tests
This feature includes Departments tests using RESTFul services

Scenario: TC-01 Create Department
Given I send a POST request for Departments with the request body from "Create Department.json" and capture the response body
When The order request response for Departments has a '200' response code
Then the response body for Departments should contain key "type" with value "success"

Scenario: TC-02 Update Department
Given I send a PUT request for Departments with the request body from "Update Department.json" and capture the response body
When The order request response for Departments has a '200' response code
Then the response body for Departments should contain key "type" with value "success"

Scenario: TC-03 Fetch all departments
 Given I send a GET request for Departments from "Fetch all departments" and capture the response body
When The order request response for Departments has a '200' response code
Then the response body for Departments should contain key "type" with value "success"

 Scenario: TC-04 Delete Department
 Given I send a DELETE request for Departments from "Delete Department" and capture the response body
When The order request response for Departments has a '200' response code
Then the response body for Departments should contain key "type" with value "success"