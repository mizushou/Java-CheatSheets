package class09;

public abstract class Mammal implements Speaker {

	private double weight;
	private double height;

	/**
	 * @param weight
	 * @param height
	 */
	public Mammal(double weight, double height) {
		this.weight = weight;
		this.height = height;
	}

	public abstract void run();

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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Mammal [weight=" + weight + ", height=" + height + "]";
	}

}
