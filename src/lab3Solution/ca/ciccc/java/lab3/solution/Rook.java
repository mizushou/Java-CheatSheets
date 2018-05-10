package lab3Solution.ca.ciccc.java.lab3.solution;

/**
 * @author Rodrigo Moura Gonçalves
 * @version 2016-10-21
 *
 */
public class Rook extends ChessPiece {

	private static final int ROOK_IMPORTANCE = 5;

	/**
	 * Constructor
	 */
	public Rook() {
		super(ROOK_IMPORTANCE);
	}

	@Override
	public String toString() {
		return "Rook [getValue()=" + getValue() + "]";
	}

	@Override
	public void move() {
		System.out.println("horizontally or vertically");
	}

}
