package org.testing.utilities;

import java.util.Random;

public class RandomNumberGeneration {
	public static String randomnumber() {
		Random r = new Random();
		Integer i = r.nextInt();
		return i.toString();
	}

}
