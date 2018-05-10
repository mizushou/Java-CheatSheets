package class05.unit.testing;

import java.util.Random;

public class Mathematics {

	public static final double PI = 3.14159;
	public static final double ONE_FOOT_TO_KILOMETER_RATIO = 0.0003048;

	public static final int MINIMUM_RANDOM_NUMBER = 10;
	public static final int RANGE = 11;
	public static final int FIFTEEN = 15;

	public static final double getCircleArea(double radius) {
		double area;
		area = Mathematics.PI * radius * radius;

		return area;
	}

	public final double getSquareArea(double side) {
		double area;

		area = side * side;

		return area;
	}

	public final double add(double x, double y) {
		return x + y;
	}

	public final double times(double x, double y) {
		return x * y;
	}

	public final double subtract(double x, double y) {
		return x - y;
	}

	public final int divide(int dividend, int divisor) {
		int result;

		if (divisor == 0) {
			result = 0;
		} else {
			result = dividend / divisor;
		}

		return result;
	}

	public final int absoluteValue(int value) {
		int absolute;

		if (value < 0) {
			absolute = value * -1;
		} else {
			absolute = value;
		}

		return absolute;
	}

	public final double convertFeetToKilometers(double feet) {
		double km;
		km = feet * Mathematics.ONE_FOOT_TO_KILOMETER_RATIO;

		return km;
	}

	public final Integer doubleTheNumber(Integer number) {
		return number * 2;
	}

	public final int getRandomNumberBetweenTenAndTwentyButNotFifteen() {
		Random r = new Random();

		int randomNumber = r.nextInt(RANGE) + MINIMUM_RANDOM_NUMBER;

		while (randomNumber == FIFTEEN) {
			randomNumber = r.nextInt(RANGE) + MINIMUM_RANDOM_NUMBER;
		}

		return randomNumber;
	}

	public final double powTheNumber(Integer number, Integer pow) {
		double result = number;

		for (int i = 1; i < pow; i++) {
			result = result * number;
		}

		return result;
	}

}
