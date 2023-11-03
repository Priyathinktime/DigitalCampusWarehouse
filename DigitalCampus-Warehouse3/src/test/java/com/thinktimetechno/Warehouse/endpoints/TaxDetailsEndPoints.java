package com.thinktimetechno.Warehouse.endpoints;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.io.File;
import java.io.IOException;

public class TaxDetailsEndPoints extends BaseEndpoints{


	
	RequestSpecification requestSpecification;
	public Response result;
	private  String application_ENDPOINT_PATH="";
	
public Response applicationSalesCreatePayload(String jsonFile) throws IOException {

		
		requestSpecification = getRequestWithJSONHeaders();
		switch (jsonFile){
			case "Create/Updated Tax detail.json":
				application_ENDPOINT_PATH="masters/taxDetail";
				break;
			
			
				
		}
		File jsonDataInFile = new File(System.getProperty("user.dir")+"/src/test/resources/Payloads/Tax Detail/"+jsonFile);
		result=requestSpecification.body(jsonDataInFile).post(getBaseUrl() + application_ENDPOINT_PATH);
     	return result;
}

	public Response applicationSalesfetchPayload(String jsonFile) throws IOException {

		
		requestSpecification = getRequestWithJSONHeaders();
		switch (jsonFile){
			case "Get Tax Detail":
				application_ENDPOINT_PATH="masters/taxDetail";
				break;
		
				
		}
		result=requestSpecification.get(getBaseUrl() + application_ENDPOINT_PATH);
     	return result;
	

	}

	
	
	
}