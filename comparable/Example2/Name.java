package comparable.Example2;

public class Name implements Comparable<Name> {
	private String firstName;
	private String lastName;

	public Name(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String toString() {
		return "( " + firstName + ", " + lastName + " )";
	}

	public int compareTo(Name name2) {
		// Firtsly comparing the first name
		if (this.firstName.compareTo(name2.firstName) != 0)
			return this.firstName.compareTo(name2.firstName);
		else // if firstname is equal we compare the last name
			return this.lastName.compareTo(name2.lastName);
	}

}
