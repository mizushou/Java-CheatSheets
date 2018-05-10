package collections;

import java.util.ArrayList;

public class Example1 {

	private ArrayList<String> myList;

	public Example1() {
		ArrayList<String> myList = new ArrayList<String>();

		myList.add("One");
		myList.add("Three");

	}

	public void printValues() {
		for (String text : myList) {
			System.out.println(text);
		}
	}

	public void addValue() {
		myList.add(1, "Two");
	}

	public static void main(String[] args) {
		Example1 ex = new Example1();
		System.out.println("Before add the value\n");
		ex.printValues();

		ex.addValue();
		System.out.println("\nAfter add the value\n");
		ex.printValues();
	}

}
