package collections2.examples.collections;

import java.util.Arrays;
import java.util.Comparator;

public class SortTest2 {
	public static void main(String[] args) {
		(new SortTest2()).test();
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

		StringLengthComparator stringLengthComparator = new StringLengthComparator();
		Arrays.sort(animals, stringLengthComparator);
		System.out.println("- Unnaturally sorted order -------------");
		for (int i = 0; i < animals.length; i++) {
			System.out.println(animals[i]);
		}
	}

	public class StringLengthComparator implements Comparator<String> {
		@Override
		public int compare(String s1, String s2) {
			return s1.toString().length() - s2.toString().length();
		}
	}
}
