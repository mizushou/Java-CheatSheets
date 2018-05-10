package class10;
//********************************************************************
//  ProductCodes.java       Java Foundations
//
//  Demonstrates the use of a try-catch block.
//********************************************************************

import java.util.Scanner;

public class ProductCodes {
	// -----------------------------------------------------------------
	// Counts the number of product codes that are entered with a
	// zone of R and and district greater than 2000.
	// -----------------------------------------------------------------
	public static void main(String[] args) {
		String code;
		char zone;
		int district, valid = 0, banned = 0;

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter product code (STOP to quit): ");
		code = scan.nextLine();

		while (!code.equalsIgnoreCase("STOP")) {
			try {
				zone = code.charAt(9);
				district = Integer.parseInt(code.substring(3, 7));
				valid++;
				if (zone == 'R' && district > 2000) {
					banned++;
				}
			} catch (StringIndexOutOfBoundsException e) {
				System.out.println("Improper code length: " + code);				
			} catch (NumberFormatException e) {
				System.out.println("District is not numeric: " + code);
			} catch (Exception e) {
				System.out.println("Got it...");
			} finally {
				System.out.println("Finally block\n");
			}

			System.out.print("Enter product code (STOP to quit): ");
			code = scan.nextLine();
		}

		scan.close();

		System.out.println("# of valid codes entered: " + valid);
		System.out.println("# of banned codes entered: " + banned);
	}
}
