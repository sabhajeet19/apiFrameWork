package org.testing.TestStep;

import static io.restassured.RestAssured.*;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

//uri ............> from properties file
// properties file .......> from object

public class HTTPMethods {
	Properties prObject;
	public HTTPMethods(Properties prObject){
		this.prObject = prObject;
		
	}
	// post request
	/*public void postMethod(String uriKey,String bodyData) {
	Response res =
		given()
		.contentType(ContentType.JSON)
		.body(bodyData)
		.when()
		.post(prObject.getProperty(uriKey));
		System.out.println("Status code: "+res.statusCode());
		System.out.println(res.asString());
		}*/
	public Response postMethod(String uriKey,String bodyData) {
		Response res =
			given()
			.contentType(ContentType.JSON)
			.body(bodyData)
			.when()
			.post(prObject.getProperty(uriKey));
			//System.out.println("Status code: "+res.statusCode());
			//System.out.println(res.asString());
			return res;
			}
	public Response getMethod(String uriKey,String endPoint) {
		String uri = prObject.getProperty(uriKey)+"/"+endPoint;
		Response res =
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(uri);
		return res;
		}
	// get all records
	public Response getAllMethod(String uriKey) {
		String uri = prObject.getProperty(uriKey);
		Response res =
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(uri);
		return res;
		}
		
	public Response putRequest(String bodyData,String uriKey,String endPoint) {
		String uri = prObject.getProperty(uriKey)+"/"+endPoint;
		Response res = 
		given()
		.contentType(ContentType.JSON)
		.body(bodyData)
		.when()
		.put(uri);
		return res;
		
	}
	public Response deleteMethod(String uriKey,String endPoint) {
		String uri = prObject.getProperty(uriKey)+"/"+endPoint;
		Response res =
		given()
		.contentType(ContentType.JSON)
		.when()
		.delete(uri);
		return res;
		}
	public Response getMethod(String uriKey,String querypara1, String querypara2) {
		String uri = prObject.getProperty(uriKey)+"?"+"noofRecords="+querypara1+"&"+"idStarts="+querypara2;
		Response res =
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(uri);
		return res;
		}
	

}
