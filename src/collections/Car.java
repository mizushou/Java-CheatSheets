package collections;

public class Car {

	private int year;
	private int horsePower;
	private String model;
	private Manufaturer brand;

	/**
	 * @param year
	 * @param horsePower
	 */
	public Car(int year, int horsePower) {
		setYear(year);
		setHorsePower(horsePower);
	}

	/**
	 * @return the year
	 */
	public final int getYear() {
		return year;
	}

	/**
	 * @param year
	 *            the year to set
	 */
	public final void setYear(int year) {
		this.year = year;
	}

	/**
	 * @return the horsePower
	 */
	public final int getHorsePower() {
		return horsePower;
	}

	/**
	 * @param horsePower
	 *            the horsePower to set
	 */
	public final void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}

	

	

//	/* (non-Javadoc)
//	 * @see java.lang.Object#hashCode()
//	 */
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
//		result = prime * result + horsePower;
//		result = prime * result + ((model == null) ? 0 : model.hashCode());
//		result = prime * result + year;
//		return result;
//	}
//
//	/* (non-Javadoc)
//	 * @see java.lang.Object#equals(java.lang.Object)
//	 */
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj) {
//			return true;
//		}
//		if (obj == null) {
//			return false;
//		}
//		if (getClass() != obj.getClass()) {
//			return false;
//		}
//		Car other = (Car) obj;
//		if (brand == null) {
//			if (other.brand != null) {
//				return false;
//			}
//		} else if (!brand.equals(other.brand)) {
//			return false;
//		}
//		if (horsePower != other.horsePower) {
//			return false;
//		}
//		if (model == null) {
//			if (other.model != null) {
//				return false;
//			}
//		} else if (!model.equals(other.model)) {
//			return false;
//		}
//		if (year != other.year) {
//			return false;
//		}
//		return true;
//	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + horsePower;
		result = prime * result + year;
		return result;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj == null) {
			return false;
		}

		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Car)) {
			return false;
		}

		Car other = (Car) obj;
		if (this.year != other.year || this.horsePower != other.horsePower) {
			return false;
		}
		
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Car [year=" + year + ", horsePower=" + horsePower + "]";
	}

}
