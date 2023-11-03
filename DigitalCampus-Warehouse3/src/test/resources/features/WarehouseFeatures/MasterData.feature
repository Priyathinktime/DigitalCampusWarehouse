@WarehouseTest

Feature: Master Data Tests
This feature includes Master Data tests using RESTFul services

@MasterDataTest
 Scenario: TC-01 war-296 get msa categories
Given I send a Get request for Master Data from "war-296 get msa categories" and capture the response body
When The order request response for Master Data from has a '200' response code
Then the response body for Master Data should contain key "type" with value "success"

@MasterDataTest
 Scenario: TC-02 war-297 get msa state categories
Given I send a Get request for Master Data from "war-297 get msa state categories" and capture the response body
When The order request response for Master Data from has a '200' response code
Then the response body for Master Data should contain key "type" with value "success"