package org.testing.TestScript;
import java.io.IOException;
import java.util.Properties;

import org.testing.Responsevalidation.ValidateResponse;
import org.testing.TestStep.HTTPMethods;
//import org.testing.utilities.JsonParsingUsingJsonOrg;
//import org.testing.utilities.JsonVariableReplacement;
//import org.testing.utilities.LoadJsonFile;
import org.testing.utilities.LoadProperty;
//import org.testing.utilities.RandomNumberGeneration;

import io.restassured.response.Response;
public class TC5_Delete_Request {
	public void testcase5() throws IOException {
		
		Properties p =LoadProperty.handlePropertyFile("../apiFrameWork/URI.properties");
		HTTPMethods http = new HTTPMethods(p);
		Response res = http.deleteMethod("QA_URI_EmployeeInformation",TC1_PostRequest.respIdValue );
		System.out.println("***********Test Case Number 5 **********");
		System.out.println("status code is: "+res.statusCode());
		ValidateResponse.statusCodeValidate(200, res);
		ValidateResponse.dataValidate("xyz", res, "id");
		
	}

}
