package com.thinktimetechno.endpoints;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.json.JSONObject;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class postExample extends BaseEndpoints{


	 String token;
	RequestSpecification requestSpecification;
	public Response result;
	private  String application_ENDPOINT_PATH="";

	public Response applicationSalesCreatePayload(String jsonFile) throws IOException {
		token = "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNDA2OSIsImFjdGlvbiI6ImF1dGgiLCJ0b2tlbi12ZXJzaW9uIjowLCJpYXQiOjE2OTY1NjE2NDMsImV4cCI6MTY5NjY0ODA0M30.HPu3YpT_yPpAPfYGl6gVBMsbji-HZvMQhnjC51skc-I";
	//token = "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNDA2OSIsImFjdGlvbiI6ImF1dGgiLCJ0b2tlbi12ZXJzaW9uIjowLCJpYXQiOjE2OTY1MjQ2MzksImV4cCI6MTY5NjYxMTAzOX0.vOLmddV5M6vm1-IAOCtRQQKE9nCVnp6RCZFgsqITebM";
		requestSpecification = getRequestWithJSONHeadersToken(token);
		switch (jsonFile){
			case "applicationSalesFilters":
				application_ENDPOINT_PATH="/app";
				break;
		}
		File jsonDataInFile = new File(System.getProperty("user.dir")+"/src/test/resources/Payloads/"+jsonFile);
		result=requestSpecification.body(jsonDataInFile).post(getBaseUrl() + application_ENDPOINT_PATH);
     	return result;
	}

}
