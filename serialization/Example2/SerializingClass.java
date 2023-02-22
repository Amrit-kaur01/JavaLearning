package serialization.Example2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializingClass {

	public static void main(String[] args) {

		Employee emp = new Employee("Amrit","Kaur","Full","GWL","Ruiz");
		
		try {
			FileOutputStream fileOut = new FileOutputStream("D:\\JavaLearning\\JavaLearning\\src\\serialization\\Example2\\Employee.txt");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(emp);
			
			
			
			out.close();
			fileOut.close();
			
			System.out.println("object serialized in employee.txt");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
