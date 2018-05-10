package lab4Solution.ca.ciccc.java.lab4.solution.model;

/**
 * @author Rodrigo Moura Gonçalves
 * @version 2016-11-20
 *
 */
public class Parent extends Employee implements Comparable<Parent> {

	// Instance variable
	private int numberOfHoursSpentPerWeekWithKids;

	// Constants
	private static final DressCode DRESS_CODE = DressCode.ANYTHING;
	private static final boolean PAID_SALARY = false;
	private static final boolean POST_SECONDARY_EDUCATION_REQUIRED = false;
	private static final String WORK_VERB = "care";
	private static final double OVERTIME_PAY_RATE = -2.0;

	/**
	 * Constructor
	 * 
	 * @param name
	 * @param numberOfHoursSpentPerWeekWithKids
	 */
	public Parent(String name, int numberOfHoursSpentPerWeekWithKids) {
		setName(name);
		setNumberOfHoursSpentPerWeekWithKids(numberOfHoursSpentPerWeekWithKids);
	}

	/**
	 * @return the hashcode
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numberOfHoursSpentPerWeekWithKids;
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

		if (!(o instanceof Parent)) {
			return false;
		}

		Parent parent = (Parent) o;
		if (this.getNumberOfHoursSpentPerWeekWithKids() == parent.getNumberOfHoursSpentPerWeekWithKids()) {
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
	public int compareTo(Parent o) {
		return this.getNumberOfHoursSpentPerWeekWithKids() - o.getNumberOfHoursSpentPerWeekWithKids();
	}

	/**
	 * @return String representation of the object
	 */
	@Override
	public String toString() {
		return getName() + " spends " + getNumberOfHoursSpentPerWeekWithKids() + " hour/week with kids";
	}

	/**
	 * @return the overtimePayRate
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
	 * @return the numberOfHoursSpentPerWeekWithKids
	 */
	public final int getNumberOfHoursSpentPerWeekWithKids() {
		return numberOfHoursSpentPerWeekWithKids;
	}

	/**
	 * @param numberOfHoursSpentPerWeekWithKids
	 *            the numberOfHoursSpentPerWeekWithKids to set
	 */
	public final void setNumberOfHoursSpentPerWeekWithKids(int numberOfHoursSpentPerWeekWithKids) {
		this.numberOfHoursSpentPerWeekWithKids = numberOfHoursSpentPerWeekWithKids;
	}

}
