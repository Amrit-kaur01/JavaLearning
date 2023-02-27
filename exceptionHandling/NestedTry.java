package exceptionHandling;

/*
 *using try block inside another try block is called nested try block
 * Sometimes a situation may arise where a part of a block may cause one type of error and the entire
   block itself may cause another error. In such a case exception handlers have to be nested 
*/
public class NestedTry {
	public static void main(String[] args) {
		// outer try block
		try {
			// inner try block 1
			try {
				int num = 10 / 0;
				System.out.println(num);
			}
			// catch block of inner try block 1
			catch (Exception e) {
				System.out.println(e);

			}

			// inner try block 2
			try {
				int arr[] = new int[6];
				arr[6] = 10;
			}
			// catch block of inner try block 2
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}

			System.out.println("Othe statements of outer try block");
		}
		// catch block of outer try block
		catch (Exception e) {
			System.out.println("Outer catch");
		}

		System.out.println("Normal flow");
	}
}

/*
 * when any try block does not have the catch block for a particular exception,
 * then the catch block of the outer(parent) try block are checked for that
 * exception, and if it matches the catch block of the outer try block is
 * executed
 * 
 * if none of the catch block is able to handle the exception, then the java
 * runtime system will handle the exception by displaying the system generated
 * message for that exception
 */