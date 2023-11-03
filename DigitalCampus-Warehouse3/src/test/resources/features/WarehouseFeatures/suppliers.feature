@WarehouseTest

Feature: suppliers Tests
This feature includes suppliers tests using RESTFul services

@suppliersTest  @supTest
 Scenario: TC-01 WAR-29 create supplier
Given I send a Post request for suppliers from "WAR-29 create supplier.json" and capture the response body
When The order request response for suppliers from has a '201' response code
Then the response body for suppliers should contain key "type" with value "success"


@suppliersTest
 Scenario: TC-02 WAR-30 fetch master All zipcodes
Given I send a Get request for suppliers from "WAR-30 fetch master All zipcodes" and capture the response body
When The order request response for suppliers from has a '200' response code
Then the response body for suppliers should contain key "type" with value "success"

@suppliersTest
 Scenario: TC-03 War-30 fetch master all zipcodes by zipcode
Given I send a Get request for suppliers from "War-30 fetch master all zipcodes by zipcode" and capture the response body
When The order request response for suppliers from has a '200' response code
Then the response body for suppliers should contain key "type" with value "success"

@suppliersTest
 Scenario: TC-04 WAR-31 get all suppliers
Given I send a Get request for suppliers from "WAR-31 get all suppliers" and capture the response body
When The order request response for suppliers from has a '200' response code
Then the response body for suppliers should contain key "type" with value "success"

@suppliersTest
 Scenario: TC-05 War-89  WAR-32 get supplier by supplier number
Given I send a Get request for suppliers from "WAR-32 get supplier by supplier number" and capture the response body
When The order request response for suppliers from has a '200' response code
Then the response body for suppliers should contain key "type" with value "success"

@suppliersTest
 Scenario: TC-06 WAR-33 Update Supplier Details
Given I send a Put request for suppliers from "WAR-33 Update Supplier Details.json" and capture the response body
When The order request response for suppliers from has a '201' response code
Then the response body for suppliers should contain key "type" with value "success"

@suppliersTest
 Scenario: TC-07 WAR-34-35-36 all invoice details of given supplier
Given I send a Get request for suppliers from "WAR-34-35-36 all invoice details of given supplier" and capture the response body
When The order request response for suppliers from has a '200' response code
Then the response body for suppliers should contain key "type" with value "success"

@suppliersTest
 Scenario: TC-08 WAR-37 fetch master data for supplier by category
Given I send a Get request for suppliers from "WAR-37 fetch master data for supplier by category" and capture the response body
When The order request response for suppliers from has a '200' response code
Then the response body for suppliers should contain key "type" with value "success"

@suppliersTest @supTest 
 Scenario: TC-09 Delete Supplier
Given I send a Delete request for suppliers from "Delete Supplier" and capture the response body
When The order request response for suppliers from has a '200' response code

@suppliersTest 
 Scenario: TC-10 WAR-86 fetch suppliers all 
Given I send a Get request for suppliers from "WAR-86 fetch inventory all" and capture the response body
When The order request response for suppliers from has a '200' response code
Then the response body for suppliers should contain key "type" with value "success"

@suppliersTest
 Scenario: TC-11 WAR-115 fetch all items list of given supplierNumber
Given I send a Get request for suppliers from "WAR-115 fetch all items list of given supplierNumber" and capture the response body
When The order request response for suppliers from has a '200' response code
Then the response body for suppliers should contain key "type" with value "success"

@suppliersTest
 Scenario: TC-11 get max supplier number
Given I send a Get request for suppliers from "get max supplier number" and capture the response body
When The order request response for suppliers from has a '200' response code
Then the response body for suppliers should contain key "type" with value "success"
