package class06.examples;

public class FibonacciArray {

	public static int[] fillFibonacciArray() {
		int limit = 25;
		int[] fibonacciSequence = new int[limit];

		for (int i = 1; i <= limit; i++) {
			fibonacciSequence[i-1] = fibonacci(i);
		}

		return fibonacciSequence;
	}

	private static int fibonacci(int number) {
		if (number <= 1) {
			return number;
		}

		return fibonacci(number - 1) + fibonacci(number - 2);
	}
}
