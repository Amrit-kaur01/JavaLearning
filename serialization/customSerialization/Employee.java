package serialization.customSerialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * java specifies a default way to serialize objects, but java classes can override this behavior 
 * use custom serialization when you are trying to serializr an object that has non -serializable attributes
 * we acheive this by oberriding writeObject() and readObject() methods 
*/

public class Employee implements Serializable {
	private static final long serialVersionUID = 2l;	
	private transient Address address;
	private Person person;
	
	public Employee(Address address, Person person) {
		super();
		this.address = address;
		this.person = person;
	}

	//getters and setters
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	
	private void writeObject(ObjectOutputStream oos) throws IOException
	{
		oos.defaultWriteObject();
		oos.writeObject(address.getHouseNumber());
	}
	
	private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException
	{
		ois.defaultReadObject();
		Integer houseNo = (Integer) ois.readObject();
		Address a =new Address(houseNo);
		
		this.setAddress(a);
	}
}
