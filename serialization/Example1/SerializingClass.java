package serialization.Example1;

//This program will serialize the demo object and save it in File.txt file

import java.io.*;

public class SerializingClass {

	public static void main(String[] args) {
		Demo object = new Demo(101,"Object101");
		String filename = "D:\\JavaLearning\\JavaLearning\\src\\serialization\\Example1\\File.txt";
		
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			//Serializing the object
			out.writeObject(object);
			
			out.close();
			file.close();
			
			System.out.println("Object serialized");
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}

}
