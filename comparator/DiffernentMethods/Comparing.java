package comparator.DiffernentMethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import comparator.ImplementingComparatorInterface.Student;

//Program to illustrate the working of comparing and thenComparing methods of Comparator interface

/*
 * comparing method is passed the value to be compared first, and the thenComparing method
   is the next value to be compared
 * the thenComparing method can be used many times by chaining methods, which allows virtuallly
   unlimited values to be used for comparison
 * when we sort objects, the comparing and thenComparing methods are given a reference to
   the object's type - the method is called in order and the values returned by the method
   are compared
*/
public class Comparing {

	public static void main(String[] args) {
		List<Student> studentslist = new ArrayList<>();

		studentslist.add(new Student(25, "Meg"));
		studentslist.add(new Student(12, "Zen"));
		studentslist.add(new Student(23, "Sri"));

		System.out.println("Before sorting");
		studentslist.forEach(s -> System.out.println(s));

		// Sorting first based on rollno, then on name
		Comparator<Student> comparator = Comparator.comparing(Student::getRollno).thenComparing(Student::getName);

		Collections.sort(studentslist, comparator);
		System.out.println("After sorting in ascending order of rollno");
		studentslist.forEach(s -> System.out.println(s));

		// Another way to create a comparator by using lambda expressions
		Comparator<Student> c = (s1, s2) -> s1.getRollno() - s2.getRollno();

		// overriding the natural order of sorting by the name field by
		// providing a Comparator for sorting the names in descending order
		// as the second argument to Comparator.comparing
		Comparator<Student> decendingNameComparator = Comparator.comparing(Student::getName,
				(s1, s2) -> s2.compareTo(s1));
		Collections.sort(studentslist, comparator);
		System.out.println("After sorting in descending order of name");
		studentslist.forEach(s -> System.out.println(s));
	}

}
