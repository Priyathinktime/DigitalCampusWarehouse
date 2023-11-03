package com.thinktimetechno.projects.website.Warehouse.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.io.IOException;


import com.thinktimetechno.Warehouse.endpoints.DepartmentsEndPoints;

public class DepartmentsStepDefinitions {

	private DepartmentsEndPoints depart;

	String responseBody;
	

	public DepartmentsStepDefinitions(DepartmentsEndPoints depart) {
		this.depart = depart;
	}


	@Given("I send a POST request for Departments with the request body from {string} and capture the response body")
	public void iPlaceAnOrderForApplicationSaleForTheJsonFile(String jsonFile) throws IOException {
		depart.applicationSalesCreatePayload(jsonFile);
//		System.out.println(depart.applicationSalesCreatePayload(response.getBody().asString()));
	}

	@Given("I send a PUT request for Departments with the request body from {string} and capture the response body")
	public void i_send_a_put_request_with_the_request_body_from_and_capture_the_response_body(String jsonFile)
			throws IOException {

		depart.applicationSalesUpdatePayload(jsonFile);
//		System.out.println(depart.applicationSalesCreatePayload(response.getBody().asString()));
	}

	@Given("I send a GET request for Departments from {string} and capture the response body")
	public void i_send_a_get_request_with_the_request_body_from_and_capture_the_response_body(String name)
			throws IOException {

		 depart.applicationSalesfetchPayload(name);
//		System.out.println(depart.applicationSalesCreatePayload(response.getBody().asString()));
	}

	@Given("I send a DELETE request for Departments from {string} and capture the response body")
	public void i_send_a_delete_request_for_and_capture_the_response_body(String name) {
		depart.applicationSalesDeletePayload(name);
	}

	@When("The order request response for Departments has a {string} response code")
	public void the_order_request_response_has_a_response_code(String value) {
		int intValue = Integer.parseInt(value);
		depart.verifyResponseStatusValue(depart.result, intValue);
	}
	
	@Then("the response body for Departments should contain key {string} with value {string}")
	public void verifyResposeResult(String key,String value) {
		depart.verifyResponseKeyValues(key, value, depart.result);
	}
}
