package comparator.DiffernentMethods;

import java.util.Comparator;
import java.util.List;
import comparator.ImplementingComparatorInterface.Student;

/*
 *So far, we implemented our Comparators in a way that they can't sort 
  collections containing null value 
 *if the collection contains at least one null element, then the sort method 
  throws a NullPointerException
 *One way is to handle the null values manually in Comparator implementation
*/
public class NullValues {

	Comparator<Student> handleNullValuesManually(List<Student> list) {
		Comparator<Student> comparator = (s1, s2) -> {
			if (s1 == null)
				return s2 == null ? 0 : 1;
			else if (s2 == null)
				return -1;

			return s1.getName().compareTo(s2.getName());
		};

		return comparator;
	}
}

//Here we're pushing all null elements towards the end of the collection. To do 
//that, the comparator considers null to be greater than non-null values. When 
//both are null, they are considered equal.
