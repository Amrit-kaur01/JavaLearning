package map.hashmap;

import java.util.HashMap;
import java.util.Map;

/*
 * HashMap in java has four types of constructors
*/
public class Constructors {
	public static void main(String[] args) {

		// 1. public HashMap()
		/*
		 * produces an empty hashmap with default initial capacity of 16 and a load
		 * factor of 0.75 means after the map has reached 75% of its capacity, the
		 * capacity is doubled for a constant time performance
		 */
		Map<Integer, String> map1 = new HashMap<>();

		// 2. public HashMap(int initialCapacity)
		/*
		 * used to specify the initial capacity helps to avoid rehashing the no. of
		 * mappings to hold the hashmap
		 */

		// 3. public HashMap(int initialCapacity, float loadFactor)

		// 4. public HashMap(Map<?extends K, ?extends V> m)
		/*
		 * creates a map having the same mappings as the specified map load factor is
		 * 0.75
		 */
		Map<Integer, String> map2 = new HashMap<Integer, String>(map1);
	}
}

/*
 * Initial capacity is the capacity at the time of creation. It doubles
 * everytime it reaches a threshold Load factor when to increase the capacity of
 * hashmap. Default value is 0.75f
 */