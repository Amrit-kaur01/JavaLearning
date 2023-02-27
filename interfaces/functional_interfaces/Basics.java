package interfaces.functional_interfaces;

/*
 * functional interface is an interface that has only one pure abstract method
 * can have any no. of static and default methods
 * can also have public methods of java.lang.Object classes
 * examples : Runnable, ActionListener, ItemListener
*/

//Example of functional interface
interface Song {
	void sing(String lyrics);
}

//Basics class is implementing the functional interface
public class Basics implements Song {

	public void sing(String lyrics) {
		System.out.println(lyrics);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Basics obj = new Basics();
		obj.sing("jhalak dikhla ja");

	}

}
