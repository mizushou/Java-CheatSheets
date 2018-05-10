package footballTeam;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Driver {

	private FootballTeam team;

	public void run() {
		team = new FootballTeam("Super Team", "Vancouver", Color.BLACK);
		addPlayers();
//		printPlayers(true);
		printPlayerSortedByName();
	}

	public void addPlayers() {
		for (int number = 1; number < 12; number++) {
			Player p = new Player("Player " + number);
			team.hirePlayer(p);
		}
	}

	public void printPlayers(boolean sortByNumber) {
		Set<Integer> keys = team.getPlayers().keySet();
		ArrayList<Integer> numbersList = new ArrayList<>(keys);

		if (sortByNumber) {
			Collections.sort(numbersList, new SortByNumberComparator().reversed());
			// OR numbersList.sort(new SortPlayerByNumberComparator());
			// OR Collections.sort(numbersList); this one using Comparable interface
		}

		Iterator<Integer> it = numbersList.iterator();
		while (it.hasNext()) {
			int key = it.next();
			System.out.println(team.getPlayers().get(key));
		}
	}

	public void printPlayerSortedByName() {
		List<Player> allPlayers = new ArrayList<>(team.getPlayers().values());

		Collections.sort(allPlayers, new SortPlayerByNameComparator());

		Iterator<Player> it = allPlayers.iterator();
		while (it.hasNext()) {
			Player player = it.next();
			System.out.println(player);
		}
	}

	public static void main(String[] args) {
		Driver driver = new Driver();
		driver.run();
	}

}
