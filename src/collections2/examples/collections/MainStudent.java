package collections2.examples.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MainStudent {

	private HashMap<String, Student> students;

	public MainStudent() {
		students = new HashMap<>();
	}

	public void addStudent(Student stu) {
		if (stu != null) {
			students.put(stu.getStudentId(), stu);
		}
	}

	public void printStudents() {
		Set<String> keys = students.keySet();

		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			String key = it.next();
			Student stu = students.get(key);
			System.out.println(stu);
		}
	}

	public void initialize() {
		String id = "A123";
		String name = "John";
		addStudent(new Student(id, name));

		id = "A234";
		name = "Maria";
		addStudent(new Student(id, name));

		id = "A514";
		name = "Amanda";
		addStudent(new Student(id, name));

		id = "A777";
		name = "Bob";
		addStudent(new Student(id, name));

		id = "A567";
		name = "Charles";
		addStudent(new Student(id, name));

		id = "A789";
		name = "Chris";
		addStudent(new Student(id, name));

		id = "A789";
		name = "Elisa";
		addStudent(new Student(id, name));

		addStudent(null);
	}

	public static void main(String[] args) {
		MainStudent driver = new MainStudent();

		driver.initialize();
		driver.printStudents();
	}

}
