package class05;

public class DriverCar {

	public static void main(String[] args) {

		System.out.println(Car.getManufacturer());

		Car car1 = new Car(2017, "Tesla Model S");
		Car car2 = new Car(2018, "Tesla Model X");
		Car car3 = new Car();
		Car car4 = new Car();

		car1.accelerate(120.5);
		car1.accelerate(130.5f);
		
		System.out.println(Car.getManufacturer());
		Car.setManufacturer("BMW");
		System.out.println(Car.getManufacturer());

		System.out.println(car3);
		car3.setYearModel(2001);
		System.out.println(car3);

		System.out.println(car2);

		System.out.println("Year: " + car1.getYearModel());
		System.out.println("Model: " + car1.getModelName());

		System.out.println(car1);

		car1.setModelName("Tesla Model 3");
		car1.setYearModel(2018);

		System.out.println("Year: " + car1.getYearModel());
		System.out.println("Model: " + car1.getModelName());

		System.out.println(car1);

	}

}
