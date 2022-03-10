package org.testing.utilities;

import org.json.JSONObject;
import org.json.XML;

public class Conversion {
	public static String xmltoJson(String xmlData) {
		JSONObject js = XML.toJSONObject(xmlData);
		return js.toString();
		
	} 
	public static String Jsontoxml (String json_data) {
		JSONObject obj = new JSONObject (json_data);
		String xml_data = XML.toString(obj);
		return xml_data;
		}

}
