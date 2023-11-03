package com.thinktimetechno.Warehouse.endpoints;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.io.IOException;

public class MasterDataEndPoints extends BaseEndpoints{


	
	RequestSpecification requestSpecification;
	public Response result;
	private  String application_ENDPOINT_PATH="";

	public Response applicationSalesfetchPayload(String jsonFile) throws IOException {

		
		requestSpecification = getRequestWithJSONHeaders();
		switch (jsonFile){
			case "war-296 get msa categories":
				application_ENDPOINT_PATH="masters/msa-categories";
				break;
			
			case "war-297 get msa state categories":
				application_ENDPOINT_PATH="masters/msa-state-categories";
				break;
				
		}
		result=requestSpecification.get(getBaseUrl() + application_ENDPOINT_PATH);
     	return result;
	

	}

	
	
	
}