package class05;

public class Driver {

	public static void main(String[] args) {

		School school = new School("CICCC");

		System.out.println(School.getLocation());
		
		School.setLocation("Victoria");
		
		System.out.println(School.getLocation());

		
		Student stu = new Student("Bob", 20, school);
		System.out.println(stu.introduceMySelf());

		stu.setAge(-6);
		stu.setName(null);

		System.out.println(stu.introduceMySelf());

		System.out.println(stu);
	}

}
