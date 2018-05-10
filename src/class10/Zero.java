package class10;//********************************************************************
//  Zero.java       Java Foundations
//
//  Demonstrates an uncaught exception.
//********************************************************************

public class Zero {
	// -----------------------------------------------------------------
	// Deliberately divides by zero to produce an exception.
	// -----------------------------------------------------------------
	public static void main(String[] args) {
		int numerator = 10;
		int denominator = 0;
		
		System.out.println("Before the attempt to divide by zero.");

		System.out.println(numerator / denominator);

		System.out.println("This text will not be printed.");
	}
}
