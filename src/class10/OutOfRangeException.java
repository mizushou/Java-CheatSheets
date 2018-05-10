package class10;//********************************************************************
//  OutOfRangeException.java       Java Foundations
//
//  Represents an exceptional condition in which a value is out of
//  some particular range.
//********************************************************************

public class OutOfRangeException extends Exception {

	private static final long serialVersionUID = 1L;

	// -----------------------------------------------------------------
	// Sets up the exception object with a particular message.
	// -----------------------------------------------------------------
	public OutOfRangeException(String message) {
		super(message);
	}
}
