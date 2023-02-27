package comparable.Example1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Student> studentslist = new ArrayList<>();

		// Adding students
		studentslist.add(new Student(101, "Ajay", 86));
		studentslist.add(new Student(102, "Ben", 92));
		studentslist.add(new Student(103, "Cathy", 76));
		studentslist.add(new Student(104, "david", 89));

		// sorting
		Collections.sort(studentslist);

		// Printing the sorted list
		studentslist.forEach(student -> System.out.println(student));
	}

}
