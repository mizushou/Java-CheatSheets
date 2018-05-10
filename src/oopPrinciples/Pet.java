package oopPrinciples;

public abstract class Pet extends Mammal implements Movable {

	private String name;

	/**
	 * @param height
	 * @param weight
	 */
	public Pet(double height, double weight, String name) {
		super(height, weight);
		setName(name);
	}

	public abstract void play();

	@Override
	public void run() {
		System.out.println(getName() + " running...");
	}

	@Override
	public void walk() {
		System.out.println(getName() + " walking...");
	}

	/**
	 * @return the name
	 */
	public final String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public final void setName(String name) {
		this.name = name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Pet [name=" + name + ", getHeight()=" + getHeight() + ", getWeight()=" + getWeight() + "]";
	}

}
