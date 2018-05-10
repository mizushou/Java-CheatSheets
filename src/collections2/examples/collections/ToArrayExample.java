package collections2.examples.collections;

import java.util.ArrayList;

public class ToArrayExample {

	public static void main(String[] args) {
		ArrayList<String> items = new ArrayList<>();
		items.add("Orange");
		items.add("Green");
		items.add("White");
		String[] colours = items.toArray(new String[0]);
		CollectionUtil.display(colours);
	}
}
