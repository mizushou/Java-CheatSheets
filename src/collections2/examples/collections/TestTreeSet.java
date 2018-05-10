package collections2.examples.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {
	public static void main(String[] args) {
		// Create a hash set
		Set<String> set = new HashSet<>();

		// Add strings to the set
		set.add("London");
		set.add("Paris");
		set.add("New York");
		set.add("San Francisco");
		set.add("Beijing");
		set.add("New York");

		Set<Integer> set2 = new HashSet<>();
		set2.add(643764);
		set2.add(18382);
		set2.add(100);
		set2.add(532);

		TreeSet<String> treeSet = new TreeSet<>(set);
		System.out.println(treeSet);

		TreeSet<Integer> treeSet2 = new TreeSet<>(set2);
		System.out.println(treeSet2);

		// Display the elements in the hash set
		for (Object element : set) {
			System.out.print(element.toString() + " ");
		}

		System.out.println();

		for (Integer number : set2) {
			System.out.print(number + " ");
		}
	}
}
