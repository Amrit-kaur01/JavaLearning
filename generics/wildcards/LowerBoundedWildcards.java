package generics.wildcards;

import java.util.Arrays;
import java.util.List;

/*
 * its purpose is to restrict the unknown type to be a specific type or a supertype of that type
 * used by declaring the wildcard character ?, followed by super keyword, followed by its lower bound
 * For example, List<? super Integer> is suitable for a list of type Integer or any of its
   superclasses like Number,Object. So List<? super Integer> is less restrictive than List<Integer>
*/

public class LowerBoundedWildcards {

	public static void displayList(List<? super Integer> list) {
		System.out.println(list);
	}

	public static void main(String[] args) {

		List<Integer> list1 = Arrays.asList(6, 7, 8, 9);
		displayList(list1);

		List<Object> list2 = Arrays.asList("Hey", "There");
		displayList(list2);

	}

}
