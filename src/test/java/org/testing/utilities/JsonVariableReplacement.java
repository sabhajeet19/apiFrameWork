package org.testing.utilities;

import java.util.regex.Pattern;

public class JsonVariableReplacement {
	public static String variableReplace(String Data,String variableName,String variableValue) {
	Data = Data.replaceAll(Pattern.quote("{{"+variableName+"}}"), variableValue);
	//System.out.println("Data is: +"+Data);
	return Data;
	}

}
