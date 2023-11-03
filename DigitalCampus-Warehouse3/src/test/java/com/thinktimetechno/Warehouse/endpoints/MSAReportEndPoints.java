package com.thinktimetechno.Warehouse.endpoints;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.io.IOException;

public class MSAReportEndPoints extends BaseEndpoints{


	
	RequestSpecification requestSpecification;
	public Response result;
	private  String application_ENDPOINT_PATH="";

	public Response applicationSalesfetchPayload(String jsonFile) throws IOException {

		
		requestSpecification = getRequestWithJSONHeaders();
		switch (jsonFile){
			case "Download MSA":
				application_ENDPOINT_PATH="sendMsaFile?fromDate=2023-03-13&toDate=2023-03-19&type=DOWNLOAD&isLive=false";
				break;
			
			
				
		}
		result=requestSpecification.get(getBaseUrl() + application_ENDPOINT_PATH);
     	return result;
	

	}

	
	
	
}