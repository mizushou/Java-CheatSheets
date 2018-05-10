package class05;

public class Student {

	// Instance variable or attributes
	private String name;
	private int age;
	private School school;

	/**
	 * 
	 * @param name
	 * @param age
	 */
	public Student(String name, int age) {
		setName(name);
		setAge(age);
	}
	
	public Student(String name, double age) {

	}

	public Student(int age, String name2) {
		setName(name2);
		setAge(age);
	}

	/**
	 * 
	 * @param name
	 * @param age
	 * @param school
	 */
	public Student(String name, int age, School school) {
		setName(name);
		setAge(age);
		this.school = school;
	}

	// Getter or accessor
	public int getAge() {
		return age;
	}

	// Mutator or setter
	public void setAge(int age) {
		if (age > 0) {
			this.age = age;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null) {
			this.name = name;
		}
	}

	/**
	 * Method to student introduce themselves
	 * 
	 * @return
	 */
	public String introduceMySelf() {
		return "Hi, my name is " + name + ", student of " + school.getName() + " college, and I am " + age
				+ " years old.";
	}

	public String toString() {
		return "Student[name = " + name + ", age = " + age + ", school = " + school + "]";
	}

}
