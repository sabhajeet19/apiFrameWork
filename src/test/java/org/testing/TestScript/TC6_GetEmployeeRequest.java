package org.testing.TestScript;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.testing.Responsevalidation.ValidateResponse;
import org.testing.TestStep.HTTPMethods;
import org.testing.utilities.JsonparsingUsingJsonPath;
import org.testing.utilities.LoadProperty;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class TC6_GetEmployeeRequest {
//https://hub.dummyapis.com/employee?noofRecords=10&idStarts=1001
//QA_URI_Employee
	public void testCase6() throws IOException {
		Properties p =LoadProperty.handlePropertyFile("../apiFrameWork/URI.properties");
		HTTPMethods http = new HTTPMethods(p);
		Response res = http.getMethod("QA_URI_Employee", "10","1001");
		System.out.println("***********Test Case Number 6 **********");
		System.out.println("status code is: "+res.statusCode());
		try {
			String s = "[0].lastName";
			System.out.println(JsonparsingUsingJsonPath.parseJson(s, res));
			//System.out.println(JsonparsingUsingJsonPath.parseJsonint(s, res));
			
			//System.out.println(a);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Response Data is : "+res.asString());
		ValidateResponse.statusCodeValidate(200, res);
		ValidateResponse.dataValidate("1008", res, "id");
		//
		//
		
	}

	
	
	
}


