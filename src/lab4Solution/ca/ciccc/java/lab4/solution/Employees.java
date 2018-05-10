package lab4Solution.ca.ciccc.java.lab4.solution;

import lab4Solution.ca.ciccc.java.lab4.solution.model.*;

import java.util.ArrayList;
import java.util.Collections;



/**
 * @author Rodrigo Moura Gonçalves
 * @version 2016-11-20
 *
 */
public class Employees {

	// Collection of all employees
	private ArrayList<Employee> employees;

	// Collections for each type of employee
	private ArrayList<HockeyPlayer> hockeyPlayers;
	private ArrayList<Professor> professors;
	private ArrayList<Parent> parents;
	private ArrayList<GasStationAttendant> gasStationAttendants;

	/**
	 * Constructor
	 */
	public Employees() {
		employees = new ArrayList<Employee>();
		addEmployees();

		hockeyPlayers = new ArrayList<HockeyPlayer>();
		professors = new ArrayList<Professor>();
		parents = new ArrayList<Parent>();
		gasStationAttendants = new ArrayList<GasStationAttendant>();
		addEmployeesSeparately();
	}

	/**
	 * Print all employees from each collection before and after sorted
	 */
	public void showEmployees() {

		System.out.println("=== Hockey Players ===\n");
		System.out.println("--- Before Sort ---\n");
		for (HockeyPlayer emp : hockeyPlayers) {
			System.out.println(emp);
		}

		Collections.sort(hockeyPlayers);

		System.out.println("\n--- After Sort ---\n");
		for (HockeyPlayer emp : hockeyPlayers) {
			System.out.println(emp);
		}

		System.out.println("\n=== Professors ===\n");
		System.out.println("--- Before Sort ---\n");
		for (Professor emp : professors) {
			System.out.println(emp);
		}

		Collections.sort(professors);

		System.out.println("\n--- After Sort ---\n");
		for (Professor emp : professors) {
			System.out.println(emp);
		}

		System.out.println("\n=== Parents ===\n");
		System.out.println("--- Before Sort ---\n");
		for (Parent emp : parents) {
			System.out.println(emp);
		}

		Collections.sort(parents);

		System.out.println("\n--- After Sort ---\n");
		for (Parent emp : parents) {
			System.out.println(emp);
		}

		System.out.println("\n=== Gas Station Attendants ===\n");
		System.out.println("--- Before Sort ---\n");
		for (GasStationAttendant emp : gasStationAttendants) {
			System.out.println(emp);
		}

		Collections.sort(gasStationAttendants);

		System.out.println("\n--- After Sort ---\n");
		for (GasStationAttendant emp : gasStationAttendants) {
			System.out.println(emp);
		}

		System.out.println();
	}

	/**
	 * Print all employees from collection employees
	 */
	public void showAllEmployees() {
		for (Employee emp : employees) {
			System.out.println(emp);
		}
	}

	/**
	 * Print all objects in a collection that are equals to one another
	 * 
	 * @param collection
	 * @param className
	 */
	public void displayEqualsObjects(ArrayList<Employee> collection, Class<?> className) {
		ArrayList<Employee> collectionsOfEquals = new ArrayList<Employee>();

		for (int i = 0; i < collection.size(); i++) {
			Employee emp = collection.get(i);

			for (int j = i + 1; j < collection.size(); j++) {
				Employee otherEmp = collection.get(j);

				if (emp.equals(otherEmp)) {
					collectionsOfEquals.add(emp);
					collectionsOfEquals.add(otherEmp);
				}
			}
		}

		System.out.println("The " + collectionsOfEquals.size() + " " + className.getSimpleName()
				+ " who are equals to one another:");
		System.out.println("===========================================");
		for (Employee tempEmp : collectionsOfEquals) {
			System.out.println(tempEmp);
		}
		System.out.println("===========================================");
		System.out.println();
	}

	/**
	 * Initialize the ArrayLists
	 */
	private void addEmployeesSeparately() {
		hockeyPlayers.add(new HockeyPlayer("Wayne Gretzky", 894));
		hockeyPlayers.add(new HockeyPlayer("Who Ever", 0));
		hockeyPlayers.add(new HockeyPlayer("Brent Gretzky", 1));
		hockeyPlayers.add(new HockeyPlayer("Pavel Bure", 437));
		hockeyPlayers.add(new HockeyPlayer("Jason Bourne", 0));

		professors.add(new Professor("Albert Einstein", "Physics"));
		professors.add(new Professor("Alan Turing", "Computer Systems"));
		professors.add(new Professor("Richard Feynman", "Physics"));
		professors.add(new Professor("Tim Berners-Lee", "Computer Systems"));
		professors.add(new Professor("Kurt Godel", "Logic"));

		parents.add(new Parent("Tiger Woods", 1));
		parents.add(new Parent("Super Mom", 168));
		parents.add(new Parent("Lazy Larry", 20));
		parents.add(new Parent("Ex Hausted", 168));
		parents.add(new Parent("Super Dad", 167));

		gasStationAttendants.add(new GasStationAttendant("Joe Smith", 10.0));
		gasStationAttendants.add(new GasStationAttendant("Tony Baloney", 100.0));
		gasStationAttendants.add(new GasStationAttendant("Benjamin Franklin", 100.0));
		gasStationAttendants.add(new GasStationAttendant("Mary Fairy", 101.0));
		gasStationAttendants.add(new GasStationAttendant("Bee See", 1.0));
	}

	/**
	 * Initialize the ArrayList
	 */
	private void addEmployees() {
		employees.add(new HockeyPlayer("Wayne Gretzky", 894));
		employees.add(new HockeyPlayer("Who Ever", 0));
		employees.add(new HockeyPlayer("Brent Gretzky", 1));
		employees.add(new HockeyPlayer("Pavel Bure", 437));
		employees.add(new HockeyPlayer("Jason Bourne", 0));

		employees.add(new Professor("Albert Einstein", "Physics"));
		employees.add(new Professor("Alan Turing", "Computer Systems"));
		employees.add(new Professor("Richard Feynman", "Physics"));
		employees.add(new Professor("Tim Berners-Lee", "Computer Systems"));
		employees.add(new Professor("Kurt Godel", "Logic"));

		employees.add(new Parent("Tiger Woods", 1));
		employees.add(new Parent("Super Mom", 168));
		employees.add(new Parent("Lazy Larry", 20));
		employees.add(new Parent("Ex Hausted", 168));
		employees.add(new Parent("Super Dad", 167));

		employees.add(new GasStationAttendant("Joe Smith", 10.0));
		employees.add(new GasStationAttendant("Tony Baloney", 100.0));
		employees.add(new GasStationAttendant("Benjamin Franklin", 100.0));
		employees.add(new GasStationAttendant("Mary Fairy", 101.0));
		employees.add(new GasStationAttendant("Bee See", 1.0));
	}

	@SuppressWarnings("rawtypes")
	public ArrayList getHockeyPlayersCollection() {
		return hockeyPlayers;
	}

	@SuppressWarnings("rawtypes")
	public ArrayList getProfessorsCollection() {
		return professors;
	}

	@SuppressWarnings("rawtypes")
	public ArrayList getParentsCollection() {
		return parents;
	}

	@SuppressWarnings("rawtypes")
	public ArrayList getGasStationAttendentsCollection() {
		return gasStationAttendants;
	}

	@SuppressWarnings("rawtypes")
	public ArrayList getEmployeesCollection() {
		return employees;
	}

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Employees emp = new Employees();
		emp.showEmployees();
		emp.displayEqualsObjects(emp.getHockeyPlayersCollection(), HockeyPlayer.class);
		emp.displayEqualsObjects(emp.getProfessorsCollection(), Professor.class);
		emp.displayEqualsObjects(emp.getParentsCollection(), Parent.class);
		emp.displayEqualsObjects(emp.getGasStationAttendentsCollection(), GasStationAttendant.class);
		// emp.showAllEmployees();
		// emp.displayEqualsObjects(emp.getEmployeesCollection(), Employee.class);
	}
}
