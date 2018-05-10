package oopPrinciples;

public class Dog extends Pet {

	private String breed;

	public Dog(double height, double weight, String name, String breed) {
		super(height, weight, name);
		setBreed(breed);
	}

	@Override
	public void play() {
		System.out.println("catch the ball...");
	}

	@Override
	public void eat(String food) {
		System.out.println("waiting for " + food);
	}

	/**
	 * @return the breed
	 */
	public final String getBreed() {
		return breed;
	}

	/**
	 * @param breed
	 *            the breed to set
	 */
	public final void setBreed(String breed) {
		this.breed = breed;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Dog [breed=" + breed + ", getName()=" + getName() + ", getHeight()=" + getHeight() + ", getWeight()="
				+ getWeight() + "]";
	}

}
