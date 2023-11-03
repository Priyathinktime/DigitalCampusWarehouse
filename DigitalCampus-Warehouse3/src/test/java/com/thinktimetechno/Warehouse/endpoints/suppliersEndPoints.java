package com.thinktimetechno.Warehouse.endpoints;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.io.File;
import java.io.IOException;

import org.json.JSONObject;

public class suppliersEndPoints extends BaseEndpoints{


		
		RequestSpecification requestSpecification;
		public Response result;
		boolean isitemNumber=false;
		public static String itemNumber ;
		private  String application_ENDPOINT_PATH="";

		public Response applicationSalesCreatePayload(String jsonFile) throws IOException {

			
			requestSpecification = getRequestWithJSONHeaders();
			switch (jsonFile){
			
				case "WAR-29 create supplier.json":
					application_ENDPOINT_PATH="suppliers";
					break;
			}
			File jsonDataInFile = new File(System.getProperty("user.dir")+"/src/test/resources/Payloads/suppliers/"+jsonFile);
			result=requestSpecification.body(jsonDataInFile).post(getBaseUrl() + application_ENDPOINT_PATH);
			return result;
		}
		public Response applicationSalesUpdatePayload(String jsonFile) throws IOException {
			

			requestSpecification = getRequestWithJSONHeaders();
			switch (jsonFile){
				case "WAR-33 Update Supplier Details.json":
					application_ENDPOINT_PATH="suppliers/545";
					break;
				
			}
			File jsonDataInFile = new File(System.getProperty("user.dir")+"/src/test/resources/Payloads/suppliers/"+jsonFile);
			result=requestSpecification.body(jsonDataInFile).put(getBaseUrl() + application_ENDPOINT_PATH);
	     	return result;
		}
		public Response applicationSalesfetchPayload(String name ) {
			requestSpecification = getRequestWithJSONHeaders();
			switch (name){
			case "WAR-30 fetch master All zipcodes":
				application_ENDPOINT_PATH="masters/zipcodes/all?page=1&pageSize=20";
				break;
			case "War-30 fetch master all zipcodes by zipcode":
				application_ENDPOINT_PATH="masters/zipcodes/00601";
				break;
			case "WAR-31 get all suppliers":
				application_ENDPOINT_PATH="suppliers/all";
				break;
			case "WAR-32 get supplier by supplier number":
				application_ENDPOINT_PATH="suppliers/545";
				break;
			case "WAR-34-35-36 all invoice details of given supplier":
				application_ENDPOINT_PATH="suppliers/invoices?supplierNumber=545&invoiceNumber=";
				break;
			case "WAR-37 fetch master data for supplier by category":
				application_ENDPOINT_PATH="suppliers/master-data?category=vendorType";
				break;
			case "WAR-86 fetch inventory all":
				application_ENDPOINT_PATH="inventory/all?source=PO";
				break;
			case "WAR-115 fetch all items list of given supplierNumber":
				application_ENDPOINT_PATH="suppliers/275/itemList?description=REDMAN&page=2&active=true&supplierItemNumber";
				break;
			case "get max supplier number":
				application_ENDPOINT_PATH="suppliers/maxNumber";
				break;
			}
			result=requestSpecification.get(getBaseUrl() + application_ENDPOINT_PATH);
	     	return result;
		}
				public Response applicationSalesDeletePayload(String name ) {
					requestSpecification = getRequestWithJSONHeaders();
					switch (name){
					case "Delete Supplier":
						application_ENDPOINT_PATH="suppliers/delete";
						
//						
						
						
					
					
					}
//				result=requestSpecification.get(getBaseUrl() + application_ENDPOINT_PATH);
				
					result = RestAssured.given()
						       .multiPart("ids[0]", "546", "text/plain")
						       .when()
						        .delete(getBaseUrl() + application_ENDPOINT_PATH);
					
					return result;
		
				}
		
		
	}