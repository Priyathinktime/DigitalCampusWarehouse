package com.thinktimetechno.projects.website.Warehouse.stepdefinitions;

import java.io.IOException;

import com.thinktimetechno.Warehouse.endpoints.RolesandPermissionsEndPoints;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RolesandPermissionsStepDefinitions {
	
	private RolesandPermissionsEndPoints rlprm;

	String responseBody;
	

	public RolesandPermissionsStepDefinitions(RolesandPermissionsEndPoints rlprm) {
		this.rlprm = rlprm;
	}

	@Given("I send a Post request for Roles and Permissions from {string} and capture the response body")
	public void i_send_a_post_request_for_roles_and_permissions_from_and_capture_the_response_body(String jsonFile) throws IOException {
		rlprm.applicationSalesCreatePayload(jsonFile);	
	}
	
	@Given("I send a Get request for Roles and Permissions from {string} and capture the response body")
	public void i_send_a_get_request_for_roles_and_permissions_from_and_capture_the_response_body(String jsonFile) throws IOException {
		rlprm.applicationSalesfetchPayload(jsonFile);	
		}
	
	
	@When("The order request response for Roles and Permissions from has a {string} response code")
	public void the_order_request_response_for_roles_and_permissions_from_has_a_response_code(String value) {
		int intValue = Integer.parseInt(value);
		rlprm.verifyResponseStatusValue(rlprm.result, intValue);
	}
	@Then("the response body for Roles and Permissions should contain key {string} with value {string}")
	public void verifyResposeResult(String key,String value) {
		rlprm.verifyResponseKeyValues(key, value, rlprm.result);
	}

}


