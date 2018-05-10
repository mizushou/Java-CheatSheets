package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ExampleUsingComparator {

	private ArrayList<Student> students;

	public void printNames() {
		Iterator<Student> it = students.iterator();

		while (it.hasNext()) {
			Student stu = it.next();
			System.out.println(stu.getName() + " - " + stu.getAge());
		}
	}

	public void initialize() {
		students = new ArrayList<Student>();

		students.add(new Student("John", 19));
		students.add(new Student("Mary", 18));
		students.add(new Student("Amanda", 22));
		students.add(new Student("Paul", 20));
		students.add(new Student("Bob", 21));
	}

	public void run() {
		initialize();

		System.out.println("---Before sort---\n");
		printNames();

		 students.sort(new StudentSortByAgeComparator());
		// students.sort(new StudentSortByNameComparator().reversed());
//		Collections.sort(students, new StudentSortByNameComparator().reversed());

		System.out.println("\n---After sort---\n");
		printNames();
	}

	public static void main(String[] args) {
		ExampleUsingComparator ex = new ExampleUsingComparator();
		ex.run();
	}

}
