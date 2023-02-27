package serialization.Example2;

import java.io.Serializable;

public class Employee extends SuperEmployee {
	public String firstName;
	private static final long serialVersionUID = 5466223;

	public Employee(String firstName, String lastName, String companyName, String address, String companyCEO) {
		super(lastName, companyName, address, companyCEO);
		this.firstName = firstName;
	}

	public void printDetails() {
		System.out.println("Employee name: " + firstName + " " + lastName);
		System.out.println("Address: " + address);
		System.out.println("Company name: " + companyName);
		System.out.println("Company CEO: " + companyCEO);

	}
}

class SuperEmployee implements Serializable {
	public String lastName;
	static String companyName;
	transient String address;
	static transient String companyCEO;

	public SuperEmployee(String lastName, String companyName, String address, String companyCEO) {
		this.lastName = lastName;
		this.companyName = companyName;
		this.address = address;
		this.companyCEO = companyCEO;
	}

}