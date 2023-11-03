package com.thinktimetechno.projects.website.Warehouse.stepdefinitions;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.io.IOException;

import com.thinktimetechno.Warehouse.endpoints.InventoryEndPoints;





public class InventoryStepDefinitions {


	private  InventoryEndPoints invt;

	String responseBody ;
	public InventoryStepDefinitions( InventoryEndPoints invt) {
		this.invt = invt;
	}


	@Given("I send a Post request for Inventory from {string} and capture the response body")
	public void i_send_a_post_request_for_inventory_from_and_capture_the_response_body(String jsonFile) throws IOException {
		invt.applicationSalesCreatePayload(jsonFile);	
	}
	
	
	@Given("I send a Put request for Inventory from {string} and capture the response body")
	public void i_send_a_put_request_for_inventory_from_and_capture_the_response_body(String jsonFile) throws IOException {
		invt.applicationSalesUpdatePayload(jsonFile);
	}
	@Given("I send a Get request for Inventory from {string} and capture the response body")
	public void i_send_a_get_request_with_the_request_body_from_and_capture_the_response_body(String name) throws IOException {

		invt.applicationSalesfetchPayload(name);
  
	}

	@Given("I send a Delete request for Inventory from {string} and capture the response body")
	public void i_send_a_delete_request_for_and_capture_the_response_body(String name) {
		invt.applicationSalesDeletePayload( name);
	}
	
	
	@When("The order request response for Inventory from has a {string} response code")
	public void the_order_request_response_has_a_response_code(String value) {
		int intValue = Integer.parseInt(value);
		invt.verifyResponseStatusValue(invt.result, intValue);
	}
	@Then("the response body for Inventory should contain key {string} with value {string}")
	public void verifyResposeResult(String key,String value) {
		invt.verifyResponseKeyValues(key, value, invt.result);
	}
	
}


