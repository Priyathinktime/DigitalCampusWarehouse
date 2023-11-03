Feature: Order Tests
	This feature includes tests that test the store order RESTFul services

  @OrdersmokeTest
Scenario: Users are able to place orders for pets
    Given the Applicationsale API is available
    When I place an order for application sale for the jsonFile "applicationSalesFilters"
    Then the order request response has a '201' response code
   # And the order requests response contains the correct json data

