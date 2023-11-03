@WarehouseTest

Feature: MSA Report Tests
This feature includes MSA Report tests using RESTFul services

@MSAReportTest
 Scenario: TC-01 Download MSA
Given I send a Get request for MSA Report from "Download MSA" and capture the response body
When The order request response for MSA Report from has a '200' response code
Then the response body for MSA Report should contain key "type" with value "success"