package interfaces;

/*
 * if an interface is empty it is called marker interface
 * it does not contain any methods, fields, or constants
 * it is used to tag the classes 
 * used to provide some essential information to the JVM so that JVM may perform some useful operations
 * Example: Serializable and Cloneable 
*/

//Implementing cloneable interface
/*
 * generates the copy of an object with a different name
 * implements the clone method of an object class to it
 * class that implements the clone method must override the clone() method by using public method
 */

class Student implements Cloneable {
	int rollno;
	String name;

	public Student(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class MarkerInterfacesExample {
	public static void main(String[] args) {
		Student s1 = new Student(101, "Aman");
		System.out.println(s1.rollno + " " + s1.name);
		try {
			Student s2 = (Student) s1.clone();
			System.out.println(s2.rollno + " " + s2.name);
		} catch (CloneNotSupportedException e) {
			System.out.println(e);
		}

	}
}
