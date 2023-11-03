@WarehouseTest

Feature: Tax Detail Tests
This feature includes Tax Detail tests using RESTFul services

@TaxDetailTest
 Scenario: TC-01 Create/Updated Tax detail
Given I send a Post request for Tax Detail from "Create/Updated Tax detail.json" and capture the response body
When The order request response for Tax Detail from has a '200' response code
Then the response body for Tax Detail should contain key "type" with value "success"

@TaxDetailTest
 Scenario: TC-02 Get Tax Detail
Given I send a Get request for Tax Detail from "Get Tax Detail" and capture the response body
When The order request response for Tax Detail from has a '200' response code
Then the response body for Tax Detail should contain key "type" with value "success"
