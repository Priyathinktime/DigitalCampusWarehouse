@CustomerTest
@WarehouseTest

Feature: Customer Tests
This feature includes Customer tests using RESTFul services


Scenario: TC-01 WAR-18 create customer 
Given I send a POST request for Customer with the request body from "WAR 18 create customer.json" and capture the response body
When The order request response for Customer has a '201' response code
Then the response body for Customer should contain key "type" with value "success"

Scenario: TC-02 WAR-19 get all customers
 Given I send a GET request for Customer from "WAR-19 get all customers" and capture the response body
When The order request response for Customer has a '200' response code
Then the response body for Customer should contain key "type" with value "success"

Scenario: TC-03 WAR-20 get customer by customer number
 Given I send a GET request for Customer from "WAR-20 get customer by customer number" and capture the response body
When The order request response for Customer has a '200' response code
Then the response body for Customer should contain key "type" with value "success"

Scenario: TC-04 WAR-23 get max customer number
 Given I send a GET request for Customer from "WAR-23 get max customer number" and capture the response body
When The order request response for Customer has a '200' response code
Then the response body for Customer should contain key "type" with value "success"

Scenario: TC-05 WAR-24  Customers Master Data All
 Given I send a GET request for Customer from "WAR-24  Customers Master Data All" and capture the response body
When The order request response for Customer has a '200' response code
Then the response body for Customer should contain key "type" with value "success"

Scenario: TC-06 WAR-13 Customers Master Data  By Category
 Given I send a GET request for Customer from "WAR-13 Customers Master Data  By Category" and capture the response body
When The order request response for Customer has a '200' response code
Then the response body for Customer should contain key "type" with value "success"


Scenario: TC-07 WAR 21 Update Customer Basic Info
Given I send a PUT request for Customer with the request body from "WAR 21 Update Customer Basic Info.json" and capture the response body
When The order request response for Customer has a '200' response code
Then the response body for Customer should contain key "type" with value "success"

Scenario: TC-08 WAR-10 Get Mobile Providers
 Given I send a GET request for Customer from "WAR-10 Get Mobile Providers" and capture the response body
When The order request response for Customer has a '200' response code
Then the response body for Customer should contain key "type" with value "success"


Scenario: TC-09 WAR 22 Update Customers Classification
Given I send a PUT request for Customer with the request body from "WAR 22 Update Customers Classification.json" and capture the response body
When The order request response for Customer has a '200' response code
Then the response body for Customer should contain key "type" with value "success"

Scenario: TC-10 WAR-12 Get State List
 Given I send a GET request for Customer from "WAR-12 Get State List" and capture the response body
When The order request response for Customer has a '200' response code
Then the response body for Customer should contain key "type" with value "success"

@CustomTest
Scenario: TC-11 WAR 11 Update Customers BillingInfo
Given I send a PUT request for Customer with the request body from "WAR 11 Update Customers BillingInfo.json" and capture the response body
When The order request response for Customer has a '201' response code
Then the response body for Customer should contain key "type" with value "success"

Scenario: TC-12 WAR-14 Get drivers list
 Given I send a GET request for Customer from "WAR-14 Get drivers list" and capture the response body
When The order request response for Customer has a '200' response code
Then the response body for Customer should contain key "type" with value "success"

Scenario: TC-13 WAR-15 Get salesman list
 Given I send a GET request for Customer from "WAR-15 Get salesman list" and capture the response body
When The order request response for Customer has a '200' response code
Then the response body for Customer should contain key "type" with value "success"

Scenario: TC-14 WAR-27 Get payments of customer
 Given I send a GET request for Customer from "WAR-27 Get payments of customer" and capture the response body
When The order request response for Customer has a '200' response code
Then the response body for Customer should contain key "type" with value "success"

Scenario: TC-15 WAR-26 fetch invoices for a given customer
 Given I send a GET request for Customer from "WAR-26 fetch invoices for a given customer" and capture the response body
When The order request response for Customer has a '200' response code
Then the response body for Customer should contain key "type" with value "success"

Scenario: TC-16 WAR-28 fetch invoices for a given invoice number
 Given I send a GET request for Customer from "WAR-28 fetch invoices for a given invoice number" and capture the response body
When The order request response for Customer has a '200' response code
Then the response body for Customer should contain key "type" with value "success"

Scenario: TC-17 WAR-77 delete customer
 Given I send a DELETE request for Customer from "WAR-77 delete customer" and capture the response body
When The order request response for Customer has a '201' response code
Then the response body for Customer should contain key "type" with value "success"

Scenario: TC-18 WAR-76 Customer Account balancd history
 Given I send a GET request for Customer from "WAR-76 Customer Account balancd history" and capture the response body
When The order request response for Customer has a '200' response code
Then the response body for Customer should contain key "type" with value "success"

Scenario: TC-19 WAR-161 fetch max invoice number
 Given I send a GET request for Customer from "WAR-161 fetch max invoice number" and capture the response body
When The order request response for Customer has a '200' response code
Then the response body for Customer should contain key "type" with value "success"

Scenario: TC-20 WAR 160 create invoice 
Given I send a POST request for Customer with the request body from "WAR 160 create invoice.json" and capture the response body
When The order request response for Customer has a '201' response code
Then the response body for Customer should contain key "type" with value "success"

Scenario: TC-21 WAR 162 update invoice
Given I send a PUT request for Customer with the request body from "WAR 162 update invoice.json" and capture the response body
When The order request response for Customer has a '200' response code
Then the response body for Customer should contain key "type" with value "success"

Scenario: TC-22 WAR-163 delete invoice
 Given I send a DELETE request for Customer from "WAR-163 delete invoice" and capture the response body
When The order request response for Customer has a '200' response code
Then the response body for Customer should contain key "type" with value "success"

Scenario: TC-23 change status posted invoice
Given I send a POST request for Customer with the request body from "change status posted invoice.json" and capture the response body
When The order request response for Customer has a '201' response code
Then the response body for Customer should contain key "type" with value "success"

Scenario: TC-24 WAR 234 Accept the payments anywhere
Given I send a POST request for Customer with the request body from "WAR 234 Accept the payments anywhere.json" and capture the response body
When The order request response for Customer has a '200' response code
Then the response body for Customer should contain key "type" with value "success"

Scenario: TC-25 WAR 292 create special price for customer
Given I send a POST request for Customer with the request body from "WAR 292 create special price for customer.json" and capture the response body
When The order request response for Customer has a '200' response code
Then the response body for Customer should contain key "type" with value "success"

Scenario: TC-26 WAR-293 delete customer special price
 Given I send a DELETE request for Customer from "WAR-293 delete customer special price" and capture the response body
When The order request response for Customer has a '201' response code
Then the response body for Customer should contain key "type" with value "success"