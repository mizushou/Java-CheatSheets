package lab3Solution.ca.ciccc.java.lab3.solution;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Rodrigo Moura Gonçalves
 * @version 2016-10-24
 *
 */
public class ChessPieceTest {

	private King king;
	private Queen queen;
	private Rook rook;
	private Bishop bishop;
	private Knight knight;
	private Pawn pawn;

	@Before
	public void initAll() {
		king = new King();
		queen = new Queen();
		rook = new Rook();
		bishop = new Bishop();
		knight = new Knight();
		pawn = new Pawn();
	}

	@Test
	public void testEquals() {
		ChessPiece anotherKing = new King();
		assertTrue(king.equals(anotherKing));
	}

	@Test
	public void testEquals2() {
		Pawn anotherPawn = new Pawn();
		assertTrue(pawn.equals(anotherPawn));
	}

	@Test
	public void testEquals3() {
		assertFalse(king.equals(pawn));
	}

	@Test
	public void testEquals4() {
		pawn.promote(knight);

		ChessPiece anotherKnight = new Knight();
		Pawn anotherPawn = new Pawn();
		anotherPawn.promote(anotherKnight);

		assertTrue(pawn.equals(anotherPawn));
	}

	@Test
	public void testEquals5() {
		pawn.promote(knight);

		Pawn anotherPawn = new Pawn();
		anotherPawn.promote(queen);

		assertFalse(pawn.equals(anotherPawn));
	}

	@Test
	public void testHasCode() {
		ChessPiece anotherKing = new King();
		assertEquals(king.hashCode(), anotherKing.hashCode());
	}

	@Test
	public void testHasCode2() {
		assertNotEquals(king.hashCode(), pawn.hashCode());
	}

	@Test
	public void testHasCode3() {
		ChessPiece anotherPawn = new Pawn();
		assertEquals(pawn.hashCode(), anotherPawn.hashCode());
	}

	@Test
	public void testPromote() {
		pawn.promote(king);
		assertNull(pawn.getNewPiece());
		assertFalse(pawn.isHasBeenPromoted());
	}

	@Test
	public void testPromote2() {
		ChessPiece anotherPawn = new Pawn();
		pawn.promote(anotherPawn);
		assertNull(pawn.getNewPiece());
		assertFalse(pawn.isHasBeenPromoted());
	}

	@Test
	public void testPromote3() {
		pawn.promote(knight);
		assertTrue(pawn.getNewPiece().equals(knight));
		assertTrue(pawn.isHasBeenPromoted());
	}

	@Test
	public void testPromote4() {
		pawn.promote(bishop);
		assertTrue(pawn.getNewPiece().equals(bishop));
		assertTrue(pawn.isHasBeenPromoted());
	}

	@Test
	public void testPromote5() {
		pawn.promote(rook);
		assertTrue(pawn.getNewPiece().equals(rook));
		assertTrue(pawn.isHasBeenPromoted());
	}

	@Test
	public void testPromotedTwice() {
		pawn.promote(rook);
		assertTrue(pawn.getNewPiece().equals(rook));
		assertTrue(pawn.isHasBeenPromoted());
		
		pawn.promote(bishop);
		assertFalse(pawn.getNewPiece().equals(bishop));
		assertTrue(pawn.isHasBeenPromoted());
	}
}
