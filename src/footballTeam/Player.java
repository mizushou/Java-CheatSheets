package footballTeam;

public class Player {

	private String name;
	private int jerseyNumber;

	/**
	 * @param name
	 */
	public Player(String name) {
		this.name = name;
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final int getJerseyNumber() {
		return jerseyNumber;
	}

	public final void setJerseyNumber(int jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", jerseyNumber=" + jerseyNumber + "]";
	}

}
