package generics;

//Program to implement a generic method that can print the array of different types

public class PrintArray {

	public static <E> void printArray(E[] array) {
		for (E element : array)
			System.out.println(element);
		System.out.println();
	}

	public static void main(String[] args) {
		Integer[] intArray = { 1, 2, 3, 45, 65 };
		String[] stringArray = { "ABC", "DEF", "GHI" };
		Double[] doubleArray = { 1.2, 5.3, 7.8, 6.0 };

		printArray(intArray); // prints an integer array

		printArray(stringArray); // prints a string array

		printArray(doubleArray); // prints a double array

	}
}
