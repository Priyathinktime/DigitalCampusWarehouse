package com.thinktimetechno.projects.website.Warehouse.stepdefinitions;

import java.io.IOException;

import com.thinktimetechno.Warehouse.endpoints.InvoiceEndPoints;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InvoiceStepDefinitions {
	
	private InvoiceEndPoints inv;

	String responseBody;
	

	public InvoiceStepDefinitions(InvoiceEndPoints inv) {
		this.inv = inv;
	}


	@Given("I send a Get request for Invoice from {string} and capture the response body")
	public void i_send_a_get_request_for_invoice_from_and_capture_the_response_body(String jsonFile) throws IOException {
		inv.applicationSalesfetchPayload(jsonFile);	
		}
	
	
	@When("The order request response for Invoice from has a {string} response code")
	public void the_order_request_response_for_invoice_from_has_a_response_code(String value) {
		int intValue = Integer.parseInt(value);
		inv.verifyResponseStatusValue(inv.result, intValue);
	}
	@Then("the response body for Invoice should contain key {string} with value {string}")
	public void verifyResposeResult(String key,String value) {
		inv.verifyResponseKeyValues(key, value, inv.result);
	}

}


