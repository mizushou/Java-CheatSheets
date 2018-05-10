package lab3Solution.ca.ciccc.java.lab3.solution;

/**
 * @author Rodrigo Moura Gonçalves
 * @version 2016-10-21
 *
 */
public class Bishop extends ChessPiece {

	private static final int BISHOP_IMPORTANCE = 3;

	/**
	 * Constructor
	 */
	public Bishop() {
		super(BISHOP_IMPORTANCE);
	}

	@Override
	public String toString() {
		return "Bishop [getValue()=" + getValue() + "]";
	}

	@Override
	public void move() {
		System.out.println("diagonally");
	}

}
