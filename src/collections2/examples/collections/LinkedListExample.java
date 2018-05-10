package collections2.examples.collections;

import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("is");
		list.add("is");
		list.add("a");
		list.add("a");
		list.addLast("test");
		list.addFirst("This");
		CollectionUtil.display(list);
	}
}
