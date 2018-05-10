package oopPrinciples;

public class Cat extends Pet {

	/**
	 * @param height
	 * @param weight
	 * @param name
	 */
	public Cat(double height, double weight, String name) {
		super(height, weight, name);
	}

	@Override
	public void play() {
		System.out.println("zzzz....");
	}

	@Override
	public void eat(String food) {
		System.out.println("give me " + food);
	}

	@Override
	public void run() {
		System.out.println(getName() + " is too lazy to run");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cat [getName()=" + getName() + ", getHeight()=" + getHeight() + ", getWeight()=" + getWeight() + "]";
	}

}
