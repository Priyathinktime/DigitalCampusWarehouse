package com.thinktimetechno.projects.website.Warehouse.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.io.IOException;


import com.thinktimetechno.Warehouse.endpoints.EmployeeEndPoints;

public class EmployeeStepDefinitions {

	private EmployeeEndPoints employ;

	String responseBody;
	io.restassured.response.Response response;

	public EmployeeStepDefinitions(EmployeeEndPoints employ) {
		this.employ = employ;
	}


	@Given("I send a POST request for Employee with the request body from {string} and capture the response body")
	public void iPlaceAnOrderForApplicationSaleForTheJsonFile(String jsonFile) throws IOException {
		employ.applicationSalesCreatePayload(jsonFile);
//		System.out.println(employ.applicationSalesCreatePayload(response.getBody().asString()));
	}

	@Given("I send a PUT request for Employee with the request body from {string} and capture the response body")
	public void i_send_a_put_request_with_the_request_body_from_and_capture_the_response_body(String jsonFile)
			throws IOException {

		employ.applicationSalesUpdatePayload(jsonFile);
//		System.out.println(employ.applicationSalesCreatePayload(response.getBody().asString()));
	}

	@Given("I send a GET request for Employee from {string} and capture the response body")
	public void i_send_a_get_request_with_the_request_body_from_and_capture_the_response_body(String name)
			throws IOException {

		 employ.applicationSalesfetchPayload(name);
//		System.out.println(employ.applicationSalesCreatePayload(response.getBody().asString()));
	}

	@Given("I send a DELETE request for Employee from {string} and capture the response body")
	public void i_send_a_delete_request_for_and_capture_the_response_body(String name) {
		employ.applicationSalesDeletePayload(name);
	}

	@When("The order request response for Employee has a {string} response code")
	public void the_order_request_response_has_a_response_code(String value) {
		int intValue = Integer.parseInt(value);
		employ.verifyResponseStatusValue(employ.result, intValue);
	}
	
	@Then("the response body for Employee should contain key {string} with value {string}")
	public void verifyResposeResult(String key,String value) {
		employ.verifyResponseKeyValues(key, value, employ.result);
	}
}
