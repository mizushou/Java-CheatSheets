package collections2.examples.collections;

import java.util.Arrays;

public class SortTest {
	public static void main(String[] args) {
		(new SortTest()).test();
	}

	private void test() {
		String[] animals = { "Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Sheep", "Monkey", "Rooster", "Dog", "Boar" };

		System.out.println("- Original order -------------");
		for (int i = 0; i < animals.length; i++) {
			System.out.println(animals[i]);
		}

		System.out.println("- Naturally sorted order -------------");
		Arrays.sort(animals);

		for (int i = 0; i < animals.length; i++) {
			System.out.println(animals[i]);
		}
	}
}