package com.thinktimetechno.projects.website.Warehouse.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import java.io.IOException;

import com.thinktimetechno.Warehouse.endpoints.AuthEndPoints;


public class AuthStepDefinitions {

	private AuthEndPoints auth;

	String responseBody;
	

	public AuthStepDefinitions(AuthEndPoints auth) {
		this.auth = auth;
	}


	@Given("I send a Post request for Auth from {string} and capture the response body")
	public void iPlaceAnOrderForApplicationSaleForTheJsonFile(String jsonFile) throws IOException {
		auth.applicationSalesCreatePayload(jsonFile);
		System.out.println(auth.result.getBody().asString());
	}



	@When("The order request response for Auth from has a {string} response code")
	public void the_order_request_response_has_a_response_code(String value) {
		int intValue = Integer.parseInt(value);
		auth.verifyResponseStatusValue(auth.result, intValue);
	}
}
