package com.thinktimetechno.projects.website.Warehouse.stepdefinitions;

import java.io.IOException;

import com.thinktimetechno.Warehouse.endpoints.MSAReportEndPoints;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MSAReportStepDefinitions {
	
	private MSAReportEndPoints msarpt;

	String responseBody;
	

	public MSAReportStepDefinitions(MSAReportEndPoints msarpt) {
		this.msarpt = msarpt;
	}


	@Given("I send a Get request for MSA Report from {string} and capture the response body")
	public void i_send_a_get_request_for_msa_report_from_and_capture_the_response_body(String jsonFile) throws IOException {
		msarpt.applicationSalesfetchPayload(jsonFile);	
		}
	
	
	@When("The order request response for MSA Report from has a {string} response code")
	public void the_order_request_response_for_msa_report_from_has_a_response_code(String value) {
		int intValue = Integer.parseInt(value);
		msarpt.verifyResponseStatusValue(msarpt.result, intValue);
	}
	@Then("the response body for MSA Report should contain key {string} with value {string}")
	public void verifyResposeResult(String key,String value) {
		msarpt.verifyResponseKeyValues(key, value, msarpt.result);
	}

}


