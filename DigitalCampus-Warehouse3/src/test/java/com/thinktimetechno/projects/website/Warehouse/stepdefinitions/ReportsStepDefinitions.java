package com.thinktimetechno.projects.website.Warehouse.stepdefinitions;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.io.IOException;

import com.thinktimetechno.Warehouse.endpoints.ReportsEndPoints;




public class ReportsStepDefinitions {


	private  ReportsEndPoints rpt;

	String responseBody ;
	public ReportsStepDefinitions( ReportsEndPoints rpt) {
		this.rpt = rpt;
	}
	
	@Given("I send a Put request for Reports from {string} and capture the response body")
	public void i_send_a_put_request_for_reports_from_and_capture_the_response_body(String jsonFile) throws IOException {
		rpt.applicationSalesUpdatePayload(jsonFile);
	}
	@Given("I send a Get request for Reports from {string} and capture the response body")
	public void i_send_a_get_request_with_the_request_body_from_and_capture_the_response_body(String name) throws IOException {

		rpt.applicationSalesfetchPayload(name);
  
	}

	
	@When("The order request response for Reports from has a {string} response code")
	public void the_order_request_response_has_a_response_code(String value) {
		int intValue = Integer.parseInt(value);
		rpt.verifyResponseStatusValue(rpt.result, intValue);
	}
	@Then("the response body for Reports should contain key {string} with value {string}")
	public void verifyResposeResult(String key,String value) {
		rpt.verifyResponseKeyValues(key, value, rpt.result);
	}
}


