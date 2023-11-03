package com.thinktimetechno.projects.website.Warehouse.stepdefinitions;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.io.IOException;

import com.thinktimetechno.Warehouse.endpoints.TaxDetailsEndPoints;





public class TaxDetailsStepDefinitions {


	private  TaxDetailsEndPoints txdt;

	String responseBody ;
	public TaxDetailsStepDefinitions( TaxDetailsEndPoints txdt) {
		this.txdt = txdt;
	}


	@Given("I send a Post request for Tax Detail from {string} and capture the response body")
	public void i_send_a_post_request_for_tax_detail_from_and_capture_the_response_body(String jsonFile) throws IOException {
		txdt.applicationSalesCreatePayload(jsonFile);	
	}
	
	
	@Given("I send a Get request for Tax Detail from {string} and capture the response body")
	public void i_send_a_get_request_with_the_request_body_from_and_capture_the_response_body(String name) throws IOException {

		txdt.applicationSalesfetchPayload(name);
  
	}

	
	@When("The order request response for Tax Detail from has a {string} response code")
	public void the_order_request_response_has_a_response_code(String value) {
		int intValue = Integer.parseInt(value);
		txdt.verifyResponseStatusValue(txdt.result, intValue);
	}
	@Then("the response body for Tax Detail should contain key {string} with value {string}")
	public void verifyResposeResult(String key,String value) {
		txdt.verifyResponseKeyValues(key, value, txdt.result);
	}
}


