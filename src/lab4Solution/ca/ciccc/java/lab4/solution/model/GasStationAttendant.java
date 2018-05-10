package lab4Solution.ca.ciccc.java.lab4.solution.model;

/**
 * @author Rodrigo Moura Gonçalves
 * @version 2016-11-20
 *
 */
public class GasStationAttendant extends Employee implements Comparable<GasStationAttendant> {

	// Instance variable
	private double numberOfDollarsStolenPerDay;

	// Constants
	private static final DressCode DRESS_CODE = DressCode.UNIFORM;
	private static final boolean PAID_SALARY = false;
	private static final boolean POST_SECONDARY_EDUCATION_REQUIRED = false;
	private static final String WORK_VERB = "pump";
	private static final double OVERTIME_PAY_RATE = 1.5;

	/**
	 * Constructor
	 * 
	 * @param name
	 * @param numberOfDollarsStolenPerDay
	 */
	public GasStationAttendant(String name, double numberOfDollarsStolenPerDay) {
		setName(name);
		setNumberOfDollarsStolenPerDay(numberOfDollarsStolenPerDay);
	}

	/**
	 * @return the hashcode
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(numberOfDollarsStolenPerDay);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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

		if (!(o instanceof GasStationAttendant)) {
			return false;
		}

		GasStationAttendant ga = (GasStationAttendant) o;
		if (this.getNumberOfDollarsStolenPerDay() == ga.getNumberOfDollarsStolenPerDay()) {
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
	public int compareTo(GasStationAttendant o) {
		Double valueFirstAttendant = this.getNumberOfDollarsStolenPerDay();
		Double valueSecondAttendant = o.getNumberOfDollarsStolenPerDay();

		return valueFirstAttendant.compareTo(valueSecondAttendant);
	}

	/**
	 * @return String representation of the object
	 */
	@Override
	public String toString() {
		return getName() + " steals " + getNumberOfDollarsStolenPerDay() + " dollars a day";
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
	 * @return the numberOfDollarsStolenPerDay
	 */
	public final double getNumberOfDollarsStolenPerDay() {
		return numberOfDollarsStolenPerDay;
	}

	/**
	 * @param numberOfDollarsStolenPerDay
	 *            the numberOfDollarsStolenPerDay to set
	 */
	public final void setNumberOfDollarsStolenPerDay(double numberOfDollarsStolenPerDay) {
		this.numberOfDollarsStolenPerDay = numberOfDollarsStolenPerDay;
	}

}
