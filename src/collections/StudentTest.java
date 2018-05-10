package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentTest {

	public static void main(String[] args) {

		ArrayList<Student> students = new ArrayList<>();

		Student stu1 = new Student("Bob", 21);
		Student stu2 = new Student("Maria", 22);
		Student stu3 = new Student("John", 20);

		students.add(stu1);
		students.add(stu3);
		students.add(stu2);
		students.add(new Student("Amanda", 26));

		// students.add(new Integer(10));
		// students.add("Text");

//		for (Student stu : students) {
//			System.out.println(stu);
//		}

		Iterator<Student> it = students.iterator();
		while(it.hasNext()) {
			Student stu = it.next();
			System.out.println(stu);
		}
	}

}
