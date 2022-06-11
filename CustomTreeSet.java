package practice;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

class Student implements Comparable<Student> {
	int rollno;
	String name;
	float percentage;

	public Student(int rollno, String name, float percentage) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.percentage = percentage;
	}

	@Override
	public int compareTo(Student o) {
		if (rollno > o.rollno) {
			return 1;
		} else if (rollno < o.rollno) {
			return -1;
		} else {
			return 0;
		}
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", percentage=" + percentage + "]";
	}

}

public class CustomTreeSet {
	public static void main(String[] args) {
		Set<Student> studset = new TreeSet<Student>();

		Student stud = new Student(10, "bharati", 72);
		Student stud1 = new Student(10, "bharati", 72);
		Student stud2 = new Student(20, "supriya", 62);
		Student stud3 = new Student(30, "pratibha", 82);
		Student stud4 = new Student(40, "priya", 92);

		studset.add(stud);
		studset.add(stud1);
		studset.add(stud2);
		studset.add(stud3);
		studset.add(stud4);

		for (Student stud5 : studset) {
			
			System.out.println(stud5);
		}
	}
}
