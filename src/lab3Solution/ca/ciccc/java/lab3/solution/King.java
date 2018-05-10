package lab3Solution.ca.ciccc.java.lab3.solution;

/**
 * @author Rodrigo Moura Gonçalves
 * @version 2016-10-21
 *
 */
public class King extends ChessPiece {

	private static final int KING_IMPORTANCE = 1000;

	/**
	 * Constructor
	 */
	public King() {
		super(KING_IMPORTANCE);
	}

	@Override
	public String toString() {
		return "King [getValue()=" + getValue() + "]";
	}

	@Override
	public void move() {
		System.out.println("one square");
	}

}
