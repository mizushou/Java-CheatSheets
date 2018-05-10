package predicates;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Driver {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();

		employees.add(new Employee(1, 'M', "Rick", "Beethovan", LocalDate.of(1982, 5, 16)));
		employees.add(new Employee(2, 'F', "Martina", "Hengis", LocalDate.of(2000, 9, 10)));
		employees.add(new Employee(3, 'M', "Ricky", "Martin", LocalDate.of(1970, 8, 3)));
		employees.add(new Employee(4, 'M', "Jon", "Lowman", LocalDate.of(1999, 2, 17)));
		employees.add(new Employee(5, 'F', "Cristine", "Maria", LocalDate.of(2001, 10, 25)));
		employees.add(new Employee(6, 'M', "David", "Feezor", LocalDate.of(1998, 11, 2)));
		employees.add(new Employee(7, 'F', "Melissa", "Roy", LocalDate.of(2001, 1, 25)));
		employees.add(new Employee(8, 'M', "Alex", "Gussin", LocalDate.of(1994, 3, 7)));
		employees.add(new Employee(9, 'F', "Neetu", "Singh", LocalDate.of(1996, 4, 30)));
		employees.add(new Employee(10, 'M', "Naveen", "Jain", LocalDate.of(1980, 7, 10)));

		System.out.println("=== Adult Male ===");
		System.out.println(EmployeePredicates.filterEmployees(employees, EmployeePredicates.isAdultMale()));

		System.out.println("=== Adult Female ===");
		System.out.println(EmployeePredicates.filterEmployees(employees, EmployeePredicates.isAdultFemale()));

		System.out.println("=== More than 35 ===");
		System.out.println(EmployeePredicates.filterEmployees(employees, EmployeePredicates.isAgeMoreThan(35)));

		// Employees other than above collection of "isAgeMoreThan(35)" can be get using
		// negate()
		System.out.println("=== Negate ===");
		System.out
				.println(EmployeePredicates.filterEmployees(employees, EmployeePredicates.isAgeMoreThan(35).negate()));
	}

}
