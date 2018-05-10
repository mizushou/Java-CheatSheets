package lab3Solution.ca.ciccc.java.lab3.solution;

/**
 * @author Rodrigo Moura Gonçalves
 * @version 2016-10-21
 *
 */
public class Queen extends ChessPiece {

	private static final int QUEEN_IMPORTANCE = 9;

	/**
	 * Constructor
	 */
	public Queen() {
		super(QUEEN_IMPORTANCE);
	}

	@Override
	public String toString() {
		return "Queen [getValue()=" + getValue() + "]";
	}

	@Override
	public void move() {
		System.out.println("like a bishop or a rook");
	}

}
