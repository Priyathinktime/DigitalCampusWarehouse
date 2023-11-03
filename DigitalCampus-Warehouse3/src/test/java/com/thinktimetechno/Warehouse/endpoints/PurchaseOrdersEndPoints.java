package com.thinktimetechno.Warehouse.endpoints;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.io.IOException;


public class PurchaseOrdersEndPoints extends BaseEndpoints{


	
	RequestSpecification requestSpecification;
	public Response result;
	public static int applicationNameId;
	public static String PurchaseOrderNumber;;
	private  String application_ENDPOINT_PATH="";
   boolean IspurchaseOrderNumber=false;
	public Response applicationSalesCreatePayload(String jsonFile) throws IOException {

		
		requestSpecification =getRequestWithJSONHeaders();
		switch (jsonFile){
		
	
			case "WAR 112 Create Purchase Order.json":
				application_ENDPOINT_PATH="purchase-orders";
				break;

			case "WAR 166 received purchase order.json":
				application_ENDPOINT_PATH="purchase-orders/"+PurchaseOrderNumber+"/received";
				break;
			case "WAR 274 PO open.json":     
				application_ENDPOINT_PATH="purchase-orders/"+PurchaseOrderNumber+"/po-open";
				break;
			
			
				
		}
		File jsonDataInFile = new File(System.getProperty("user.dir")+"/src/test/resources/Payloads/PurchaseOrdersPayloads/"+jsonFile);
		result=requestSpecification.body(jsonDataInFile).post(getBaseUrl() + application_ENDPOINT_PATH);

	    return result;
	
	}
	public Response applicationSalesUpdatePayload(String jsonFile) throws IOException {
		
		requestSpecification =getRequestWithJSONHeaders();
//		requestSpecification = getRequestWithJSONHeadersToken(token);
		switch (jsonFile){
		
			case "WAR 116 update prachase order.json":
				application_ENDPOINT_PATH="purchase-orders/"+PurchaseOrderNumber;
				break;
		

		}
		File jsonDataInFile = new File(System.getProperty("user.dir")+"/src/test/resources/Payloads/PurchaseOrdersPayloads/"+jsonFile);
		result=requestSpecification.body(jsonDataInFile).put(getBaseUrl() + application_ENDPOINT_PATH);
     	return result;
	}
	public Response applicationSalesfetchPayload(String name ) {
		requestSpecification =getRequestWithJSONHeaders();
//		requestSpecification = getRequestWithJSONHeadersToken(token);
		switch (name){
		case "WAR-113 fetch Purchase Order List":
			application_ENDPOINT_PATH="purchase-orders/all?sort=desc&orderBy=purchaseOrderNumber";
		IspurchaseOrderNumber=true;
			break;
		case "WAR-79 fetch purchase order lineitems by PO number":
			application_ENDPOINT_PATH="purchase-orders/"+PurchaseOrderNumber;
			IspurchaseOrderNumber=false;
			break;
		case "war-165 fetch max purchase order number":
			application_ENDPOINT_PATH="purchase-orders/max-number?receivedDate=2023-01-23";
			break;
		case "download PO pdf":
			application_ENDPOINT_PATH="purchase-order/123456/download-pdf";
			break;

		}
		result=requestSpecification.get(getBaseUrl() + application_ENDPOINT_PATH);
		if(IspurchaseOrderNumber) {
	     		String responseBody = result.getBody().asString();
	     		
	     		JSONObject jsonObject = new JSONObject(responseBody);
	            JSONObject data = jsonObject.getJSONObject("data");
	            JSONArray purchaseOrders = data.getJSONArray("purchaseOrders");
	            
	            if (purchaseOrders.length() > 0) {
	                JSONObject firstPurchaseOrder = purchaseOrders.getJSONObject(2);
	                PurchaseOrderNumber = firstPurchaseOrder.getString("purchaseOrderNumber");
	            }
		}
			
	     	return result;
	
}
	
	public Response applicationSalesDeletePayload(String name ) {
		
		requestSpecification =getRequestWithJSONHeaders();
//		requestSpecification = getRequestWithJSONHeadersToken(token);
		switch (name){
		case "delete purchase order":
			application_ENDPOINT_PATH="purchase-orders/delete";
			String requestBody = "{ \"ids\": [ \"" + PurchaseOrderNumber + "\" ] }";
			requestSpecification.body(requestBody);
			break;
	
		
		
		}
			result=requestSpecification.delete(getBaseUrl() + application_ENDPOINT_PATH);
	     	return result;
	
}
}