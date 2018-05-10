package class01;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		
		String message;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Type something:");
		message = scan.nextLine();
		
		System.out.print("Type a number: ");
		int number = scan.nextInt();
		number++;
		
		System.out.println("Data typed: " + message);
		System.out.println("Number typed: " + number);
		scan.close();
	}

}
