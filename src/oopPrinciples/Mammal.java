package oopPrinciples;

public abstract class Mammal {

	private double height;
	private double weight;

	/**
	 * @param height
	 * @param weight
	 */
	public Mammal(double height, double weight) {
		this.height = height;
		this.weight = weight;
	}

	public abstract void eat(String food);

	/**
	 * @return the height
	 */
	public final double getHeight() {
		return height;
	}

	/**
	 * @param height
	 *            the height to set
	 */
	public final void setHeight(double height) {
		this.height = height;
	}

	/**
	 * @return the weight
	 */
	public final double getWeight() {
		return weight;
	}

	/**
	 * @param weight
	 *            the weight to set
	 */
	public final void setWeight(double weight) {
		this.weight = weight;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Mammal [height=" + height + ", weight=" + weight + "]";
	}

}
