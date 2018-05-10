package class02;

import java.util.Random;

public class RandomInteger {

	public static final void main(String[] aArgs) {
		int randomInt;
		Random randomGenerator = new Random();

		randomInt = randomGenerator.nextInt(20);
		System.out.println("Generated : " + randomInt);

		randomInt = randomGenerator.nextInt(20);
		System.out.println("Generated : " + randomInt);

		randomInt = randomGenerator.nextInt(20);
		System.out.println("Generated : " + randomInt);

		randomInt = randomGenerator.nextInt(20);
		System.out.println("Generated : " + randomInt);

		randomInt = randomGenerator.nextInt(20);
		System.out.println("Generated : " + randomInt);
	}

}
