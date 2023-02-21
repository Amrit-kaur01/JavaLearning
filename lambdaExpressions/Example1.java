package lambdaExpressions;

/* to pass a lambda expression in a method, the method should have a parameter with a single-method
   interface as its type. Calling the interface's method will run the lambda expression
*/

interface StringFunction{
	String run(String str);
}

public class Example1 {

	public static void main(String[] args) {
		
		StringFunction exclaim = (s) -> s+"!";
		StringFunction question = (s) -> s+"?";
		
		print("Hello", exclaim);
		print("Hello", question);
		
		
	}
	
	public static void print(String message, StringFunction method)
	{
		String result = method.run(message);
		System.out.println(result);
	}

}
