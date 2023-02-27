package generics;

//Program to find the largest of three comaparable objects using generic method

/*
 * sometimes we want to restrict the kind of types that are allowed to be passed to a
   type parameter e.g a method that operates on numbers only
 * this is called bounded type parameters
 * to declare a bounded type parameter, list the type parameter's name, followed by the 
   extends keyword, followed by its upper bound 
*/

public class BoundedTypeParameter {

	public static <T extends Comparable<T>> T maximum(T first, T second, T third) {
		T max = first;

		if (second.compareTo(max) > 0)
			max = second;

		if (third.compareTo(max) > 0)
			max = third;

		return max;
	}

	public static <E> String arrayToString(E[] arr) {
		StringBuilder sb = new StringBuilder();
		for (E element : arr)
			sb.append(element + " ");
		return sb.toString();
	}

	public static void main(String[] args) {
		Integer[] arr = { 2, 5, 3 };
		String[] strArray = { "Bob", "Mice", "Pink" };

		// Max of integers
		System.out.print("Max out of " + arrayToString(arr) + " is ");
		System.out.println(maximum(arr[0], arr[1], arr[2]));

		// Max of strings
		System.out.print("Max out of " + arrayToString(strArray) + " is ");
		System.out.println(maximum(strArray[0], strArray[1], strArray[2]));

	}
}
