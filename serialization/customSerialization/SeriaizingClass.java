package serialization.customSerialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SeriaizingClass {

	public static void main(String[] args) {
		Person p = new Person(20, "John");
		Address add = new Address(15);

		Employee emp = new Employee(add, p);

		String filename = "D:\\JavaLearning\\JavaLearning\\src\\serialization\\customSerialization\\employee.txt";

		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);

			// Serializing the object
			out.writeObject(emp);

			System.out.println("Object serialized");

			out.close();
			file.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
