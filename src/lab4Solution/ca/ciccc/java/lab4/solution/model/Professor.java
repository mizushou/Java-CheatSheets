package lab4Solution.ca.ciccc.java.lab4.solution.model;

/**
 * @author Rodrigo Moura Gonçalves
 * @version 2016-11-20
 *
 */
public class Professor extends Employee implements Comparable<Professor> {

	// Instance variable
	private String teachingMajor;

	// Constants
	private static final DressCode DRESS_CODE = DressCode.FANCY;
	private static final boolean PAID_SALARY = true;
	private static final boolean POST_SECONDARY_EDUCATION_REQUIRED = true;
	private static final String WORK_VERB = "teach";
	private static final double OVERTIME_PAY_RATE = 2.0;

	/**
	 * Constructor
	 * 
	 * @param name
	 * @param teachingMajor
	 */
	public Professor(String name, String teachingMajor) {
		setName(name);
		setTeachingMajor(teachingMajor);
	}

	/**
	 * @return the hashcode
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((teachingMajor == null) ? 0 : teachingMajor.hashCode());
		return result;
	}

	/**
	 * @param o
	 * @return True/False if are the same objects
	 */
	@Override
	public boolean equals(Object o) {
		if (o == null) {
			return false;
		}

		if (this == o) {
			return true;
		}

		if (!(o instanceof Professor)) {
			return false;
		}

		Professor prof = (Professor) o;
		if (this.getTeachingMajor().equals(prof.getTeachingMajor())) {
			return true;
		}

		return false;
	}

	/**
	 * @param o
	 * @return Positive if this is bigger than o, Negative if o is bigger than this
	 *         or 0 if they are equals.
	 */
	@Override
	public int compareTo(Professor o) {
		return this.getTeachingMajor().compareTo(o.getTeachingMajor());
	}

	/**
	 * @return String representation of the object
	 */
	@Override
	public String toString() {
		return getName() + " teaches " + getTeachingMajor();
	}

	/**
	 * @return overtime pay rate
	 */
	@Override
	public double getOverTimePayRate() {
		return OVERTIME_PAY_RATE;
	}

	/**
	 * @return the dressCode
	 */
	@Override
	public final DressCode getDressCode() {
		return DRESS_CODE;
	}

	/**
	 * @return the paidSalary
	 */
	@Override
	public final boolean isPaidSalary() {
		return PAID_SALARY;
	}

	/**
	 * @return the postSecondaryEducationRequired
	 */
	@Override
	public final boolean isPostSecondaryEducationRequired() {
		return POST_SECONDARY_EDUCATION_REQUIRED;
	}

	/**
	 * @return the workVerb
	 */
	@Override
	public final String getWorkVerb() {
		return WORK_VERB;
	}

	/**
	 * @return the teachingMajor
	 */
	public final String getTeachingMajor() {
		return teachingMajor;
	}

	/**
	 * @param teachingMajor
	 *            the teachingMajor to set
	 */
	public final void setTeachingMajor(String teachingMajor) {
		this.teachingMajor = teachingMajor;
	}

}
