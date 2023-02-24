package generics.wildcards;

import java.util.Arrays;
import java.util.List;

/*
 * unbounded wildcards represents the list of an unknown type such as List<?>
 * This approach is used in following scenarios:
   1. when the given method is implemented by using the functionality provided in object class
   2. when the generic class contains the methods that don't depend on the type parameter
*/

public class UnboundedWildcards {

	public static void displayList(List<?> list)
	{
		for(Object obj: list)
			System.out.print(obj+" ");
	}
	
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(4,6,2,3);
		System.out.println("Displaying list1");
		displayList(list1);
		
		System.out.println();
		
		List<String> list2 = Arrays.asList("Bob","Hey","there");
		System.out.println("Displaying list2");
		displayList(list2);
	}
}
