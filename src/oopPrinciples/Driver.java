package oopPrinciples;

public class Driver {

	public static void main(String[] args) {

		Dog d1 = new Dog(1.0, 2.0, "dog1", "pug");
		Pet d2 = new Dog(3.0, 5.0, "dog2", "german shepard");
		Cat c1 = new Cat(0.5, 0.6, "cat1");
		Pet c2 = new Cat(1.5, 1.6, "cat2");

		Pet[] pets = { d1, c1, d2, c2 };

		for (Pet pet : pets) {
			pet.play(); // pet is a polymorphic reference (by inheritance)
			pet.run(); // polymorphism by interface
			pet.walk(); 
			if (pet instanceof Cat) { // or if (pet.getClass() == Cat.class)
				pet.eat("fish");				
			} else {
				pet.eat("beef");
				Dog d = (Dog) pet;
				System.out.println(d.getBreed());
			}
		}

	}

}
