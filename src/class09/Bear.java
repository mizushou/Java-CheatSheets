package class09;

public class Bear extends Mammal {

	private String type; // Polar bear, black bear...

	public Bear(double weight, double height, String type) {
		super(weight, height);
		setType(type);
	}

	public void hunt() {
		System.out.println(type + " hunting...");
	}

	@Override
	public void makeSound() {
		System.out.println("Grrzzz...");
	}

	@Override
	public void run() {
		System.out.println(type + " running...you must run away!");
	}

	/**
	 * @return the type
	 */
	public final String getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public final void setType(String type) {
		this.type = type;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Bear [type=" + type + ", getWeight()=" + getWeight() + ", getHeight()=" + getHeight() + "]";
	}

}
