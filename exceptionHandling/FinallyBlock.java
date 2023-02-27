package exceptionHandling;

/*
 * finally block is always executed whether the exception is handled or not
 * it contains all the necessary statements that need to be executed regardless of the exception 
 * it follows the try-catch block
 * can be used to put clean-up code like closing a file, closing a connection, etc.
 * there can be only one finally block
 * the finally block will not be executed if the program exits either by calling System.exit() or by
   causing a fatal error that causes the process to abort
*/

public class FinallyBlock {
	public static void main(String[] args) {
		try {
			System.out.println("Inside try block");
			int data = 2 / 0;
			System.out.println(data);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		} finally {
			System.out.println("Finally block is always executed");
		}

	}
}
/*
 * the code throws an exception however the catch block cannot handle it.
 * Despite this, the finally block is executed after the try block and then the
 * program terminates abnormally.
 */