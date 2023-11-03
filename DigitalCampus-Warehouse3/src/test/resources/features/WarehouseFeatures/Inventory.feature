
@WarehouseTest
Feature: Inventory Tests
This feature includes Inventory tests using RESTFul services

@InventoryTest
 Scenario: TC-01 War-80 Get Master Data All
Given I send a Get request for Inventory from "War-80 Get Master Data All" and capture the response body
When The order request response for Inventory from has a '200' response code
Then the response body for Inventory should contain key "type" with value "success"

@InventoryTest
 Scenario: TC-02 War-90 Get Master data by category
Given I send a Get request for Inventory from "War-90 Get Master data by category" and capture the response body
When The order request response for Inventory from has a '200' response code
Then the response body for Inventory should contain key "type" with value "success"

@InventoryTest
 Scenario: TC-03 WAR-87 Purchase Order details
Given I send a Get request for Inventory from "WAR-87 Purchase Order details" and capture the response body
When The order request response for Inventory from has a '200' response code
Then the response body for Inventory should contain key "type" with value "success"

@InventoryTest
 Scenario: TC-04 WAR-85 fetch  the inventory details based on item number
Given I send a Get request for Inventory from "WAR-85 fetch  the inventory details based on item number" and capture the response body
When The order request response for Inventory from has a '200' response code
Then the response body for Inventory should contain key "type" with value "success"

@InventoryTest
 Scenario: TC-05 War-89  fetch Suppliers for a given itemNumber
Given I send a Get request for Inventory from "War-89  fetch Suppliers for a given itemNumber" and capture the response body
When The order request response for Inventory from has a '200' response code
Then the response body for Inventory should contain key "type" with value "success"

@InventoryTest @InTest
 Scenario: TC-06 WAR-83 Create Inventory
Given I send a Post request for Inventory from "WAR-83 Create Inventory.json" and capture the response body
When The order request response for Inventory from has a '201' response code
Then the response body for Inventory should contain key "type" with value "success"

@InventoryTest
 Scenario: TC-07 WAR-84 Delete inventory
Given I send a Delete request for Inventory from "WAR-84 Delete inventory.json" and capture the response body
When The order request response for Inventory from has a '201' response code
Then the response body for Inventory should contain key "type" with value "success"

@InventoryTest
 Scenario: TC-08 WAR-88 Update Inventory By Item number
Given I send a Put request for Inventory from "WAR-88 Update Inventory By Item number.json" and capture the response body
When The order request response for Inventory from has a '201' response code
Then the response body for Inventory should contain key "type" with value "success"

@InventoryTest
 Scenario: TC-09 get max inventory number
Given I send a Get request for Inventory from "get max inventory number" and capture the response body
When The order request response for Inventory from has a '200' response code
Then the response body for Inventory should contain key "type" with value "success"

@InventoryTest
 Scenario: TC-10 WAR-150 fetch customer sales for a given item number
Given I send a Get request for Inventory from "WAR-150 fetch customer sales for a given item number" and capture the response body
When The order request response for Inventory from has a '200' response code
Then the response body for Inventory should contain key "type" with value "success"

@InventoryTest
 Scenario: TC-11 WAR-240 Create customer inventory price
Given I send a Post request for Inventory from "WAR-240 Create customer inventory price.json" and capture the response body
When The order request response for Inventory from has a '201' response code
Then the response body for Inventory should contain key "type" with value "success"

@InventoryTest
 Scenario: TC-12 WAR-260 fetch special prices for a given customer or item number
Given I send a Get request for Inventory from "WAR-260 fetch special prices for a given customer or item number" and capture the response body
When The order request response for Inventory from has a '200' response code
Then the response body for Inventory should contain key "type" with value "success"

@InventoryTest
 Scenario: TC-13 WAR-269 fetch adjustment history for a given inventory
Given I send a Get request for Inventory from "WAR-269 fetch adjustment history for a given inventory" and capture the response body
When The order request response for Inventory from has a '200' response code
Then the response body for Inventory should contain key "type" with value "success"

@InventoryTest
 Scenario: TC-14 war-263 create qtyAdjustment
Given I send a Post request for Inventory from "war-263 create qtyAdjustment.json" and capture the response body
When The order request response for Inventory from has a '201' response code
Then the response body for Inventory should contain key "type" with value "success"

@InventoryTest
 Scenario: TC-15 war-279  update the qty adjustment for Mutiple inventories
Given I send a Post request for Inventory from "war-279  update the qty adjustment for Mutiple inventories.json" and capture the response body
When The order request response for Inventory from has a '201' response code
Then the response body for Inventory should contain key "type" with value "success"

@InventoryTest @InTest
 Scenario: TC-16 WAR-302 API to activate inventory item
Given I send a Post request for Inventory from "WAR-302 API to activate inventory item.json" and capture the response body
When The order request response for Inventory from has a '200' response code
Then the response body for Inventory should contain key "type" with value "success"

