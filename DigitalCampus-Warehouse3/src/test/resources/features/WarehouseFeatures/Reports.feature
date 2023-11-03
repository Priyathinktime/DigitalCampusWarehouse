@WarehouseTest

Feature: Reports Tests
This feature includes Reports tests using RESTFul services


@ReportsTest
 Scenario: TC-01 get suppliers report
Given I send a Get request for Reports from "get suppliers report" and capture the response body
When The order request response for Reports from has a '200' response code


@ReportsTest
 Scenario: TC-02 get inventory-pricing report
Given I send a Get request for Reports from "get inventory-pricing report" and capture the response body
When The order request response for Reports from has a '200' response code


@ReportsTest
 Scenario: TC-03 get inventory-pricing-report-update-columns
Given I send a Get request for Reports from "get inventory-pricing-report-update-columns" and capture the response body
When The order request response for Reports from has a '200' response code
Then the response body for Reports should contain key "type" with value "success"

@ReportsTest
 Scenario: TC-04 update inventory pricing report
Given I send a Put request for Reports from "update inventory pricing report.json" and capture the response body
When The order request response for Reports from has a '201' response code
Then the response body for Reports should contain key "type" with value "success"

@ReportsTest
 Scenario: TC-05 get inventory price code
Given I send a Get request for Reports from "get inventory price code" and capture the response body
When The order request response for Reports from has a '200' response code
Then the response body for Reports should contain key "type" with value "success"

@ReportsTest
 Scenario: TC-06 WAR-88 update inventory price code
Given I send a Put request for Reports from "update inventory price code.json" and capture the response body
When The order request response for Reports from has a '201' response code
Then the response body for Reports should contain key "type" with value "success"

@ReportsTest
 Scenario: TC-07 get inventory pricing statistics
Given I send a Get request for Reports from "get inventory pricing statistics" and capture the response body
When The order request response for Reports from has a '200' response code

@ReportsTest
 Scenario: TC-08 get customers report
Given I send a Get request for Reports from "get customers report" and capture the response body
When The order request response for Reports from has a '200' response code
Then the response body for Reports should contain key "type" with value "success"

@ReportsTest
 Scenario: TC-09 get customers statistics report
Given I send a Get request for Reports from "get customers statistics report" and capture the response body
When The order request response for Reports from has a '200' response code


@ReportsTest
 Scenario: TC-10 get PO Analysis
Given I send a Get request for Reports from "get PO Analysis" and capture the response body
When The order request response for Reports from has a '200' response code
Then the response body for Reports should contain key "type" with value "success"

@ReportsTest 
 Scenario: TC-11 get customer route report
Given I send a Get request for Reports from "get customer route report" and capture the response body
When The order request response for Reports from has a '200' response code


@ReportsTest
 Scenario: TC-12 get paymets report
Given I send a Get request for Reports from "get paymets report" and capture the response body
When The order request response for Reports from has a '200' response code
Then the response body for Reports should contain key "type" with value "success"

@ReportsTest
 Scenario: TC-13 get sales history report
Given I send a Get request for Reports from "get sales history report" and capture the response body
When The order request response for Reports from has a '200' response code
Then the response body for Reports should contain key "type" with value "success"

@ReportsTest
 Scenario: TC-14 get sales highest
Given I send a Get request for Reports from "get sales highest" and capture the response body
When The order request response for Reports from has a '200' response code


@ReportsTest
 Scenario: TC-15 sales-report-items
Given I send a Get request for Reports from "sales-report-items" and capture the response body
When The order request response for Reports from has a '200' response code
Then the response body for Reports should contain key "type" with value "success"

@ReportsTest
 Scenario: TC-16 get purchases report
Given I send a Get request for Reports from "get purchases report" and capture the response body
When The order request response for Reports from has a '200' response code


@ReportsTest
 Scenario: TC-17 get customer balance statement
Given I send a Get request for Reports from "get customer balance statement" and capture the response body
When The order request response for Reports from has a '200' response code
Then the response body for Reports should contain key "type" with value "success"

@ReportsTest
 Scenario: TC-18 purchases get polineItems
Given I send a Get request for Reports from "purchases get polineItems" and capture the response body
When The order request response for Reports from has a '200' response code
Then the response body for Reports should contain key "type" with value "success"

@ReportsTest
 Scenario: TC-19 sales invoice line items
Given I send a Get request for Reports from "sales invoice line items" and capture the response body
When The order request response for Reports from has a '200' response code


@ReportsTest
 Scenario: TC-20 return sales
Given I send a Get request for Reports from "return sales" and capture the response body
When The order request response for Reports from has a '200' response code
Then the response body for Reports should contain key "type" with value "success"
