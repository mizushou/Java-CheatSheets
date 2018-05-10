package scope;

public class Example1 {
	private static int value = 10;
	private int number;

	public Example1(int number) {
		this.number = number;
	}

	public int subtract() {
		return value - number;
	}

	public int subtract(int value) {
		return value - number;
	}

	public void printNumbers() {
		int x = 0;
		for (int number = 1; number < this.number; number++) {
			System.out.println(number);
			int y = 0;
			// int x = 10; Cannot have this local variable. Already exist
		}
		int y = 10;
		int number = 10;
		System.out.println(number);
		System.out.println(y);
		System.out.println(Example1.value);
		int index = 0;
		while (index < number) {
			System.out.println(index);
			index++;
		}
		System.out.println(index);
	}

	public static void main(String[] args) {
		int a = 1;
		int sum = a + value;
	}

}
