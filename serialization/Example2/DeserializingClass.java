package serialization.Example2;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

public class DeserializingClass {

	public static void main(String[] args) {
		Employee emp = null;

		try {
			FileInputStream fileIn = new FileInputStream(
					"D:\\JavaLearning\\JavaLearning\\src\\serialization\\Example2\\Employee.txt");
			ObjectInputStream in = new ObjectInputStream(fileIn);

			emp = (Employee) in.readObject();

			fileIn.close();
			in.close();

			emp.printDetails();
		} catch (IOException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}

	}

}

/*
 * after executing this, the value of address, companyName and companyCEO will
 * be null the reason being they were marked as static and transient transient
 * variables are not serialized. Thus while deserializing, these variables will
 * be initialized with default values i.e for objects it is null, for int 0
 * ,etc. similarly static variables are also not serialized. During
 * deserialization, they will be loaded with current value defined in the class
 */
