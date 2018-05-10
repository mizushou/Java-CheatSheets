package class05;

/**
 * 
 * @author rodrigomouragoncalves
 *
 */
public class School {

	// Instance variables or attributes
	private String name;
	private static String location;

	/**
	 * No args constructor
	 */
	public School() {

	}

	/**
	 * Constructor
	 * 
	 * @param name
	 *            The name to set
	 */
	public School(String name) {
		this.name = name;
		location = "Vancouver";
	}

	/**
	 * 
	 * @return The name
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static String getLocation() {
		return location;
	}

	public static void setLocation(String location) {
		School.location = location;
	}

	public String toString() {
		return "School[name = " + name + "]";
	}

}
