package org.testing.TestScript;

import java.io.IOException;
import java.util.Properties;

import org.testing.Responsevalidation.ValidateResponse;
import org.testing.TestStep.HTTPMethods;
import org.testing.utilities.LoadProperty;
import org.testng.Assert;

import io.restassured.response.Response;

public class TC2GetRequest {
	public void testCase2() throws IOException {
		Properties p =LoadProperty.handlePropertyFile("../apiFrameWork/URI.properties");
		HTTPMethods http = new HTTPMethods(p);
		Response res = http.getMethod("QA_URI_EmployeeInformation", TC1_PostRequest.respIdValue);
		System.out.println("***********Test Case Number 2 **********");
		//System.out.println("status code is: "+res.statusCode());
		//System.out.println("Response Data is : "+res.asString());
		//Assert.assertTrue(ValidateResponse.statusCodeValidate(200, res));
		//Assert.assertTrue(ValidateResponse.dataValidate("xyz", res, "id"));
		ValidateResponse.statusCodeValidate(200, res);
		ValidateResponse.dataValidate("xyz", res, "id");
		}

}
