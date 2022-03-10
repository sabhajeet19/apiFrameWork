package org.testing.TestScript;

import java.io.IOException;
import java.util.Properties;

import org.json.JSONObject;
import org.testing.Responsevalidation.ValidateResponse;
import org.testing.TestStep.HTTPMethods;
import org.testing.utilities.LoadProperty;

import io.restassured.response.Response;

public class TC9_Get_OneRecord {
	public void testCase9() throws IOException {
		
		Properties p =LoadProperty.handlePropertyFile("../apiFrameWork/URI.properties");
		HTTPMethods http = new HTTPMethods(p);
		Response res = http.getMethod("QA_URI_employee", "1");
		System.out.println("***********Test Case Number 9 **********");
		System.out.println("status code is: "+res.statusCode());
		System.out.println("Response Data is : "+res.asString());
		JSONObject js = new JSONObject(res.asString());
		ValidateResponse.statusCodeValidate(200, res);//validate status code
		ValidateResponse.dataValidate("xyz", res, "id");// validat data
		System.out.println(js.get("status"));
		System.out.println(js.get("message"));
		JSONObject js1 = js.getJSONObject("data");
		System.out.println(js1.get("id"));
	}

}
