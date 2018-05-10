package predicates;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeePredicates {

	public static Predicate<Employee> isAdultMale() {
		return p -> p.getGender() == 'M' && p.getAge() > 21;
	}

	public static Predicate<Employee> isAdultFemale() {
		return p -> p.getGender() == 'F' && p.getAge() > 21;
	}

	public static Predicate<Employee> isAgeMoreThan(int age) {
		return p -> p.getAge() > age;
	}

	public static List<Employee> filterEmployees(List<Employee> employees, Predicate<Employee> predicate) {
		return employees.stream().filter(predicate).collect(Collectors.<Employee>toList());
	}

}
