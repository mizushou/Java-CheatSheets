package class01;

public class Numbers {

	public static void main(String args[]) {

		String sentence = "";

		sentence = 10 + 6 + " hi " + 20 + 5;
		System.out.println(sentence);
		int x = 10;
		System.out.println(++x);
		// x++; // x = x + 1
		System.out.println(x);
		// x--; // x = x - 1
		// System.out.println(x);

		int y = 15;

		x += y; // x = x + y
		System.out.println(x);

		String word = "New";

		word += " word";
		System.out.println(word);

		x = (int) 15.5;
		System.out.println(x);

		double z = 16.5;
		z = y;
		System.out.println(z);
	}

}
