package class09;

public class DriverAnimal {

	public static void main(String[] args) {

		// Polymorphism by Inheritance
		Mammal dog = new Dog(2.0, 1.0, "pug");
		Mammal bear = new Bear(100.0, 90.0, "Polar bear");
		Mammal bear2 = new Bear(200.0, 120.0, "Black bear");

		Mammal[] zoo = { dog, bear, bear2 };

		for (Mammal mammal : zoo) {
			mammal.run();
			mammal.makeSound();
		}

		// Polymorphism by Interfaces
		Speaker dog2 = new Dog(2.0, 1.0, "pug");
		Speaker bear3 = new Bear(100.0, 90.0, "Polar bear");
		Speaker bear4 = new Bear(200.0, 120.0, "Black bear");

		Speaker[] speakers = { dog2, bear3, bear4 };

		for (Speaker speaker : speakers) {
			speaker.makeSound();
		}
	}

}
