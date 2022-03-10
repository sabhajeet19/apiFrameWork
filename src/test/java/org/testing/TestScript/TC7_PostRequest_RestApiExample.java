package org.testing.TestScript;

import java.io.IOException;
import java.util.Properties;

import org.json.JSONObject;
import org.testing.Responsevalidation.ValidateResponse;
import org.testing.TestStep.HTTPMethods;
import org.testing.utilities.JsonParsingUsingJsonOrg;
import org.testing.utilities.JsonVariableReplacement;
import org.testing.utilities.LoadJsonFile;
import org.testing.utilities.LoadProperty;
import org.testing.utilities.RandomNumberGeneration;

import io.restassured.response.Response;

public class TC7_PostRequest_RestApiExample {
	static String respIdValue;
	public void testCase7() throws IOException {
	//QA_URI_Restapiexample:http://dummy.restapiexample.com/api/v1/create
	Properties p =LoadProperty.handlePropertyFile("../apiFrameWork/URI.properties");
	String body = LoadJsonFile.handleJson("../apiFrameWork/src/test/java/org/testing/resources/bodyDataRestExample.json");
	HTTPMethods http = new HTTPMethods(p);
	Response r = http.postMethod("QA_URI_Restapiexample", body);
	System.out.println("********Test Case Number 7********** ");
	System.out.println("Status code is: "+r.statusCode());
	ValidateResponse.statusCodeValidate(200, r);
	ValidateResponse.dataValidate("xyz", r, "id");
	respIdValue =JsonParsingUsingJsonOrg.parseJson(r.asString(),"id");
	System.out.println(r.asString());
	JSONObject js = new JSONObject(r.asString());
	System.out.println(js.get("status"));
	System.out.println(js.get("message"));
	
	}

}
