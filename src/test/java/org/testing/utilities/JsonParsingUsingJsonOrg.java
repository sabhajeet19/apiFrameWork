package org.testing.utilities;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonParsingUsingJsonOrg {
	public static String parseJson(String data,String keyName) {
		JSONObject ob = new JSONObject(data);
		return ob.getString(keyName).toString();
	}
	public static void parseAllIds(String data, String keyName) {
		JSONArray jarray = new JSONArray(data);
		int l = jarray.length();
		for( int i = 0;i<l;i++){
			JSONObject ob = jarray.getJSONObject(i);
			System.out.println(ob.get(keyName));
		}
		
		
	}

}
