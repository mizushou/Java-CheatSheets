package class04;

public class Loops {

	public static void main(String[] args) {

		int x = 0;

		while (x < 10) {
			System.out.println("WHILE: " + x);
			x++;
		}

		do {
			System.out.println("DO WHILE: " + x);
			x++;
		} while (x < 10);

		
		for (int index = 0; index < 10; index++) {
			System.out.println("FOR: " + index);
		}

	}

}
