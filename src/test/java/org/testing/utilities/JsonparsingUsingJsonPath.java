package org.testing.utilities;

import io.restassured.response.Response;

public class JsonparsingUsingJsonPath {
	public static String parseJson(String jsonpath,Response res) {
		return res.jsonPath().get(jsonpath);
	}
	public static int parseJsonint(String jsonpath,Response res) {
		return res.jsonPath().get(jsonpath);
	}

}
