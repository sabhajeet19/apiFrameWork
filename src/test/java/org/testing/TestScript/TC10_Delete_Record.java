package org.testing.TestScript;

import static io.restassured.RestAssured.*;

import java.io.IOException;
import java.util.Properties;

import org.testing.Responsevalidation.ValidateResponse;
import org.testing.TestStep.HTTPMethods;
import org.testing.utilities.JsonParsingUsingJsonOrg;
import org.testing.utilities.LoadProperty;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TC10_Delete_Record {
	//static String respIdValue;
	//QA_URI_employeeDelete:http://dummy.restapiexample.com/api/v1/delete
   public void testCase10() throws IOException {
	   
	   Properties p =LoadProperty.handlePropertyFile("../apiFrameWork/URI.properties");
		HTTPMethods http = new HTTPMethods(p);
		Response res = http.deleteMethod("QA_URI_employeeDelete",TC7_PostRequest_RestApiExample.respIdValue );
		System.out.println("***********Test Case Number 10 **********");
		System.out.println("status code is: "+res.statusCode());
		ValidateResponse.statusCodeValidate(200, res);
		ValidateResponse.dataValidate("xyz", res, "id");
		//respIdValue =JsonParsingUsingJsonOrg.parseJson(res.asString(),"id");
   }
}
