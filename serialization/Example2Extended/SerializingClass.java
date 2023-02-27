package serialization.Example2Extended;

//This file is same as in Example2. No changes

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializingClass {

	public static void main(String[] args) {

		Employee emp = new Employee("Amrit", "Kaur", "Creative", "GWL", "Ruiz");

		try {
			FileOutputStream fileOut = new FileOutputStream(
					"D:\\JavaLearning\\JavaLearning\\src\\serialization\\Example2Extended\\Employee.txt");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(emp);

			emp.companyName = "ABC";

			out.close();
			fileOut.close();

			System.out.println("object serialized in employee.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
