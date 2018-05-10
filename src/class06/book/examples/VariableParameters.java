package class06.book.examples;
//********************************************************************

//  VariableParameters.java       Java Foundations
//
//  Demonstrates the use of a variable length parameter list.
//********************************************************************

public class VariableParameters {
	// -----------------------------------------------------------------
	// Creates two Family objects using a constructor that accepts
	// a variable number of String objects as parameters.
	// -----------------------------------------------------------------
	public static void main(String[] args) {
		Family lewis1 = new Family("John", "Sharon", "Justin", "Kayla", "Nathan", "Samantha", "Bob");

		Family lewis = new Family(new String[] { "John", "Sharon", "Justin", "Kayla", "Nathan", "Samantha" });

		Family camden = new Family("Stephen", "Annie", "Matt", "Mary", "Simon", "Lucy", "Ruthie", "Sam", "David");

		System.out.println(lewis);
		System.out.println();
		System.out.println(camden);
	}
}
