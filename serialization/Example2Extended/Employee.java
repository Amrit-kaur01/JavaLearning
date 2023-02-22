package serialization.Example2Extended;

//Will provide the value of static and transient variables in the class definition
//and check what will be output after deserializing

import java.io.Serializable;

public class Employee extends SuperEmployee {
	public String firstName;
	private static final long serialVersionUID = 5466223;
	
	public Employee(String firstName,String lastName, String companyName,String address,String companyCEO)
	{
		super(lastName,companyName,address,companyCEO);
		this.firstName = firstName;
	}
	
	public void printDetails()
	{
		System.out.println("Employee name: "+firstName+" "+lastName);
		System.out.println("Address: "+address);
		System.out.println("Company name: "+companyName);
		System.out.println("Company CEO: "+companyCEO);
		
	}
}

class SuperEmployee implements Serializable
{
	public String lastName;
	
	//Here I am providing the value of comoanyName, address, companyCEO while defining
	
	static String companyName = "Full";
	transient String address = "GWL";
	static transient String companyCEO = "Ruiz";
	
	public SuperEmployee(String lastName, String companyName,String address,String companyCEO)
	{
		this.lastName = lastName;
		this.companyName = companyName;
		//this.address = address;
		this.companyCEO = companyCEO;
	}
	
	
}