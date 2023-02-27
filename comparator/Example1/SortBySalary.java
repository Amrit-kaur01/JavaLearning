package comparator.Example1;

import java.util.Comparator;

public class SortBySalary implements Comparator<Employee> {

	// sorts in descending order of salary
	public int compare(Employee emp1, Employee emp2) {
		if (emp1.salary == emp2.salary)
			return 0;
		if (emp1.salary < emp2.salary)
			return 1;
		else
			return -1;
	}
}
