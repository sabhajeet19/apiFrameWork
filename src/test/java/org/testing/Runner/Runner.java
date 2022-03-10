package org.testing.Runner;

import java.io.IOException;

import org.testing.TestScript.TC10_Delete_Record;
import org.testing.TestScript.TC11_InsertRecord;
import org.testing.TestScript.TC1_PostRequest;
import org.testing.TestScript.TC2GetRequest;
import org.testing.TestScript.TC3GetAllRecords;
import org.testing.TestScript.TC4PutRequest;
import org.testing.TestScript.TC5_Delete_Request;
import org.testing.TestScript.TC6_GetEmployeeRequest;
import org.testing.TestScript.TC7_PostRequest_RestApiExample;
import org.testing.TestScript.TC8_Get_AllEmployeeData;
import org.testing.TestScript.TC9_Get_OneRecord;

import jxl.read.biff.BiffException;

public class Runner {

	public static void main(String[] args) throws IOException, BiffException {
		
		try {
			TC1_PostRequest tc1 = new TC1_PostRequest();
			tc1.testCase1();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		try {
			TC2GetRequest tc2 = new TC2GetRequest();
			tc2.testCase2();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		try {
			TC3GetAllRecords tc3 = new TC3GetAllRecords();
			tc3.testCase3();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		try {
			TC4PutRequest tc4putRequest = new TC4PutRequest();
			tc4putRequest.testCase4();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		try {
			TC5_Delete_Request  tc5 = new TC5_Delete_Request();
			tc5.testcase5();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		try {
			TC6_GetEmployeeRequest tc6 = new TC6_GetEmployeeRequest();
			tc6.testCase6();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		try {
			TC7_PostRequest_RestApiExample tc7 = new TC7_PostRequest_RestApiExample();
			tc7.testCase7();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			TC8_Get_AllEmployeeData tc8 = new TC8_Get_AllEmployeeData();
			tc8.testcase8();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			TC9_Get_OneRecord tc9 = new TC9_Get_OneRecord();
			tc9.testCase9();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			TC10_Delete_Record tc10 = new TC10_Delete_Record();
			tc10.testCase10();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
		try {
			TC11_InsertRecord tc11 = new TC11_InsertRecord();
			tc11.testCase11();
		} catch (Exception e) {
			e.printStackTrace();
		
		}

	}

}
