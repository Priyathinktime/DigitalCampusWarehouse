package com.thinktimetechno.projects.website.cms.stepdefinitions;

import com.thinktimetechno.endpoints.postExample;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;


public class PostExampleStepDefinitions {


	private postExample postObj;

	public PostExampleStepDefinitions(postExample postObj) {
		this.postObj = postObj;
	}


	@When("I place an order for application sale for the jsonFile {string}")
	public void iPlaceAnOrderForApplicationSaleForTheJsonFile(String jsonFile) throws IOException {
		postObj.applicationSalesCreatePayload(jsonFile);

	}
	@Then("^the order request response has a '(\\d+)' response code$")
	public void the_response_has_the_correct_response_code(Integer rc) {
		postObj.verifyResponseStatusValue(postObj.result, rc.intValue());
	}



//	@Then("^the order requests response contains the correct json data$")
//	public void the_json_response_contains_the_correct_data() {
//		postObj.verifyResponseKeyValues("id", "58", Response r);
//	}

}
