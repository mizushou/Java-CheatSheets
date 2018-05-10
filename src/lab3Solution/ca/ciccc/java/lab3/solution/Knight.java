package lab3Solution.ca.ciccc.java.lab3.solution;

/**
 * @author Rodrigo Moura Gonçalves
 * @version 2016-10-21
 *
 */
public class Knight extends ChessPiece {

	private static final int KNIGHT_IMPORTANCE = 2;

	/**
	 * Constructor
	 */
	public Knight() {
		super(KNIGHT_IMPORTANCE);
	}

	@Override
	public String toString() {
		return "Knight [getValue()=" + getValue() + "]";
	}

	@Override
	public void move() {
		System.out.println("like an L");
	}

}
