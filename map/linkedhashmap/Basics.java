package map.linkedhashmap;

/*
 * inherits HashMap class
 * similar to HashMap with the added functionality of maintaining order
 */

import java.util.*;

public class Basics {
	public static void main(String[] args) {
		Map<String, String> statesCapitals = new LinkedHashMap<>();
		statesCapitals.put("MP", "Bhopal");
		statesCapitals.put("Punjab", "Chandigarh");
		statesCapitals.put("UP", "Lucknow");

		System.out.println("Keys:" + statesCapitals.keySet());
		System.out.println("Values:" + statesCapitals.values());

	}
}
