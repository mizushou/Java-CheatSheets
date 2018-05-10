package class10.examples.exceptions;

import java.util.Scanner;

public class ScannerExceptionDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int number = scanner.nextInt();

		// Display the result
		System.out.println("The number entered is " + number);
		
		scanner.close();
	}
}
