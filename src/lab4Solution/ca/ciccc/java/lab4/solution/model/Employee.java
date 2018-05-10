package lab4Solution.ca.ciccc.java.lab4.solution.model;

/**
 * @author Rodrigo Moura Gonçalves
 * @version 2016-11-20
 *
 */
public abstract class Employee implements Employable {

	// Instance variable
	private String name;

	public abstract double getOverTimePayRate();

	/**
	 * @return the name
	 */
	public final String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public final void setName(String name) {
		this.name = name;
	}

}
