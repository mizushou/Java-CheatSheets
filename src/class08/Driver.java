package class08;

public class Driver {

	public static void main(String[] ags) {
		Person p = new Person("John McClane");
		// Person p2 = new Person("Bruce Willis");
		Person p2 = new Person("John McClane");

		System.out.println("Are they equals? " + p.equals(p2));

		Student s = new Student("Bob", "123A456B");
		Student s2 = new Student("John", "123A456B");

		System.out.println("Are they equals? " + s.equals(s2));

	}

}
