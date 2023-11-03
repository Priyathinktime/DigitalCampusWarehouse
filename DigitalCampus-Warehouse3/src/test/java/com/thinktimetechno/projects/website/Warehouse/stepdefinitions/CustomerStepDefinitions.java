package com.thinktimetechno.projects.website.Warehouse.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.io.IOException;

import com.thinktimetechno.Warehouse.endpoints.CustomerEndPoints;

public class CustomerStepDefinitions {

	private CustomerEndPoints custom;

	String responseBody;
	io.restassured.response.Response response;

	public CustomerStepDefinitions(CustomerEndPoints custom) {
		this.custom = custom;
	}

//	AuthExample auth =new AuthExample();
	@Given("I send a POST request for Customer with the request body from {string} and capture the response body")
	public void iPlaceAnOrderForApplicationSaleForTheJsonFile(String jsonFile) throws IOException {
		custom.applicationSalesCreatePayload(jsonFile);
		System.out.println(custom.result.getBody().asString());
	}

	@Given("I send a PUT request for Customer with the request body from {string} and capture the response body")
	public void i_send_a_put_request_with_the_request_body_from_and_capture_the_response_body(String jsonFile)
			throws IOException {

		custom.applicationSalesUpdatePayload(jsonFile);
		System.out.println(custom.result.getBody().asString());

	}

	@Given("I send a GET request for Customer from {string} and capture the response body")
	public void i_send_a_get_request_with_the_request_body_from_and_capture_the_response_body(String name)
			throws IOException {

		 custom.applicationSalesfetchPayload(name);
		 System.out.println(custom.result.getBody().asString());
	}

	@Given("I send a DELETE request for Customer from {string} and capture the response body")
	public void i_send_a_delete_request_for_and_capture_the_response_body(String name) {
		custom.applicationSalesDeletePayload(name);
	}

	@When("The order request response for Customer has a {string} response code")
	public void the_order_request_response_has_a_response_code(String value) {
		int intValue = Integer.parseInt(value);
		custom.verifyResponseStatusValue(custom.result, intValue);
	}
	
	@Then("the response body for Customer should contain key {string} with value {string}")
	public void verifyResposeResult(String key,String value) {
		custom.verifyResponseKeyValues(key, value, custom.result);
	}
}
