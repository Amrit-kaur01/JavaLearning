package comparator.ImplementingComparatorInterface;

//This class defines comparison logic based on the age

import java.util.Comparator;

public class SortByRollno implements Comparator<Student> {

	public int compare(Student student1, Student student2) {
		return student1.getRollno() - student2.getRollno();
	}
}
