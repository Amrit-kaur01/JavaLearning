package map.treemap;

/*
 * TreeMap class implements Map and SortedMap interface 
 * differs from other maps as it provides efficient way for sorting the map
 * maintains ascending order
 * red-black tree based implementation
 * non-synchronized
 * null key is not allowed
 */

import java.util.*;

public class Basics {
	public static void main(String[] args) {
		Map<Integer, String> employeeMap = new TreeMap<>();
		employeeMap.put(101, "Employee1");
		employeeMap.put(102, "Employee2");
		employeeMap.put(103, "Employee3");
		employeeMap.put(104, "Employee4");
		employeeMap.put(105, "Employee5");

		System.out.println(employeeMap);

	}
}
