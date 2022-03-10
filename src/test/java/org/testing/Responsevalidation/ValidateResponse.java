package org.testing.Responsevalidation;

import org.testing.utilities.JsonParsingUsingJsonOrg;
import org.testng.Assert;

import io.restassured.response.Response;

public class ValidateResponse {
	public static boolean statusCodeValidate(int expectedStatusCode, Response res) {
		//Assert.assertEquals(res.statusCode(), expectedStatusCode, "status code not matching");
		if(expectedStatusCode== res.statusCode()) {
			System.out.println("Status code matching");
			return true;
		}
		else {
			System.out.println("status code not matching");
			return false;
		}
	}
	public static boolean dataValidate(String expectedData,Response res,String keyName){
		String actualData = JsonParsingUsingJsonOrg.parseJson(res.asString(), keyName);
		if(actualData.equals(expectedData)) {
			System.out.println("Data is matching");
			return true;
		}
		else {
			System.out.println("Data not matching");
			return false;
		}
		
		
	}

}
