package com.thinktimetechno.Warehouse.endpoints;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.json.JSONObject;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DesignationEndPoints extends BaseEndpoints{


	
	RequestSpecification requestSpecification;
	public Response result;
	public static int applicationNameId;
	public static String examId;
	private  String application_ENDPOINT_PATH="";
   boolean isApplicationId=false;
	public Response applicationSalesCreatePayload(String jsonFile) throws IOException {

		
		requestSpecification =getRequestWithJSONHeaders();
		switch (jsonFile){
			case "Create Designation.json":
				application_ENDPOINT_PATH="designation";
				break;
		
				
		}
		File jsonDataInFile = new File(System.getProperty("user.dir")+"/src/test/resources/Payloads/DesiginationPayloads/"+jsonFile);
		result=requestSpecification.body(jsonDataInFile).post(getBaseUrl() + application_ENDPOINT_PATH);
//		if(isApplicationId) {
//		String responseBody = result.getBody().asString();
//	    JSONObject postResponseJson = new JSONObject(responseBody);
//	    applicationNameId= postResponseJson.getInt("applicationId");
//		}
	    return result;
	
	}
	public Response applicationSalesUpdatePayload(String jsonFile) throws IOException {
		
		requestSpecification =getRequestWithJSONHeaders();
//		requestSpecification = getRequestWithJSONHeadersToken(token);
		switch (jsonFile){
			case "Update Designation.json":
				application_ENDPOINT_PATH="designation/3";
				break;
			
		}
		File jsonDataInFile = new File(System.getProperty("user.dir")+"/src/test/resources/Payloads/DesiginationPayloads/"+jsonFile);
		result=requestSpecification.body(jsonDataInFile).put(getBaseUrl() + application_ENDPOINT_PATH);
     	return result;
	}
	public Response applicationSalesfetchPayload(String name ) {
		requestSpecification =getRequestWithJSONHeaders();
//		requestSpecification = getRequestWithJSONHeadersToken(token);
		switch (name){
		case "Fetch all Designations":
			application_ENDPOINT_PATH="designation/all";
			break;
		
		}
			result=requestSpecification.get(getBaseUrl() + application_ENDPOINT_PATH);
	     	return result;
	
}
	
	public Response applicationSalesDeletePayload(String name ) {
		requestSpecification =getRequestWithJSONHeaders();
//		requestSpecification = getRequestWithJSONHeadersToken(token);
		switch (name){
		case "Delete Designation":
			application_ENDPOINT_PATH="designation/delete";
			break;
		
		
		}
			result=requestSpecification.delete(getBaseUrl() + application_ENDPOINT_PATH);
	     	return result;
	
}
}