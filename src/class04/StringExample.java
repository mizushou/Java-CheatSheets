package class04;

public class StringExample {

	public static void main(String[] args) {
		String text1 = new String("HI there!");
		String text2 = "Hi there!";
		
		if(text1 == text2) {
			System.out.println("Same");
		}
		else {
			System.out.println("Not same");
		}

			
		if(text1.equalsIgnoreCase(text2)) {
			System.out.println("Same using equals");
		}
		else {
			System.out.println("Not same using equals");
		}
	}
	
}
