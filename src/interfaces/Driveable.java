package interfaces;

public interface Driveable {
	
	default public void displaySign() {
		System.out.println("Low Fuel!");
	}
}
