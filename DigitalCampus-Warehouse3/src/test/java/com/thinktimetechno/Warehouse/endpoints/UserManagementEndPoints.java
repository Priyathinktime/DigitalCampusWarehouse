package com.thinktimetechno.Warehouse.endpoints;

import io.netty.util.internal.ThreadLocalRandom;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.io.File;
import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;

public class UserManagementEndPoints extends BaseEndpoints{


		
		RequestSpecification requestSpecification;
		public Response result;
		boolean Isid=false;
		boolean Isname=false;
		public static String Name ;
		public static int id ;
		private  String application_ENDPOINT_PATH="";
		int min = 200;
        int max = 2000;

        int randomNumber = ThreadLocalRandom.current().nextInt(min, max + 1);
        String randomNumberAsString = Integer.toString(randomNumber);

		public Response applicationSalesCreatePayload(String jsonFile) throws IOException {

			
			requestSpecification = getRequestWithJSONHeaders();
			switch (jsonFile){
			
				case "Add User Role.json":
					application_ENDPOINT_PATH="roles";
					break;
			}
			
			  JSONObject postRequestBody = new JSONObject();
		        postRequestBody.put("name", "Admin"+randomNumberAsString);
		        postRequestBody.put("isActive", "true");
			
		        Isid=true;
		        Isname=true;
			result=requestSpecification.body(postRequestBody.toString()).post(getBaseUrl() + application_ENDPOINT_PATH);
			if(Isid) {
	     		String responseBody = result.getBody().asString();
	     		
	     		JSONObject jsonObject = new JSONObject(responseBody);
	     		   id = jsonObject.getJSONObject("data").getJSONObject("role").getInt("id");
    
		}
			if(Isname) {
	     		String responseBody = result.getBody().asString();
	     		
	     		JSONObject jsonObject = new JSONObject(responseBody);
	     		Name = jsonObject.getJSONObject("data").getJSONObject("role").getString("name");
    
		}
			return result;
		}
		public Response applicationSalesUpdatePayload(String jsonFile) throws IOException {
			

			requestSpecification = getRequestWithJSONHeaders();
			switch (jsonFile){
				case "Update User Role.json":
					application_ENDPOINT_PATH="roles/"+id;
					break;
				
			}
			  JSONObject postRequestBody = new JSONObject();
		        postRequestBody.put("name",Name);
		        postRequestBody.put("isActive", "false");
//			File jsonDataInFile = new File(System.getProperty("user.dir")+"/src/test/resources/Payloads/User Management/"+jsonFile);
			result=requestSpecification.body(postRequestBody.toString()).put(getBaseUrl() + application_ENDPOINT_PATH);
	     	return result;
		}
		public Response applicationSalesfetchPayload(String name ) {
			requestSpecification = getRequestWithJSONHeaders();
			switch (name){
			case "WAR-9 fetch user roles":
				application_ENDPOINT_PATH="users/roles";
				break;
			case "Fetch user permissions by user id":
				                           
				application_ENDPOINT_PATH="users/1/permissions";
				break;
			
		
			}
			result=requestSpecification.get(getBaseUrl() + application_ENDPOINT_PATH);
	     	return result;
		}
				
		
		
	}