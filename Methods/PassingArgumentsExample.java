package Methods;

import java.util.Arrays;
import java.util.Scanner;

public class PassingArgumentsExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		swapIntegers(num1, num2);

		System.out.println("After calling swap integers function");
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);

		int array[] = { 1, 2, 3, 4, 5 };
		modifyArray(array);
		System.out.println("Array after modification");
		System.out.println(Arrays.toString(array));

		sc.close();
	}

	// Swap the numbers
	public static void swapIntegers(int a, int b) {
		int temp = a;
		a = b;
		b = temp;

		/*
		 * This method will not change the actual values of the variables Because when
		 * we call this method the value of the variable will be passed That value will
		 * be stored in the local variable in this function Now any changes made will
		 * not be reflected back to the actual variable Main learning: If any primitive
		 * data types are passed to the function, the changes made will not be reflected
		 * back.
		 */
	}

	// Method to modify the values in array
	public static void modifyArray(int arr[]) {
		if (arr.length != 0)
			arr[0] = 50; // if you make a change to the object via this ref variable, same object will be
							// changed
		else
			return;

	}
}
