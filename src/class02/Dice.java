package class02;

import java.util.Random;

public class Dice {

	// Instance variable
	private int value;

	// General constants
	private static final int RANGE = 6;
	private static final int MIN = 1;

	/**
	 * Constructor
	 */
	public Dice() {
		this.value = rollDice();
	}

	/**
	 * Roll the dice and return the value
	 * 
	 * @return the value after roll the dice
	 */
	public final int rollDice() {
		Random r = new Random();
		this.value = r.nextInt(RANGE) + MIN;

		return this.value;
	}

}
