package lab4Solution.ca.ciccc.java.lab4.solution.model;

/**
 * @author Rodrigo Moura Gonçalves
 * @version 2016-11-20
 *
 */
public class HockeyPlayer extends Employee implements Comparable<HockeyPlayer> {

	// Instance variable
	private int numberOfGols;

	// Constants
	private static final DressCode DRESS_CODE = DressCode.JERSEY;
	private static final boolean PAID_SALARY = true;
	private static final boolean POST_SECONDARY_EDUCATION_REQUIRED = false;
	private static final String WORK_VERB = "play";
	private static final double OVERTIME_PAY_RATE = 0.0;

	/**
	 * Constructor
	 * 
	 * @param name
	 * @param numberOfGols
	 */
	public HockeyPlayer(String name, int numberOfGols) {
		setName(name);
		setNumberOfGols(numberOfGols);
	}

	/**
	 * @return the hashcode
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numberOfGols;
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

		if (!(o instanceof HockeyPlayer)) {
			return false;
		}

		HockeyPlayer hp = (HockeyPlayer) o;
		if (this.getNumberOfGols() == hp.getNumberOfGols()) {
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
	public int compareTo(HockeyPlayer o) {
		return this.getNumberOfGols() - o.getNumberOfGols();
	}

	/**
	 * @return String representation of the object
	 */
	@Override
	public String toString() {
		return getName() + " scored " + getNumberOfGols() + " goals";
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
	 * @return the numberOfGols
	 */
	public final int getNumberOfGols() {
		return numberOfGols;
	}

	/**
	 * @param numberOfGols
	 *            the numberOfGols to set
	 */
	public final void setNumberOfGols(int numberOfGols) {
		this.numberOfGols = numberOfGols;
	}

}
