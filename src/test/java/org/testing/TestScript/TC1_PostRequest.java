package org.testing.TestScript;

import java.io.IOException;
import java.util.Properties;

import org.testing.Responsevalidation.ValidateResponse;
import org.testing.TestStep.HTTPMethods;
import org.testing.utilities.ExcelDataRead;
import org.testing.utilities.JsonParsingUsingJsonOrg;
import org.testing.utilities.JsonVariableReplacement;
import org.testing.utilities.LoadJsonFile;
import org.testing.utilities.LoadProperty;
import org.testing.utilities.RandomNumberGeneration;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import jxl.read.biff.BiffException;

public class TC1_PostRequest {
	static String respIdValue; //reponse parsing
	//post request
	/*public static void main(String[] args) throws IOException {
	Properties p =LoadProperty.handlePropertyFile("../apiFrameWork/URI.properties");
	String body = LoadJsonFile.handleJson("../apiFrameWork/src/test/java/org/testing/resources/bodyData.json");
	HTTPMethods http = new HTTPMethods(p);
	http.postMethod("QA_URI_ImployeeInformation", body);
	}*/
	@Test
	public void testCase1() throws IOException, BiffException {
		Properties p =LoadProperty.handlePropertyFile("../apiFrameWork/URI.properties");
		String body = LoadJsonFile.handleJson("../apiFrameWork/src/test/java/org/testing/resources/bodyData.json");
		body = JsonVariableReplacement.variableReplace(body, "id", RandomNumberGeneration.randomnumber());
		//body = JsonVariableReplacement.variableReplace(body, "firstName", ExcelDataRead.readACell(1, 0));
		//body = JsonVariableReplacement.variableReplace(body, "lastName", ExcelDataRead.readACell(1, 1));
		
		HTTPMethods http = new HTTPMethods(p);
		Response r = http.postMethod("QA_URI_EmployeeInformation", body);
		System.out.println("Test Case Number 1 ");
		System.out.println("Status code is: "+r.statusCode());
		ValidateResponse.statusCodeValidate(201, r);
		ValidateResponse.dataValidate("xyz", r, "id");
		respIdValue =JsonParsingUsingJsonOrg.parseJson(r.asString(),"id");
		}


}