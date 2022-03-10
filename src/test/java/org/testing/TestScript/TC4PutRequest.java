package org.testing.TestScript;

import java.io.IOException;
import java.util.Properties;

import org.testing.Responsevalidation.ValidateResponse;
import org.testing.TestStep.HTTPMethods;
import org.testing.utilities.ExcelDataRead;
import org.testing.utilities.JsonVariableReplacement;
import org.testing.utilities.LoadJsonFile;
import org.testing.utilities.LoadProperty;
import org.testing.utilities.RandomNumberGeneration;

import io.restassured.response.Response;
import jxl.read.biff.BiffException;

public class TC4PutRequest {
	public void testCase4() throws IOException, BiffException {
		Properties p =LoadProperty.handlePropertyFile("../apiFrameWork/URI.properties");
		String body = LoadJsonFile.handleJson("../apiFrameWork/src/test/java/org/testing/resources/updateBodyData.json");
		body = JsonVariableReplacement.variableReplace(body, "id", TC1_PostRequest.respIdValue);
		body = JsonVariableReplacement.variableReplace(body, "firstName", ExcelDataRead.readACell(1, 0));
		body = JsonVariableReplacement.variableReplace(body, "lastName", ExcelDataRead.readACell(1, 1));
		HTTPMethods http = new HTTPMethods(p);
		Response res = http.putRequest(body, "QA_URI_EmployeeInformation", TC1_PostRequest.respIdValue);
		System.out.println("***********Test Case Number 4 **********");
		System.out.println("Status code is: "+res.statusCode());
		ValidateResponse.statusCodeValidate(200, res);
		ValidateResponse.dataValidate("akash", res, "firstName");
		System.out.println("body data is: "+res.asString());
	}

}
