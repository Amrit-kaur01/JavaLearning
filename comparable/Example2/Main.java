package comparable.Example2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import comparable.Example1.Student;

//Program to sort the array of Students based on their firstName.
//If firstName is equal, sort it based on their lastName

public class Main {

	public static void main(String[] args) {
		List<Name> names = new ArrayList<>();

		// Adding students
		names.add(new Name("Amy", "Benz"));
		names.add(new Name("Sunny", "Kumar"));
		names.add(new Name("Cathy", "Geller"));

		// sorting
		Collections.sort(names);

		names.forEach((n) -> System.out.println(n));
	}

}
