package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Example2 {

	private ArrayList<Student> students;
	private ArrayList collection;

	public Example2() {
		students = new ArrayList<Student>();
		collection = new ArrayList<>();
	}

	public void addStudent(Student student) {
		students.add(student);
	}

	public void addStudent(Student student, int index) {
		students.add(index, student);
	}

	public void replaceStudent(Student student, int index) {
		students.set(index, student);
	}

	public void removeStudent(int index) {
		students.remove(index);
	}

	public void removeStudent(Student student) {
		students.remove(student);
	}

	public Student getStudent(int index) {
		return students.get(index);
	}

	public Student[] convertToArray() {
		return students.toArray(new Student[0]);
	}

	public void printList() {
		for (Student stu : students) {
			System.out.println(stu);
		}
		System.out.println("");
	}

	public void printListUsingIterator() {
		Iterator<Student> it = students.iterator();

		while (it.hasNext()) {
			Student stu = it.next();
			System.out.println(stu);
		}
		System.out.println("Using iterator");
	}

	public static void main(String[] args) {
		Example2 ex = new Example2();

		Student stu1 = new Student("Bob");
		Student stu2 = new Student("Mary");
		Student stu3 = new Student("John");
		Student stu4 = new Student("Mel");

		ex.addStudent(stu1);
		ex.addStudent(stu2);
		ex.addStudent(stu3);

		ex.printList();

		ex.addStudent(stu4,1);
		ex.printList();

		ex.removeStudent(stu1);
		ex.printList();

		ex.removeStudent(1);
		ex.printList();

		ex.addStudent(new Student("David"));
		ex.printList();

		Student s = ex.getStudent(0);
		System.out.println("The student is: " + s);
		ex.printList();

		ex.replaceStudent(new Student("Amanda"), 1);
		ex.printListUsingIterator();

		Student[] studentArray = ex.convertToArray();
		System.out.println("Array size: " + studentArray.length);
	}

}
