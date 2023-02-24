package serialization.customSerialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;



public class DeserializingClass {

	public static void main(String[] args) {
		Employee emp = null;
		String filename = "D:\\JavaLearning\\JavaLearning\\src\\serialization\\customSerialization\\employee.txt";
		
		try {
			//Reading the object from file
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in =  new ObjectInputStream(file);
			
			//deserializing the object
			emp = (Employee)in.readObject();
			
			in.close();
			file.close();
			
			System.out.println("Object deserialized");
			System.out.println("Name = "+emp.getPerson().getName());
			System.out.println("Age = "+emp.getPerson().getAge());
			System.out.println("Adress houseno = "+emp.getAddress().getHouseNumber());
			
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e);
		}

	}

}
