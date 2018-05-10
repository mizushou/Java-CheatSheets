package class08;

public abstract class Reptile extends Animal {

	public Reptile(double weight, double height) {
		super(weight, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		System.out.println("Reptile");
	}
	
	public abstract void makePoison();

}
