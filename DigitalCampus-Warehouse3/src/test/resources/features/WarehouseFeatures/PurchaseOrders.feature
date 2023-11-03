@WarehouseTest
@PurchaseOrdersTest
Feature: Purchase Orders Tests
This feature includes Purchase Orders tests using RESTFul services
@PurchaseTest
Scenario: TC-01 WAR-113 fetch Purchase Order List
 Given I send a GET request for Purchase Orders from "WAR-113 fetch Purchase Order List" and capture the response body
When The order request response for Purchase Orders has a '200' response code
Then the response body for Purchase Orders should contain key "type" with value "success"
@PurchaseTest
Scenario: TC-02 WAR-79 fetch purchase order lineitems by PO number
 Given I send a GET request for Purchase Orders from "WAR-79 fetch purchase order lineitems by PO number" and capture the response body
When The order request response for Purchase Orders has a '200' response code
Then the response body for Purchase Orders should contain key "type" with value "success"

Scenario: TC-03 WAR 112 Create Purchase Order
Given I send a POST request for Purchase Orders with the request body from "WAR 112 Create Purchase Order.json" and capture the response body
When The order request response for Purchase Orders has a '200' response code
Then the response body for Purchase Orders should contain key "type" with value "success"

Scenario: TC-04 WAR 116 update prachase order
Given I send a PUT request for Purchase Orders with the request body from "WAR 116 update prachase order.json" and capture the response body
When The order request response for Purchase Orders has a '201' response code
Then the response body for Purchase Orders should contain key "type" with value "success"

Scenario: TC-05 war-165 fetch max purchase order number
 Given I send a GET request for Purchase Orders from "war-165 fetch max purchase order number" and capture the response body
When The order request response for Purchase Orders has a '200' response code
Then the response body for Purchase Orders should contain key "type" with value "success"

 Scenario: TC-07 delete purchase order
 Given I send a DELETE request for Purchase Orders from "delete purchase order" and capture the response body
When The order request response for Purchase Orders has a '204' response code

Scenario: TC-08 WAR 274 PO open
Given I send a POST request for Purchase Orders with the request body from "WAR 274 PO open.json" and capture the response body
When The order request response for Purchase Orders has a '201' response code
Then the response body for Purchase Orders should contain key "type" with value "success"

Scenario: TC-06 WAR 166 received purchase order                          
Given I send a POST request for Purchase Orders with the request body from "WAR 166 received purchase order.json" and capture the response body
When The order request response for Purchase Orders has a '201' response code
Then the response body for Purchase Orders should contain key "type" with value "success"

Scenario: TC-09 download PO pdf
 Given I send a GET request for Purchase Orders from "download PO pdf" and capture the response body
When The order request response for Purchase Orders has a '200' response code
Then the response body for Purchase Orders should contain key "type" with value "success"