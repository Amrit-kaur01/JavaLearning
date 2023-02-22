package serialization.Example2Extended;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

public class DeserializingClass {

	public static void main(String[] args) {
		Employee emp = null;
		
		try {
			FileInputStream fileIn = new FileInputStream("D:\\JavaLearning\\JavaLearning\\src\\serialization\\Example2Extended\\Employee.txt");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			
			emp = (Employee)in.readObject();
			
			fileIn.close();
			in.close();
			
			emp.printDetails();
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

/*
* Here the value of companyName and companyCEO is stored and it is taken from the         Employee class and not from Object emp. (Both are static)
  
* It is because, while de-serializing, a value can be available for Static variables if the same is provided while initialization of the base class.

* It doesn’t mean that static variable will be serialized. It only means that the static variable will be initialized with the same value, it is assigned while loading the class
 
* companyCEO variable is also saved even when it is transient. It is because static will take precedence to transient
*If the variable is defined as Static and Transient both than static modifier will govern the behavior of variable and not Transient.
   
* address is null because transient values cannot be saved 

*if you want to save the value of transient variable, then make it final
*Final variables will participate in serialization directly by their values
*Hence declaring a final variable as transient there is no use
*/ 
