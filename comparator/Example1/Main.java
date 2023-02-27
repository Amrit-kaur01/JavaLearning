package comparator.Example1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import comparator.Example1.Employee;

public class Main {
	public static void main(String[] args) {

		Employee emp1 = new Employee(1, "Amy", 10000);
		Employee emp2 = new Employee(2, "Amy", 11000);
		Employee emp3 = new Employee(3, "Amy", 9000);

		List<Employee> list = new ArrayList<>();

		list.add(emp3);
		list.add(emp2);
		list.add(emp1);

		Collections.sort(list);

		System.out.println(list);

	}
}
