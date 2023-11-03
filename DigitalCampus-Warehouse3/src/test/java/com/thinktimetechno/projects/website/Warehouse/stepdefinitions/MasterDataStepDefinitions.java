package com.thinktimetechno.projects.website.Warehouse.stepdefinitions;

import java.io.IOException;

import com.thinktimetechno.Warehouse.endpoints.MasterDataEndPoints;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MasterDataStepDefinitions {
	
	private MasterDataEndPoints mstdt;

	String responseBody;
	

	public MasterDataStepDefinitions(MasterDataEndPoints mstdt) {
		this.mstdt = mstdt;
	}


	@Given("I send a Get request for Master Data from {string} and capture the response body")
	public void i_send_a_get_request_for_master_data_from_and_capture_the_response_body(String jsonFile) throws IOException {
		mstdt.applicationSalesfetchPayload(jsonFile);	
		}
	
	
	@When("The order request response for Master Data from has a {string} response code")
	public void the_order_request_response_for_master_data_from_has_a_response_code(String value) {
		int intValue = Integer.parseInt(value);
		mstdt.verifyResponseStatusValue(mstdt.result, intValue);
	}
	@Then("the response body for Master Data should contain key {string} with value {string}")
	public void verifyResposeResult(String key,String value) {
		mstdt.verifyResponseKeyValues(key, value, mstdt.result);
	}

}


