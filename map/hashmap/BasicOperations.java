package map.hashmap;

import java.util.*;

/*
 * map interface in java allows to store the data in key-value pairs
 * keys are unique identifiers used for associating each value on a map
 * does not allow duplicate keys
 * if duplicate keys are inserted, it will overwrite the previous value 
 * HashMap class implements the map interface and extend the AbstractMap class
 * HashMap and LinkedHashMap allows null keys and values, TreeMap doesn't.
 * it allows one null key and multiple null values
 * uses hashing technique to access the values through keys 
 * non-synchronized
 */
public class BasicOperations {
	public static void main(String[] args) {
		Map<Integer, Character> map = new HashMap<Integer, Character>(); // default initialization

		// Adding elements
		/*
		 * insertion order is not maintained for every element, a separate hash is
		 * generated internally
		 */
		map.put(1, 'A');
		map.put(2, 'B');
		map.put(3, 'C');
		map.put(4, 'D');
		map.put(5, 'E');

		System.out.println(map);

		// Removing elements
		// We will pass the key value in the remove() method to eliminate the associated
		// value
		map.remove(4);

		System.out.println("Map after removing key value 4");
		System.out.println(map);

		// Changing elements
		// we can change the already added elements using the same put() method. we have
		// to pass the same key again
		map.put(5, 'e');
		System.out.println("Map after updating key value 5");
		System.out.println(map);

		// map.clear(); //this method removes all the mappings

		System.out.println(map.containsKey(1)); // returns a boolean value depending on whether the specified key is
												// mapped or not

		Map<Integer, Character> map2 = new HashMap<>();
		map2.putAll(map); // copies all the mappings of map in map2

		// Replace value
		map.replace(4, 'd');
	}
}

/*
 * Standard examples of using map includes: map of cities and and their zip
 * codes map of employees and their managers map of errors and their
 * descriptions
 */