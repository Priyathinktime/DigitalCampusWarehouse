package com.thinktimetechno.Warehouse.endpoints;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Map;

import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class BaseEndpoints {
	public static final int SUCCESS_STATUS_CODE = 200;

	public static final int GET_REQUEST = 0;
	public static final int POST_REQUEST = 1;
	public static final int DELETE_REQUEST = 2;
	public static final int PUT_REQUEST = 3;
	public static String tokenkey=null;

//	protected final String base_url = "https://reqres.in/api/users";
	
		protected final String base_url = "http://13.126.80.187:5000/api/";
	public BaseEndpoints() {
	}
	
	public void verifyResponseKeyValues(String key, String val, Response r) {
		String keyValue = r.jsonPath().getString(key);
		assertThat(keyValue, is(val));
	}
	public String verifyTokenResponseKeyValues(String key,Response r) {
		tokenkey = r.jsonPath().getString(key);
		return tokenkey;
	}

	public void verifyTrue(boolean val) {
		assertTrue(val);
	}

	public void verifyFalse(boolean val) {
		assertFalse(val);
		;
	}

	public void verifyResponseStatusValue(Response response, int expectedCode) {
		assertThat(response.getStatusCode(), is(expectedCode));
	}

	public String getBaseUrl() {
		return this.base_url;
	}

	public void verifyNestedResponseKeyValues(String nestTedCompnent, String key, String val, Response r) {
		Map<String, String> nestedJSON = r.jsonPath().getMap(nestTedCompnent);
		String actual = String.valueOf(nestedJSON.get(key));
		assertThat(actual, is(val));
	}

	public void verifyNestedArrayValueResponseKeyValues(String nestTedCompnent, String[] val, Response r) {

		ArrayList<Object> nestedArray = (ArrayList<Object>) r.jsonPath().getList(nestTedCompnent);

		String actual;

		for (int i = 0; i < nestedArray.size(); i++) {
			actual = (String) nestedArray.get(i);
			assertThat(actual, is(val[i]));
		}
	}

	public void verifyNestedArrayMapResponseKeyValues(String nestTedCompnent, String key, String[] val, Response r) {
		ArrayList<Object> nestedArray = (ArrayList<Object>) r.jsonPath().getList(nestTedCompnent);

		String actual;
		for (int i = 0; i < nestedArray.size(); i++) {
			Map<String, String> map = (Map<String, String>) nestedArray.get(i);
			actual = String.valueOf(map.get(key));
			assertThat(actual, is(val[i]));
		}
	}

	public RequestSpecification getRequestWithJSONHeaders(String token) {
		RequestSpecification r = RestAssured.given();
		r.header("Content-Type", "application/json");
		r.header("Authorization", "Bearer " + token);
//		.contentType(ContentType.JSON)
        
		return r;
	}
	public RequestSpecification getRequestWithJSONHeadersToken(String token) {
		RequestSpecification r = RestAssured.given();
		r.header("Content-Type", "application/json");
		r.header("Authorization", "Bearer " + token);
//		.contentType(ContentType.JSON)
        
		return r;
	}
	public RequestSpecification getRequestWithJSONHeaders() {
		RequestSpecification r = RestAssured.given();
		r.header("Content-Type", "application/json");
        
		return r;
	}
	public RequestSpecification getRequestWithJSONHeaders(String P,String S) {
		RequestSpecification r = RestAssured.given();
		r.header("Content-Type", "application/json");
		r.header(P, S);
		return r;
	}

	public RequestSpecification getRequestWithXMLHeaders() {
		RequestSpecification r = RestAssured.given();
		r.header("Content-Type", "application/xml");
		return r;
	}

	protected JSONObject createJSONPayload(Object pojo) {
		return new JSONObject(pojo);
	}
//	public JSONObject createJSONPayload(Object pojo) {
//		return new JSONObject(pojo);
//	}


	public Response sendRequest(RequestSpecification request, int requestType, String url, Object pojo) {
		Response response = null;

		// Add the Json to the body of the request
		//if (null != pojo) {
			//String payload = createJSONPayload(pojo).toString();
			request.body(pojo);
		//}

		// need to add a switch based on request type
		switch (requestType) {
		case BaseEndpoints.GET_REQUEST:
			if (null == request) {
				response = RestAssured.when().get(url);
			} else {
				response = request.get(url);
			}
			break;
		case BaseEndpoints.POST_REQUEST:
			if (null == request) {
				response = RestAssured.when().post(url);
			} else {
				response = request.post(url);
			}
			break;
		case BaseEndpoints.DELETE_REQUEST:
			if (null == request) {
				response = RestAssured.when().delete(url);
			} else {
				response = request.delete(url);
			}
			break;
		case BaseEndpoints.PUT_REQUEST:
			if (null == request) {
				response = RestAssured.when().put(url);
			} else {
				response = request.put(url);
			}
			break;
		default:
			if (null == request) {
				response = RestAssured.when().post(url);
			} else {
				response = request.post(url);
			}
			response = request.post(url);
			break;
		}
		return response;
	}
}
