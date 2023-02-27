package lambdaExpressions;

interface Sayable {
	public String say();
}

interface Addable {
	int add(int a, int b);
}

public class Example2 extends Exception {
	public static void main(String[] args) {
		Sayable s = () -> { // lambda expression with no parameter
			return "Hey there";
		};

		System.out.println(s.say());

		// Multiple parameters in lambda expression
		Addable add1 = (a, b) -> (a + b);
		System.out.println(add1.add(3, 4));

		// Multiple parameters with data type in lambda expression
		Addable add2 = (int a, int b) -> (a + b);
		System.out.println(add2.add(20, 32));

	}
}

/*
 * compiler, in most cases, is able to resolve the type of the parameter with
 * the help of type inference. adding type to parameters is optional and can be
 * omitted
 * 
 */
