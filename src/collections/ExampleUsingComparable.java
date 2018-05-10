package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ExampleUsingComparable {

	private ArrayList<Student> students;

	public void printNames() {

		// for(Student stu : students) {
		// System.out.println(stu.getName() + " - " + stu.getAge());
		// }

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
		students.add(new Student("Bob", 21));
		students.add(new Student("Paul", 20));
		students.add(new Student("Amanda", 22));
	}

	public void run() {
		initialize();		
		
		System.out.println("---Before sort---\n");
		printNames();

		Collections.sort(students);

		System.out.println("\n---After sort---\n");
		printNames();
	}

	public static void main(String[] args) {
		ExampleUsingComparable ex = new ExampleUsingComparable();
		ex.run();
	}

}
