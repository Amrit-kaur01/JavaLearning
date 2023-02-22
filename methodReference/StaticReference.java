package methodReference;

/*
 * method reference is used to refer method of functional interface
 * compact and easy form of lambda expression
 * while referring to a method, we can replace lambda expression with method reference
 * can be used to replace the single method of the lambda expression
 * we don't have to pass arguments to method references
*/

//Program to illustrate reference to a static method

interface Sayable{
	void say();
}


public class StaticReference {
	
	public static void saySomething()
	{
		System.out.println("Inside static method");
	}

	public static void main(String[] args) {
		Sayable sayable = StaticReference::saySomething;
		
		sayable.say();  //calling interface method
	}

}
