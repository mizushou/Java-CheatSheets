package class06.examples;

public class ArrayExample {

	public static void main(String[] args) {
		String[] words = new String[5];

		words[0] = "Java";
		words[1] = "Swift";
		words[2] = "";
		
		for (String word : words) {
			if (word != null) {
				System.out.println("Size of " + word + " is " + word.length());
			}
		}
		
		int[] numbers = new int[10];
		
		System.out.println(numbers.length);

	}

}
