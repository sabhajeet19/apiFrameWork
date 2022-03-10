package org.testing.TestScript;

import java.io.IOException;
import java.util.Properties;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testing.Responsevalidation.ValidateResponse;
import org.testing.TestStep.HTTPMethods;
import org.testing.utilities.JsonParsingUsingJsonOrg;
import org.testing.utilities.LoadProperty;

import io.restassured.response.Response;
//QA_URI_employees:http://dummy.restapiexample.com/api/v1/employees
public class TC8_Get_AllEmployeeData {
	public void testcase8() throws IOException {
		
		Properties p =LoadProperty.handlePropertyFile("../apiFrameWork/URI.properties");
		HTTPMethods http = new HTTPMethods(p);
		Response res = http.getAllMethod("QA_URI_employees");
		System.out.println("***********Test Case Number 8 **********");
		System.out.println("Status code is: "+res.getStatusCode());
		System.out.println(res.asString());
		ValidateResponse.statusCodeValidate(200, res);
		ValidateResponse.dataValidate("xyz", res, "id");
		JsonParsingUsingJsonOrg.parseAllIds(res.asString(), "id");
		JSONArray array = new JSONArray(res.asString());
		JSONObject js = array.getJSONObject(2);
		System.out.println(js.get("id"));
		System.out.println(js.get("status"));
		System.out.println(js.get("message"));
	}

}
