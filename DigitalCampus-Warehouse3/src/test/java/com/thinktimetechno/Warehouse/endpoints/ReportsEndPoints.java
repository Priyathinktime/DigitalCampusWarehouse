package com.thinktimetechno.Warehouse.endpoints;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.io.File;
import java.io.IOException;

import org.json.JSONObject;

public class ReportsEndPoints extends BaseEndpoints{


		
		RequestSpecification requestSpecification;
		public Response result;
		boolean isitemNumber=false;
		public static String itemNumber ;
		private  String application_ENDPOINT_PATH="";


		public Response applicationSalesUpdatePayload(String jsonFile) throws IOException {
			

			requestSpecification = getRequestWithJSONHeaders();
			switch (jsonFile){
				case "update inventory pricing report.json":
					application_ENDPOINT_PATH="reports/inventory-pricing/";
					break;
					
				case "update inventory price code.json":
					application_ENDPOINT_PATH="reports/inventory-pricing/pricecode";
					break;
				
			}
			File jsonDataInFile = new File(System.getProperty("user.dir")+"/src/test/resources/Payloads/Reports/"+jsonFile);
			result=requestSpecification.body(jsonDataInFile).put(getBaseUrl() + application_ENDPOINT_PATH);
	     	return result;
		}
		public Response applicationSalesfetchPayload(String name ) {
			requestSpecification = getRequestWithJSONHeaders();
			switch (name){
			case "get suppliers report":
				application_ENDPOINT_PATH="reports/suppliers?page=1&pageSize=10&downloadType=pdf&download=true";
				break;
			case "get inventory-pricing report":
				application_ENDPOINT_PATH="reports/inventory-pricing?page=1&pageSize=20&downloadType=pdf&download=true";
				break;
			case "get inventory-pricing-report-update-columns":
				application_ENDPOINT_PATH="reports/inventory-pricing/options";
				break;
			case "get inventory price code":
				application_ENDPOINT_PATH="reports/inventory-pricing/pricecode&downloadType=pdf&download=true";
				break;
			case "get inventory pricing statistics":
				application_ENDPOINT_PATH="reports/inventory-pricing/statistics?from=2000-10-10&to=2023-03-10&downloadType=pdf&download=true";
				break;
			case "get customers report":
				application_ENDPOINT_PATH="reports/customers?page=1&pageSize=10";
				break;
			case "get customers statistics report":
				application_ENDPOINT_PATH="reports/customers/statistics?page=10&pageSize=100&search=abcd&status=inactive&state=nc&dateType=lastUsed&startDate=2000-10-10&endDate=2023-01-01&downloadType=pdf&download=true";
				break;
			case "get PO Analysis":
				application_ENDPOINT_PATH="reports/po-analysis?page=1&pageSize=20&supplierNumber=501";
				break;
			case "get customer route report":
				application_ENDPOINT_PATH="reports/customers/route?page=1&pageSize=5&shippedVia=DELIVERY&routeName=Winston Salem %26Area&routeDeliveryDay=Tuesday&zone=GSO&driverName=&salesman&downloadType=pdf&download=true";
				break;
			case "get paymets report":
				application_ENDPOINT_PATH="reports/payments?page=1&pageSize=10&startDate=2020-10-10&endDate=2023-10-10&customer&group&orderBy=invoiceNumber&sort=desc";
				break;
			case "get sales history report":
				application_ENDPOINT_PATH="reports/sales?page=1&pageSize=5&group=Retail&startDate=2020-10-10&endDate=2023-10-10&orderBy=invoiceNumber&sort=desc";
				break;
			case "get sales highest":
				application_ENDPOINT_PATH="reports/sales/highest?pageSize=1&startDate=2022-1-1&endDate=2022-11-29&downloadType=pdf&download=true";
				break;
			case "sales-report-items":
				application_ENDPOINT_PATH="reports/sales/invoicelineitems?startDate=2022-12-02&endDate=2022-12-02";
				break;
			case "get purchases report":
				application_ENDPOINT_PATH="reports/purchases?startDate=2022-12-02&endDate=2022-12-02&downloadType=pdf&itemNumber=&supplierNumber=&manufacturer=&category=&subCategory=&family=&groupCode=";
				break;
			case "get customer balance statement":
				application_ENDPOINT_PATH="reports/customers/balance-statement?startDate=2022-11-04&endDate=2022-12-04&customerNumber=2565";
				break;
			case "purchases get polineItems":
				application_ENDPOINT_PATH="reports/purchases/polineitems?page=1&pageSize=10&startDate=2020-02-01&endDate=2020-02-29&stockItemNumber=11286";
				break;
			case "sales invoice line items":
				application_ENDPOINT_PATH="reports/invoice/invoicelineitems?startDate=2022-11-01&endDate=2022-11-30&family=BACKWOODS&page=3&pageSize=10&customerNumber=2665&category=CIGARETTES&subCategory=a&itemNumber=11154&manufacturer=ALTADIS USA&family=op&description=e";
				break;
			case "return sales":
				application_ENDPOINT_PATH="reports/sales/returns?startDate=2022-11-15&endDate=2022-11-30&page=3&pageSize=10&customerNumber=2565&itemNumber=23425&type=returns&invoiceNumber=1115221-374";
				break;
			}
			result=requestSpecification.get(getBaseUrl() + application_ENDPOINT_PATH);
	     	return result;
		}
	
		
		
	}