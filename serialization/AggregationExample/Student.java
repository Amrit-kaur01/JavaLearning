package serialization.AggregationExample;

import java.io.Serializable;

public class Student implements Serializable{
	
	int id;
	String name;
	Address address;  //HAS-A relationship
	
	public Student(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

}

//Note:
/*
* If a class has a reference to another class, all the references must be Serializable otherwise serialization process will not be performed. In such case, NotSerializableException is thrown at runtime 
* Hence since address is not serializable, you cannot serialize the instance of student class 
* If one of the fields in a serializable object consists of an array of objects, then all of these objects must be serializable as well, or else a NotSerializableException will be thrown
*/
 
