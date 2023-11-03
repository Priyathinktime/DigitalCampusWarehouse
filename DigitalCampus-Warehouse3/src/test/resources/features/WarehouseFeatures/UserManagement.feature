
@WarehouseTest
Feature: User Management Tests
This feature includes Tax Detail tests using RESTFul services

@UserManagementTest
 Scenario: TC-01 WAR-9 fetch user roles
Given I send a Get request for User Management from "WAR-9 fetch user roles" and capture the response body
When The order request response for User Management from has a '200' response code
Then the response body for UserManagement should contain key "type" with value "success"

@UserManagementTest
 Scenario: TC-02 Add User Role
Given I send a Post request for User Management from "Add User Role.json" and capture the response body
When The order request response for User Management from has a '201' response code
Then the response body for UserManagement should contain key "type" with value "success"

@UserManagementTest
 Scenario: TC-03 Update User Role
Given I send a Put request for User Management from "Update User Role.json" and capture the response body
When The order request response for User Management from has a '201' response code
Then the response body for UserManagement should contain key "type" with value "success"

@UserManagementTest
 Scenario: TC-04 Fetch user permissions by user id
Given I send a Get request for User Management from "Fetch user permissions by user id" and capture the response body
When The order request response for User Management from has a '200' response code
Then the response body for UserManagement should contain key "type" with value "success"
