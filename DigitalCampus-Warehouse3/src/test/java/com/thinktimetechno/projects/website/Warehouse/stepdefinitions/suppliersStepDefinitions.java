package com.thinktimetechno.projects.website.Warehouse.stepdefinitions;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.io.IOException;

import com.thinktimetechno.Warehouse.endpoints.suppliersEndPoints;





public class suppliersStepDefinitions {


	private  suppliersEndPoints spl;

	String responseBody ;
	public suppliersStepDefinitions( suppliersEndPoints spl) {
		this.spl = spl;
	}


	@Given("I send a Post request for suppliers from {string} and capture the response body")
	public void i_send_a_post_request_for_suppliers_from_and_capture_the_response_body(String jsonFile) throws IOException {
		spl.applicationSalesCreatePayload(jsonFile);	
	}
	
	
	@Given("I send a Put request for suppliers from {string} and capture the response body")
	public void i_send_a_put_request_for_suppliers_from_and_capture_the_response_body(String jsonFile) throws IOException {
		spl.applicationSalesUpdatePayload(jsonFile);
	}
	@Given("I send a Get request for suppliers from {string} and capture the response body")
	public void i_send_a_get_request_with_the_request_body_from_and_capture_the_response_body(String name) throws IOException {

		spl.applicationSalesfetchPayload(name);
  
	}

	@Given("I send a Delete request for suppliers from {string} and capture the response body")
	public void i_send_a_delete_request_for_and_capture_the_response_body(String name) {
		spl.applicationSalesDeletePayload( name);
	}
	
	
	@When("The order request response for suppliers from has a {string} response code")
	public void the_order_request_response_has_a_response_code(String value) {
		int intValue = Integer.parseInt(value);
		spl.verifyResponseStatusValue(spl.result, intValue);
	}
	@Then("the response body for suppliers should contain key {string} with value {string}")
	public void verifyResposeResult(String key,String value) {
		spl.verifyResponseKeyValues(key, value, spl.result);
	}


}


