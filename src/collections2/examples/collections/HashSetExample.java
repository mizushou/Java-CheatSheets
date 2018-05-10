package collections2.examples.collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();

		// this part of the example is to show how ternary expressions are used and their if-then-else equivalent
		// this ternary expression...
		System.out.println(set.add("This") ? "\"This\" added" : "\"This\" not added");
		System.out.println(set.add("This") ? "\"This\" added" : "\"This\" not added");
		System.out.println(set.add("is") ? "\"is\" added" : "\"is\" not added");
		System.out.println(set.add("is") ? "\"is\" added" : "\"is\" not added");
		System.out.println(set.add("a") ? "\"a\" added" : "\"a\" not added");
		System.out.println(set.add("a") ? "\"a\" added" : "\"a\" not added");
		System.out.println(set.add("test") ? "\"test\" added" : "\"test\" not added");

		CollectionUtil.display(set);
	}
}
