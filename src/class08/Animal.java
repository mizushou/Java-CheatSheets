package class08;

public abstract class Animal {

	private double weight;
	private double height;

	public abstract void run();
	
	public abstract void makeNoise(); 

	public Animal(double weight, double height) {
		this.weight = weight;
		this.height = height;
	}

	public final double getWeight() {
		return weight;
	}

	public final void setWeight(double weight) {
		this.weight = weight;
	}

	public final double getHeight() {
		return height;
	}

	public final void setHeight(double height) {
		this.height = height;
	}

}
