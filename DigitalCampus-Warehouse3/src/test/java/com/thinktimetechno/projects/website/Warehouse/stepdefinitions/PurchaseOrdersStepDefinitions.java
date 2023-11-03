package com.thinktimetechno.projects.website.Warehouse.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.io.IOException;

import com.thinktimetechno.Warehouse.endpoints.PurchaseOrdersEndPoints;


public class PurchaseOrdersStepDefinitions {

	private PurchaseOrdersEndPoints purord;

	String responseBody;
	

	public PurchaseOrdersStepDefinitions(PurchaseOrdersEndPoints purord) {
		this.purord = purord;
	}


	@Given("I send a POST request for Purchase Orders with the request body from {string} and capture the response body")
	public void iPlaceAnOrderForApplicationSaleForTheJsonFile(String jsonFile) throws IOException {
		purord.applicationSalesCreatePayload(jsonFile);
		System.out.println(purord.result.getBody().asString());
	}

	@Given("I send a PUT request for Purchase Orders with the request body from {string} and capture the response body")
	public void i_send_a_put_request_with_the_request_body_from_and_capture_the_response_body(String jsonFile)
			throws IOException {

		purord.applicationSalesUpdatePayload(jsonFile);
		System.out.println(purord.result.getBody().asString());
	}

	@Given("I send a GET request for Purchase Orders from {string} and capture the response body")
	public void i_send_a_get_request_with_the_request_body_from_and_capture_the_response_body(String name)
			throws IOException {

		 purord.applicationSalesfetchPayload(name);
		 System.out.println(purord.result.getBody().asString());
	}

	@Given("I send a DELETE request for Purchase Orders from {string} and capture the response body")
	public void i_send_a_delete_request_for_and_capture_the_response_body(String name) {
		purord.applicationSalesDeletePayload(name);
	}

	@When("The order request response for Purchase Orders has a {string} response code")
	public void the_order_request_response_has_a_response_code(String value) {
		int intValue = Integer.parseInt(value);
		purord.verifyResponseStatusValue(purord.result, intValue);
	}
	@Then("the response body for Purchase Orders should contain key {string} with value {string}")
	public void verifyResposeResult(String key,String value) {
		purord.verifyResponseKeyValues(key, value, purord.result);
	}
}
