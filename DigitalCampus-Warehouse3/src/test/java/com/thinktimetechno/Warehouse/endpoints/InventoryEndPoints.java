package com.thinktimetechno.Warehouse.endpoints;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.io.File;
import java.io.IOException;

import org.json.JSONObject;

public class InventoryEndPoints extends BaseEndpoints{


		
		RequestSpecification requestSpecification;
		public Response result;
		boolean isitemNumber=false;
		public static String itemNumber ;
		private  String application_ENDPOINT_PATH="";

		public Response applicationSalesCreatePayload(String jsonFile) throws IOException {

			
			requestSpecification = getRequestWithJSONHeaders();
			switch (jsonFile){
				case "WAR-83 Create Inventory.json":
					application_ENDPOINT_PATH="inventory";
					isitemNumber=true;
					break;
				case "WAR-240 Create customer inventory price.json":
					application_ENDPOINT_PATH="inventory/11002/customerPrice";
					break;
				
				case "war-263 create qtyAdjustment.json":
					application_ENDPOINT_PATH="inventory/11002/qty-adjustment";
					break;

				case "war-279  update the qty adjustment for Mutiple inventories.json":
					application_ENDPOINT_PATH="inventory/qty-adjustments";
					break;
					
				case "WAR-302 API to activate inventory item.json":
					application_ENDPOINT_PATH="inventory/"+itemNumber+"/status";
					isitemNumber=false;
					break;
			}
			File jsonDataInFile = new File(System.getProperty("user.dir")+"/src/test/resources/Payloads/InventoryPayloads/"+jsonFile);
			result=requestSpecification.body(jsonDataInFile).post(getBaseUrl() + application_ENDPOINT_PATH);
	     	if(isitemNumber) {
	     		String responseBody = result.getBody().asString();
//	     		JsonObject jsonObject = JsonParser.parseString(responseBody).getAsJsonObject();
	     		JSONObject json = new JSONObject(responseBody);
	             itemNumber = json.getJSONObject("data")
	                    .getJSONObject("inventory")
	                    .getString("itemNumber");
	                    
	     		
	     	}
			
			
			return result;
		}
		public Response applicationSalesUpdatePayload(String jsonFile) throws IOException {
			

			requestSpecification = getRequestWithJSONHeaders();
			switch (jsonFile){
				case "WAR-88 Update Inventory By Item number.json":
					application_ENDPOINT_PATH="inventory/11015";
					break;
				
			}
			File jsonDataInFile = new File(System.getProperty("user.dir")+"/src/test/resources/Payloads/InventoryPayloads/"+jsonFile);
			result=requestSpecification.body(jsonDataInFile).put(getBaseUrl() + application_ENDPOINT_PATH);
	     	return result;
		}
		public Response applicationSalesfetchPayload(String name ) {
			requestSpecification = getRequestWithJSONHeaders();
			switch (name){
			case "War-80 Get Master Data All":
				application_ENDPOINT_PATH="inventory/master-data/all";
				break;
			case "War-90 Get Master data by category":
				application_ENDPOINT_PATH="inventory/master-data?category=category";
				break;
			case "WAR-87 Purchase Order details":
				application_ENDPOINT_PATH="inventory/11002/po?supplierNumber=14&pageSize=30&poNumber=0622165-4&dateReceived=2016-06-22";
				break;
			case "WAR-85 fetch  the inventory details based on item number":
				application_ENDPOINT_PATH="inventory/11096";
				break;
			case "War-89  fetch Suppliers for a given itemNumber":
				application_ENDPOINT_PATH="inventory/11002/suppliers?supplierNumber=14";
				break;
			case "get max inventory number":
				application_ENDPOINT_PATH="inventory/maxNumber";
				break;
			case "WAR-150 fetch customer sales for a given item number":
				application_ENDPOINT_PATH="inventory/11002/sales?customerNumber&invoiceDate&page=1&pageSize=10";
				break;
			case "WAR-260 fetch special prices for a given customer or item number":
				application_ENDPOINT_PATH="inventory/specialPrices";
				break;
			case "WAR-269 fetch adjustment history for a given inventory":
				application_ENDPOINT_PATH="inventory/11002/qty-adjustment?page=1&pageSize=3";
				break;
			}
			result=requestSpecification.get(getBaseUrl() + application_ENDPOINT_PATH);
	     	return result;
		}
				public Response applicationSalesDeletePayload(String name ) {
					requestSpecification = getRequestWithJSONHeaders();
					switch (name){
					case "WAR-84 Delete inventory.json":
						application_ENDPOINT_PATH="inventory/delete";
						break;
					
					
					}
				result=requestSpecification.get(getBaseUrl() + application_ENDPOINT_PATH);
		     	return result;
		
				}
		
		
	}