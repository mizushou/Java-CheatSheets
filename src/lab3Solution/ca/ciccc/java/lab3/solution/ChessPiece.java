package lab3Solution.ca.ciccc.java.lab3.solution;

/**
 * @author Rodrigo Moura Gonçalves
 * @version 2016-10-21
 *
 */
public abstract class ChessPiece {

	private int value;

	/**
	 * Constructor
	 * 
	 * @param value
	 */
	public ChessPiece(int value) {
		setValue(value);
	}

	public abstract void move();

	@Override
	public String toString() {
		return "ChessPiece [value=" + value + "]";
	}

	/**
	 * The hashCode for ChessPiece object
	 * 
	 * @return The hashCode for ChessPiece object
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + value;
		return result;
	}

	/**
	 * If the pieces have the same value, both are equals
	 * 
	 * @param that
	 *            the object to test if is equals
	 * @return If the pieces have the same value
	 */
	@Override
	public boolean equals(Object that) {

		if (that == null) {
			return false;
		}

		if (this == that) {
			return true;
		}

		if (!(that instanceof ChessPiece)) {
			return false;
		}

		ChessPiece piece = (ChessPiece) that;
		if (this.value == piece.value) {
			return true;
		}

		return false;
	}

	/**
	 * @return the value
	 */
	public final int getValue() {
		return value;
	}

	/**
	 * @param value
	 *            the value to set
	 */
	public final void setValue(int value) {
		this.value = value;
	}

}
