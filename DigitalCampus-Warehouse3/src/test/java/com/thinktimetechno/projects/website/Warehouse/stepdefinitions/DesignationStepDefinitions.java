package com.thinktimetechno.projects.website.Warehouse.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.io.IOException;


import com.thinktimetechno.Warehouse.endpoints.DesignationEndPoints;

public class DesignationStepDefinitions {

	private DesignationEndPoints design;

	String responseBody;
	io.restassured.response.Response response;

	public DesignationStepDefinitions(DesignationEndPoints design) {
		this.design = design;
	}


	@Given("I send a POST request for Designation with the request body from {string} and capture the response body")
	public void iPlaceAnOrderForApplicationSaleForTheJsonFile(String jsonFile) throws IOException {
		design.applicationSalesCreatePayload(jsonFile);
		System.out.println(design.result.getBody().asString());
//		System.out.println(design.applicationSalesCreatePayload(response.getBody().asString()));
	}

	@Given("I send a PUT request for Designation with the request body from {string} and capture the response body")
	public void i_send_a_put_request_with_the_request_body_from_and_capture_the_response_body(String jsonFile)
			throws IOException {

		design.applicationSalesUpdatePayload(jsonFile);
		System.out.println(design.result.getBody().asString());
//		System.out.println(design.applicationSalesCreatePayload(response.getBody().asString()));
	}

	@Given("I send a GET request for Designation from {string} and capture the response body")
	public void i_send_a_get_request_with_the_request_body_from_and_capture_the_response_body(String name)
			throws IOException {

		 design.applicationSalesfetchPayload(name);
		 System.out.println(design.result.getBody().asString());
//		System.out.println(design.applicationSalesCreatePayload(response.getBody().asString()));
	}

	@Given("I send a DELETE request for Designation from {string} and capture the response body")
	public void i_send_a_delete_request_for_and_capture_the_response_body(String name) {
		design.applicationSalesDeletePayload(name);
	}

	@When("The order request response for Designation has a {string} response code")
	public void the_order_request_response_has_a_response_code(String value) {
		int intValue = Integer.parseInt(value);
		design.verifyResponseStatusValue(design.result, intValue);
	}
	
	@Then("the response body for Designation should contain key {string} with value {string}")
	public void verifyResposeResult(String key,String value) {
		design.verifyResponseKeyValues(key, value, design.result);
	}
}
