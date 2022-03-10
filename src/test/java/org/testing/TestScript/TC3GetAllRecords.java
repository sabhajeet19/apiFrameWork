package org.testing.TestScript;

import java.io.IOException;
import java.util.Properties;

import org.testing.Responsevalidation.ValidateResponse;
import org.testing.TestStep.HTTPMethods;
import org.testing.utilities.JsonParsingUsingJsonOrg;
import org.testing.utilities.LoadProperty;

import io.restassured.response.Response;

public class TC3GetAllRecords {
	
	public void testCase3() throws IOException {
		Properties p =LoadProperty.handlePropertyFile("../apiFrameWork/URI.properties");
		HTTPMethods http = new HTTPMethods(p);
		Response res = http.getAllMethod("QA_URI_EmployeeInformation");
		System.out.println("***********Test Case Number 3 **********");
		System.out.println("Status code is: "+res.getStatusCode());
		ValidateResponse.statusCodeValidate(200, res);
		ValidateResponse.dataValidate("xyz", res, "id");
		JsonParsingUsingJsonOrg.parseAllIds(res.asString(), "id");

}
}