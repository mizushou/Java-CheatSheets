package class08;

public class Person {

	private String name;
	
	public Person() {
		
	}
	
	public Person(String name) {
		setName(name);
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
	public final void sayName() {
		//....
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object that) {

		// First step
		if (that == null) {
			return false;
		}

		// Second
		if (this == that) {
			return true;
		}

		// Third
		if (!(that instanceof Person)) {
			return false;
		}

		// Last
		Person p = (Person) that;
		if (this.name.equals(p.name)) {
			return true;
		}

		// If they are not equal at all, return false
		return false;
	}

}
