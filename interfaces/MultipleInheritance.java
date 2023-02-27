package interfaces;

//program to demonstrate multiple inheritance using interfaces
interface Automobile {
	default void run() {
		System.out.println("automobile Running");
	}

	static void staticMethod() {
		System.out.println("Automobile static method");
	}

}

interface Engine {
	default void run() {
		System.out.println("Engine running");
	}

	static void staticMethod() {
		System.out.println("Engine static method");
	}
}

public class MultipleInheritance implements Automobile, Engine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MultipleInheritance obj = new MultipleInheritance();
		obj.run();

		Engine.staticMethod(); // we cannot call interface's static method using an object reference

	}

	// Since both the implemented interfaces have a default method run() with same
	// signature, we need to
	// override it in the class to remove any ambiguity
	// the implementation in class takes precedence over any default implementations
	@Override
	public void run() {

		Engine.super.run();
		System.out.println("Hey");
	}

}
