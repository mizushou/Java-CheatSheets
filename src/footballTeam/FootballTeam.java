package footballTeam;

import java.awt.Color;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class FootballTeam {

	public static final int LAST_JERSEY = 23;

	private String name;
	private Coach coach;
	private String city;
	private Color uniformColor;
	private int numberOfGolsInSeason;
	private int numberOfInternationalThrophies;
	private Map<Integer, Player> players;
	private Set<Integer> jerseyNumbers;

	/**
	 * @param name
	 * @param city
	 * @param uniformColor
	 */
	public FootballTeam(String name, String city, Color uniformColor) {
		this.name = name;
		this.city = city;
		this.uniformColor = uniformColor;
		players = new HashMap<>();
		jerseyNumbers = new HashSet<Integer>();
	}

	public boolean hirePlayer(Player player) {
		int jerseyNumber = createJerseyNumber();
		boolean hired = false;

		if (jerseyNumber != -1) {
			player.setJerseyNumber(jerseyNumber);
			jerseyNumbers.add(player.getJerseyNumber());
			players.put(player.getJerseyNumber(), player);
			hired = true;
		}

		return hired;
	}

	public boolean firePlayer(Player player) {
		boolean fired;
		fired = players.remove(player.getJerseyNumber(), player);
		jerseyNumbers.remove(player.getJerseyNumber());

		return fired;
	}

	private int createJerseyNumber() {
		boolean notAvailable = false;
		Random random = new Random();
		int number = -1;

		if (jerseyNumbers.size() < LAST_JERSEY) {
			do {
				number = random.nextInt(LAST_JERSEY) + 1;
				notAvailable = jerseyNumbers.contains(number);
			} while (notAvailable);
		}

		return number;
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final Coach getCoach() {
		return coach;
	}

	public final void setCoach(Coach coach) {
		this.coach = coach;
	}

	public final String getCity() {
		return city;
	}

	public final void setCity(String city) {
		this.city = city;
	}

	public final Color getUniformColor() {
		return uniformColor;
	}

	public final void setUniformColor(Color uniformColor) {
		this.uniformColor = uniformColor;
	}

	public final int getNumberOfGolsInSeason() {
		return numberOfGolsInSeason;
	}

	public final void setNumberOfGolsInSeason(int numberOfGolsInSeason) {
		this.numberOfGolsInSeason = numberOfGolsInSeason;
	}

	public final int getNumberOfInternationalThrophies() {
		return numberOfInternationalThrophies;
	}

	public final void setNumberOfInternationalThrophies(int numberOfInternationalThrophies) {
		this.numberOfInternationalThrophies = numberOfInternationalThrophies;
	}

	public final Map<Integer, Player> getPlayers() {
		return players;
	}

	public final void setPlayers(HashMap<Integer, Player> players) {
		this.players = players;
	}

}
