package Methods;
//Example of variable length arguents method

/*
 * It is a method that takes variable number of arguments
 * Internally it is implemented using the single dimensional arrays
 * A variable length argument is specified by three periods or dots
 * It can be called with zero or more arguments
 */

public class VarArgs {
	public static void main(String[] args) {

		fun();

		fun(1, 2, 3);

		fun(5, 6, 7, 8, 9, 10);
	}

	// Method takes variable number of integer arguments and then prints them
	static void fun(int... var) {
		for (int i : var)
			System.out.print(i + ", ");
		System.out.println();
	}

	// Example of method that has variable length parameters with other parameters
	// too. There must exist only one varargs parameter that too in the last of the
	// parameter list
	static void fun2(int a, double... doubleArray) {
		System.out.println("a: " + a);

		for (double d : doubleArray)
			System.out.print(d + ", ");
	}
}
