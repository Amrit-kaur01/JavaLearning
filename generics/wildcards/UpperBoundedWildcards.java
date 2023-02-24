package generics.wildcards;

import java.util.ArrayList;
import java.util.List;

/*
 * the purpose of upper bounded wildcards is to decrease the restrictions on a variable
 * it restricts the unknown type to be a specific type or a subtype of that type
 * used by declaring wildcard character followed by the extends keyword, followed by its
   upper bound
 * Using List<? extends Number> is suitable for a list of type Number or any of its 
   subclasses like Integer,Doble whereas List<Number> works with the list of type Number 
   only. So, List<? extends Number> is less restrictive than List<Number>
*/
public class UpperBoundedWildcards {
	
	private static double add(List<? extends Number> num)
	{
		double sum = 0.0;
		
		for(Number n:num)
			sum+= n.doubleValue();
		return sum;
	}
	
	public static void main(String[] args) {
		List<Integer> list1 = List.of(4,2,7,5,1);
		System.out.println("Sum of list1 = "+add(list1));
		
		List<Float> list2 = List.of(2.3f,4.5f,5.6f,3.0f);
		System.out.println("Sum of list2 = "+add(list2));
	}

}
