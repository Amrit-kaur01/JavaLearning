package serialization.Example1;

//This program will deserialize the demo object saved in File.txt

import java.io.*;

public class DeserializingClass {
	public static void main(String[] args) {
		Demo object = null;
		String filename = "D:\\JavaLearning\\JavaLearning\\src\\serialization\\Example1\\File.txt";
		
		try {
			//Reading the object from file
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in =  new ObjectInputStream(file);
			
			//deserializing the object
			object = (Demo)in.readObject();
			
			
			in.close();
			file.close();
			
			System.out.println("Object deserialized");
			System.out.println("num = "+object.num);
			System.out.println("str = "+object.str);
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
