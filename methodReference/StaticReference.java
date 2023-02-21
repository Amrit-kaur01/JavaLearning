package methodReference;

/*
 * method reference is used to refer method of functional interface
 * compact and easy form of lambda expression
 * while referring to a method, we can replace lambda expression with method reference
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
