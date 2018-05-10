package class06.examples;

public class Driver {

	public static void main(String[] args) {

		int[] fibonacci = FibonacciArray.fillFibonacciArray();

		for (int number : fibonacci) {
			System.out.print(number + " ");
		}
	}

}
