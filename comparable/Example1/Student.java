package comparable.Example1;

public class Student implements Comparable<Student> {
	int rollno;
	String name;
	int marks;

	public Student(int rollno, String name, int marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}

	// comparing the objects on the basis of marks
	public int compareTo(Student student2) {
		if (this.marks == student2.marks)
			return 0;

		if (this.marks > student2.marks)
			return 1;
		else
			return -1;

	}

	public String toString() {
		return this.rollno + ", " + this.name + ", " + this.marks;
	}

}
