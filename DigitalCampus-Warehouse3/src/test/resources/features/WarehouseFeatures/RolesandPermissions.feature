@WarehouseTest

Feature: Roles and Permissions Tests
This feature includes Roles and Permissions tests using RESTFul services

@RolesandPermissionsTest
 Scenario: TC-01 Fetch permissions by role
Given I send a Get request for Roles and Permissions from "Fetch permissions by role" and capture the response body
When The order request response for Roles and Permissions from has a '200' response code
Then the response body for Roles and Permissions should contain key "type" with value "success"

@RolesandPermissionsTest
 Scenario: TC-02 Fetch all Permissions
Given I send a Get request for Roles and Permissions from "Fetch all Permissions" and capture the response body
When The order request response for Roles and Permissions from has a '200' response code
Then the response body for Roles and Permissions should contain key "type" with value "success"

@RolesandPermissionsTest
 Scenario: TC-03 Create Role Permission
Given I send a Post request for Roles and Permissions from "Create Role Permission.json" and capture the response body
When The order request response for Roles and Permissions from has a '201' response code
Then the response body for Roles and Permissions should contain key "type" with value "success"