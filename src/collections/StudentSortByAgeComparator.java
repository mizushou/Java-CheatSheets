package collections;

import java.util.Comparator;

public class StudentSortByAgeComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		Integer age1 = s1.getAge();
		Integer age2 = s2.getAge();
		
		return age1.compareTo(age2);
	}

}
