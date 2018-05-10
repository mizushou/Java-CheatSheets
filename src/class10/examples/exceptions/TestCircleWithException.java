package class10.examples.exceptions;

public class TestCircleWithException {
	/** Main method */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		try {
			CircleWithException c1 = new CircleWithException(5);
			CircleWithException c2 = new CircleWithException(-5);
			CircleWithException c3 = new CircleWithException(0);
		} catch (IllegalArgumentException | ArithmeticException ex) {
			System.out.println(ex);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());

			System.out.println("Number of objects created: " + CircleWithException.getNumberOfObjects());
		}
		finally {
			System.out.println("Number of objects created: " + CircleWithException.getNumberOfObjects());
		}
	}
}