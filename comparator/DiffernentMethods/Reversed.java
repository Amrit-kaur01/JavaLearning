package comparator.DiffernentMethods;

/*
 * When invoked on existing Comparator, the instance method Comparator.reversed
   returns a new Comparator that reverses the sort order of the original
 * In below example, using the comparator that sorts the student by name and 
   reverse it so that students are sorted in descending order of name
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import comparator.ImplementingComparatorInterface.Student;

public class Reversed {
	public static void main(String[] args) {

		List<Student> studentslist = new ArrayList<>();

		studentslist.add(new Student(25, "Meg"));
		studentslist.add(new Student(12, "Zen"));
		studentslist.add(new Student(23, "Sri"));

		System.out.println("Before sorting");
		studentslist.forEach(s -> System.out.println(s));

		Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
		Comparator<Student> nameComparatorReversed = nameComparator.reversed();

		Collections.sort(studentslist, nameComparatorReversed);
		System.out.println("After sorting");
		studentslist.forEach(s -> System.out.println(s));
	}
}
