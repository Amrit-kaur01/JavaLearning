package methodReference;

/*
 * we can also refer instance methods i.e. non-static methods
 * to refer we can use class objects or anonymous objects 
*/

/*
 * Syntax:
   		containingObject::instanceMethodName
 */

public class InstanceReference {

	public void saySomething() {
		System.out.println("Inside instance method");
	}

	public static void main(String[] args) {

		InstanceReference object = new InstanceReference();

		// referring non-static method using object
		Sayable sayable = object::saySomething;
		sayable.say(); // calling interface method

		// Referring non-static method using anonymous object
		Sayable sayable2 = new InstanceReference()::saySomething;
		sayable2.say();

	}

}
