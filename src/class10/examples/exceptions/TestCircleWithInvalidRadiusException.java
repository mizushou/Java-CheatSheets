package class10.examples.exceptions;

public class TestCircleWithInvalidRadiusException {

	public static void main(String[] args) {
		try {
			System.out.println("TestCircleWithInvalidRadiusException start.");
			CircleWithRadiusException c1 = new CircleWithRadiusException(5);
			System.out.println("After new c1.");
			c1.setRadius(-5);
			@SuppressWarnings("unused")
			CircleWithRadiusException c3 = new CircleWithRadiusException(0);
			System.out.println("After new c3.");
		} catch (InvalidRadiusException e) {
			System.out.println(e.toString());
		} finally {
			System.out.println("Number of objects created: " + CircleWithRadiusException.getNumberOfObjects());
			System.out.println("TestCircleWithInvalidRadiusException end.");
		}
	}
}
