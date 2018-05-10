package lab3Solution.ca.ciccc.java.lab3.solution;

import java.util.ArrayList;

/**
 * @author Rodrigo Moura Gonçalves
 * @version 2016-10-21
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<ChessPiece> pieces = new ArrayList<ChessPiece>();

		pieces.add(new Pawn());
		pieces.add(new Knight());
		pieces.add(new Bishop());
		pieces.add(new Rook());
		pieces.add(new Queen());
		pieces.add(new King());

		for (ChessPiece cp : pieces) {
			System.out.print(cp.toString() + " moves ");
			cp.move();
		}
	}
}
