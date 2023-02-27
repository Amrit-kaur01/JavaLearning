package comparator.ImplementingComparatorInterface;

//This class defines comparison logic based on the name

import java.util.Comparator;

public class SortByName implements Comparator<Student> {

	public int compare(Student student1, Student student2) {
		return student1.getName().compareTo(student2.getName());
	}
}
