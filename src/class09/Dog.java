package class09;

public class Dog extends Mammal {

	private String breed;

	public Dog(double weight, double height) {
		super(weight, height);
	}

	public Dog(double weight, double height, String breed) {
		super(weight, height);
		setBreed(breed);
	}

	@Override
	public void run() {
		System.out.println("Dog running");
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

	@Override
	public void makeSound() {
		System.out.println("woof...");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Dog [breed=" + breed + ", getWeight()=" + getWeight() + ", getHeight()=" + getHeight() + "]";
	}

}
