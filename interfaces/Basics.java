package interfaces;

/*
 * interface is a reference type that can contain only constants, abstract methods, default methods
   and static methods
 * method bodies exist only for default and static methods
 * interface contains behavior that a class implements
 * method in an interface is implicitly abstract so we do not need to use abstract keyword
 * methods are implicitly public within it 
 * all fields are public, static and final by default
 * interfaces are used to achieve abstraction and multiple inheritance
 * Since java 9, we can have private methods in interface
*/

interface Vehicle {
	void run();
}

class Car implements Vehicle

{
	
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void run()
	{
		System.out.println("Car is running");
	}
}

public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car obj = new Car();
		obj.run();

	}

}
