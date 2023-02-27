package comparator.ImplementingComparatorInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import comparator.Example1.Employee;

public class Main {
	public static void main(String[] args) {
		List<Student> studentslist = new ArrayList<>();

		studentslist.add(new Student(111, "Mayank"));
		studentslist.add(new Student(131, "Anshul"));
		studentslist.add(new Student(121, "Solanki"));
		studentslist.add(new Student(101, "Aggarwal"));

		System.out.println("Unsorted list:");
		studentslist.forEach(s -> System.out.println(s));

		// Sorting list by roll number
		Collections.sort(studentslist, new SortByRollno());

		System.out.println("sorted by roll no:");
		studentslist.forEach(s -> System.out.println(s));

		// Sorting list by name
		Collections.sort(studentslist, new SortByName());

		System.out.println("sorted by name:");
		studentslist.forEach(s -> System.out.println(s));

	}
}
