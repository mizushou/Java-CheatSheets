package hashmapDemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Driver {

	// <Key, Value>
	private HashMap<Integer, Student> students;

	public void run() {
		students = new HashMap<Integer, Student>();

		Student stu1 = new Student(1, "Bob", 20);
		Student stu2 = new Student(2, "Tom", 21);
		Student stu3 = new Student(3, "Vanessa", 23);
		Student stu4 = new Student(4, "Amanda", 22);
		Student stu5 = new Student(5, "John", 22);
		// Student stu6 = new Student(5, "Maria", 20);

		addStudent(stu1);
		addStudent(stu2);
		addStudent(stu3);
		addStudent(stu4);
		addStudent(stu5);
		// addStudent(stu6);

		System.out.println("Size: " + students.size());
		System.out.println(students.containsKey(6));

		System.out.println("-- Using Set and Iterator --");
		printElements();

		System.out.println("\n-- Using EntrySet --");
		printElements2();

		System.out.println("\n-- Using Collection --");
		printElements3();
	}

	public void addStudent(Student student) {
		// First parameter is the key, second is the value
		students.put(student.getId(), student);
	}

	public void printElements() {
		Set<Integer> keys = students.keySet();
		Iterator<Integer> it = keys.iterator();

		while (it.hasNext()) {
			int id = it.next();
			Student stu = students.get(id);

			System.out.println(stu);
		}
	}

	public void printElements2() {
		for (Map.Entry<Integer, Student> studentMap : students.entrySet()) {
			System.out.println(studentMap.getValue());
		}
	}

	public void printElements3() {
		Collection<Student> col = students.values();

		for (Student student : col) {
			System.out.println(student);
		}
	}

	public static void main(String[] args) {
		Driver driver = new Driver();
		driver.run();
	}
}
