package collections;

public class MainCar {

	public static void main(String[] args) {
		Car car1 = new Car(2010, 400);
		Car car2 = new Car(2010, 400);

		System.out.println(car1);
		System.out.println(car2);

		if (car1.equals(car2)) {
			System.out.println("Equals");
		} else {
			System.out.println("Not Equals");
		}

		System.out.println(car1.hashCode());
		System.out.println(car2.hashCode());

	}

}
