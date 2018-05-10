package lab3Solution.ca.ciccc.java.lab3.solution;

/**
 * @author Rodrigo Moura Gonçalves
 * @version 2016-10-21
 *
 */
public class Pawn extends ChessPiece {

	private static final int PAWN_IMPORTANCE = 1;

	private boolean hasBeenPromoted;
	private ChessPiece newPiece;

	/**
	 * Constructor
	 */
	public Pawn() {
		super(PAWN_IMPORTANCE);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Pawn [hasBeenPromoted=" + hasBeenPromoted + ", newPiece=" + newPiece + ", getValue()=" + getValue()
				+ "]";
	}

	@Override
	public void move() {
		System.out.println("forward 1");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (hasBeenPromoted ? 1231 : 1237);
		result = prime * result + ((newPiece == null) ? 0 : newPiece.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object that) {

		if (that == null) {
			return false;
		}

		if (this == that) {
			return true;
		}

		if (!(that instanceof Pawn)) {
			return false;
		}

		Pawn otherPawn = (Pawn) that;
		if (hasBeenPromoted != otherPawn.hasBeenPromoted) {
			return false;
		}

		if (newPiece == null) {
			if (otherPawn.newPiece != null) {
				return false;
			}
		} else if (!newPiece.equals(otherPawn.newPiece)) {
			return false;
		}

		return true;
	}

	/**
	 * Promote a Pawn piece
	 * 
	 * @param newPiece
	 */
	public void promote(ChessPiece newPiece) {

		// If the piece is not a King neither Pawn, and the pawn has not been promoted yet
		if (!(newPiece instanceof King) && !(newPiece instanceof Pawn) && !hasBeenPromoted) {
			setNewPiece(newPiece);
			setHasBeenPromoted(true);
		}
	}

	/**
	 * @return the hasBeenPromoted
	 */
	public final boolean isHasBeenPromoted() {
		return hasBeenPromoted;
	}

	/**
	 * @param hasBeenPromoted
	 *            the hasBeenPromoted to set
	 */
	private void setHasBeenPromoted(boolean hasBeenPromoted) {
		this.hasBeenPromoted = hasBeenPromoted;
	}

	/**
	 * @return the newPiece
	 */
	public final ChessPiece getNewPiece() {
		return newPiece;
	}

	/**
	 * @param newPiece
	 *            the newPiece to set
	 */
	private void setNewPiece(ChessPiece newPiece) {
		if (newPiece != null) {
			this.newPiece = newPiece;
		}
	}
}
