package class10.examples.exceptions;

public class AssertionDemo {

	public static void main(String[] args) {
		int i;
		int sum = 0;
		for (i = 0; i < 10; i++) {
			sum += i;
		}
		System.out.println("i = " + i);
		assert i == 9;
		assert sum > 10 && sum < 5 * 10 : "sum is " + sum;
		System.out.println("AssertionDemo finished.");
	}
}
