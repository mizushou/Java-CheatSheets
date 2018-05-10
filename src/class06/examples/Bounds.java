package class06.examples;

import java.util.Arrays;

public class Bounds {

	public static void main(String[] args) {

		int[] numbers = new int[5];
		int[] numbers2 = new int[5];

		for (int index = 0; index < numbers.length; index++) {
			numbers[index] = index + 1;
		}

		System.out.println(Arrays.toString(numbers));

		for (int index = numbers2.length - 1; index >= 0; index--) {
			numbers2[index] = index + 1;
		}
		
		System.out.println(Arrays.toString(numbers2));
	}

}
