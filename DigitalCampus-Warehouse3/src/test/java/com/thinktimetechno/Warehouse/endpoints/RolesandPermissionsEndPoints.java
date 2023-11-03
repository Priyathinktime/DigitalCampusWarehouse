package com.thinktimetechno.Warehouse.endpoints;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.io.File;
import java.io.IOException;

public class RolesandPermissionsEndPoints extends BaseEndpoints{


	
	RequestSpecification requestSpecification;
	public Response result;
	private  String application_ENDPOINT_PATH="";
	
public Response applicationSalesCreatePayload(String jsonFile) throws IOException {

		
		requestSpecification = getRequestWithJSONHeaders();
		switch (jsonFile){
			case "Create Role Permission.json":
				application_ENDPOINT_PATH="roles/1/permission";
				break;
			
			
				
		}
		File jsonDataInFile = new File(System.getProperty("user.dir")+"/src/test/resources/Payloads/RolesandPermissionsPayloads/"+jsonFile);
		result=requestSpecification.body(jsonDataInFile).post(getBaseUrl() + application_ENDPOINT_PATH);
     	return result;
}

	public Response applicationSalesfetchPayload(String jsonFile) throws IOException {

		
		requestSpecification = getRequestWithJSONHeaders();
		switch (jsonFile){
			case "Fetch permissions by role":
				application_ENDPOINT_PATH="roles/1/permissions";
				break;
			
			case "Fetch all Permissions":
				application_ENDPOINT_PATH="permissions?category=User";
				break;
				
		}
		result=requestSpecification.get(getBaseUrl() + application_ENDPOINT_PATH);
     	return result;
	

	}

	
	
	
}