package com.thinktimetechno.projects.website.Warehouse.stepdefinitions;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.io.IOException;

import com.thinktimetechno.Warehouse.endpoints.UserManagementEndPoints;





public class UserManagementStepDefinitions {


	private  UserManagementEndPoints usrmng;

	String responseBody ;
	public UserManagementStepDefinitions( UserManagementEndPoints usrmng) {
		this.usrmng = usrmng;
	}


	@Given("I send a Post request for User Management from {string} and capture the response body")
	public void i_send_a_post_request_for_user_management_from_and_capture_the_response_body(String jsonFile) throws IOException {
		usrmng.applicationSalesCreatePayload(jsonFile);	
	}
	
	
	@Given("I send a Put request for User Management from {string} and capture the response body")
	public void i_send_a_put_request_for_user_management_from_and_capture_the_response_body(String jsonFile) throws IOException {
		usrmng.applicationSalesUpdatePayload(jsonFile);
	}
	@Given("I send a Get request for User Management from {string} and capture the response body")
	public void i_send_a_get_request_with_the_request_body_from_and_capture_the_response_body(String name) throws IOException {

		usrmng.applicationSalesfetchPayload(name);
  
	}

	
	@When("The order request response for User Management from has a {string} response code")
	public void the_order_request_response_has_a_response_code(String value) {
		int intValue = Integer.parseInt(value);
		usrmng.verifyResponseStatusValue(usrmng.result, intValue);
	}
	@Then("the response body for UserManagement should contain key {string} with value {string}")public void verifyResposeResult(String key,String value) {
		usrmng.verifyResponseKeyValues(key, value, usrmng.result);
	}
}


