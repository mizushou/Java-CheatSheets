package collections2.examples.collections;

/**
 * An item with a description and a part number.
 */
public class Part implements Comparable<Part> {

	private String partNumber;
	private String description;
	private int price;
	private int quantity;

	/**
	 * Constructs a part.
	 */
	public Part(String partNumber, String description) {
		this.partNumber = partNumber;
		this.description = description;
	}

	public Part(String partNumber, String description, int price, int quantity) {
		this.partNumber = partNumber;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
	}

	/**
	 * @return the partNumber
	 */
	public String getPartNumber() {
		return partNumber;
	}

	/**
	 * @param partNumber
	 *            the partNumber to set
	 */
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity
	 *            the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((partNumber == null) ? 0 : partNumber.hashCode());
		result = prime * result + price;
		result = prime * result + quantity;
		return result;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;

		Part other = (Part) obj;
		if (partNumber == null) {
			if (other.partNumber != null) {
				return false;
			}
		} else if (!partNumber.equals(other.partNumber)) {
			return false;
		}

		return true;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Part [partNumber=" + partNumber + ", description=" + description + ", price=" + price + ", quantity=" + quantity + "]";
	}

	/**
	 * An item is the same as another item if the part numbers are the same.
	 */
	@Override
	public int compareTo(Part part) {
		if (this.partNumber.length() == part.partNumber.length()) {
			return partNumber.compareTo(part.partNumber);
		} else {
			return this.partNumber.length() - part.partNumber.length();
		}
	}

}
