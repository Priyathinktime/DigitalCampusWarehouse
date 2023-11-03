@WarehouseTest
@DesignationTest
Feature: Designation Tests
This feature includes Designation tests using RESTFul services

Scenario: TC-01 Create Designation
Given I send a POST request for Designation with the request body from "Create Designation.json" and capture the response body
When The order request response for Designation has a '200' response code
Then the response body for Designation should contain key "type" with value "success"

Scenario: TC-02 Update Designation
Given I send a PUT request for Designation with the request body from "Update Designation.json" and capture the response body
When The order request response for Designation has a '200' response code
Then the response body for Designation should contain key "type" with value "success"

Scenario: TC-03 Fetch all Designations
 Given I send a GET request for Designation from "Fetch all Designations" and capture the response body
When The order request response for Designation has a '200' response code
Then the response body for Designation should contain key "type" with value "success"

 Scenario: TC-04 Delete Designation
 Given I send a DELETE request for Designation from "Delete Designation" and capture the response body
When The order request response for Designation has a '200' response code
Then the response body for Designation should contain key "type" with value "success"