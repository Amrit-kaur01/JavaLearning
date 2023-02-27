package comparator.Example1;

public class Employee implements Comparable<Employee> {
	int id;
	String name;
	int salary;

	public int compareTo(Employee emp2) {
		if (this.salary == emp2.salary)
			return 0;
		if (this.salary < emp2.salary)
			return 1;
		else
			return -1;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

}
