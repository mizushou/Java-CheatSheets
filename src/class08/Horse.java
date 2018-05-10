package class08;

public class Horse extends Animal {
	
	private String breed;
	
	public Horse(double weight, double height, String breed) {
		super(weight, height);
		this.breed = breed;
	}
	
	@Override
	public void run() {
		//run implementation..
		System.out.println("Horse running....");
	}
	
	@Override
	public void makeNoise() {
		System.out.println("Horse making noise....");
	}

}
