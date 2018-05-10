package class04;

public class FlowControl {

	public static void main(String[] args) {
		int number = 14;
		int number2 = 12;

		int max = 15;

//		if (number > number2 || number <= max) {
//			System.out.println("True...");			
//		} else {
//			System.out.println("False...");
//			System.out.println("Continue...");
//		}		
		
		boolean result;
//		if(number > max) {
//			result = true;
//		}
//		else {
//			result = false;			
//		}
		
		result = number > max ? true : false;
		System.out.println(result);
	}

}
