package class02;

import java.util.Scanner;

public class Echo {

	public static void main(String[] args) {
		String message;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a text: ");
		message = input.nextLine();
		
		System.out.println("Text typed: " + message);
		
		input.close();
	}
	
}
