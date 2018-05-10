package class05.unit.testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.HashSet;

import org.junit.Test;

public class MathematicsTest {

	private Mathematics math;

	public MathematicsTest() {
		math = new Mathematics();
	}

	@Test
	public void testPIValue() {
		assertEquals(3.14159, Mathematics.PI, 0.1);
	}

	@Test
	public void testFeetToKMRatioValue() {
		assertEquals(0.0003048, Mathematics.ONE_FOOT_TO_KILOMETER_RATIO, 0.1);
	}

	@Test
	public void testGetCircleArea1() {
		double area = Mathematics.getCircleArea(1.0);
		assertEquals(3.14159, area, 0.1);
	}

	@Test
	public void testGetCircleArea2() {
		double area = Mathematics.getCircleArea(15.0);
		assertEquals(706.85775, area, 0.1);
	}

	@Test
	public void testGetSquareArea1() {
		double area = math.getSquareArea(2.0);
		assertEquals(4.0, area, 0.1);
	}

	@Test
	public void testGetSquareArea2() {
		double area = math.getSquareArea(32.0);
		assertEquals(1024.0, area, 0.1);
	}

	@Test
	public void testAdd1() {
		double sum = math.add(6.0, 7.0);
		assertEquals(13.0, sum, 0.1);
	}

	@Test
	public void testAdd2() {
		double sum = math.add(-6.0, 6.0);
		assertEquals(0.0, sum, 0.1);
	}

	@Test
	public void testTimes1() {
		double product = math.times(1.0, 5.0);
		assertEquals(5.0, product, 0.1);
	}

	@Test
	public void testTimes2() {
		double product = math.times(20.0, 20.0);
		assertEquals(400.0, product, 0.1);
	}

	@Test
	public void testSubtract1() {
		double difference = math.subtract(0.0, 20.0);
		assertEquals(-20.0, difference, 0.1);
	}

	@Test
	public void testSubtract2() {
		double difference = math.subtract(20.0, 20.0);
		assertEquals(0.0, difference, 0.1);
	}

	@Test
	public void testDivide1() {
		int division = math.divide(20, 10);
		assertEquals(2, division);
	}

	@Test
	public void testDivide2() {
		int division = math.divide(20, 0);
		assertEquals(0, division);
	}

	@Test
	public void testAbsolute1() {
		int abs = math.absoluteValue(1);
		assertEquals(1, abs);
	}

	@Test
	public void testAbsolute2() {
		int abs = math.absoluteValue(-5000);
		assertEquals(5000, abs);
	}

	@Test
	public void testRandomNumberBetweenTenAndTwentyButNotFifteen() {
		HashSet<Integer> values = new HashSet<Integer>();

		for (int i = 0; i < 10000; i++) {
			int number = math.getRandomNumberBetweenTenAndTwentyButNotFifteen();
			boolean lessThanTen = number < 10;
			boolean greaterThanTwenty = number > 20;
			boolean notFifteen = number == 15;

			assertFalse(lessThanTen);
			assertFalse(greaterThanTwenty);
			assertFalse(notFifteen);
			values.add(number);
		}

		assertEquals(10, values.size());
	}

	@Test
	public void testFootToKM1() {
		double km = math.convertFeetToKilometers(1.0);
		assertEquals(0.0003048, km, 0.1);
	}

	@Test
	public void testFootToKM2() {
		double km = math.convertFeetToKilometers(892.0);
		assertEquals(0.272186, km, 0.1);
	}

	@Test
	public void testDoubleTheNumber1() {
		Integer number = new Integer(5);
		Integer answer = math.doubleTheNumber(number);
		assertEquals((Integer) 10, answer);
	}

	@Test
	public void testDoubleTheNumber2() {
		Integer number = new Integer(16);
		Integer answer = math.doubleTheNumber(number);
		assertEquals((Integer) 32, answer);
	}
	
	@Test
	public void testPowTheNumber() {
		Integer number = new Integer(2);
		Integer pow = new Integer(3);
		Double answer = math.powTheNumber(number, pow);
		assertEquals((Double) 8.0, answer);
	}
	
	@Test
	public void testPowTheNumber2() {
		Integer number = new Integer(3);
		Integer pow = new Integer(3);
		Double answer = math.powTheNumber(number, pow);
		assertEquals((Double) 27.0, answer);
	}

}
