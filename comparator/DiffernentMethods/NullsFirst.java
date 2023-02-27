package comparator.DiffernentMethods;

import java.util.Comparator;
import java.util.List;

import comparator.ImplementingComparatorInterface.Student;

public class NullsFirst {

	Comparator<Student> usingNullsFirst(List<Student> list) {
		return Comparator.nullsFirst(Comparator.comparing(Student::getRollno));
	}
}
