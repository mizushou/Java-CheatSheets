package footballTeam;

import java.util.Comparator;

public class SortPlayerByNameComparator implements Comparator<Player> {

	@Override
	public int compare(Player p1, Player p2) {
		return p1.getName().compareTo(p2.getName());
	}

}
