package collections2.examples.collections;

import java.util.HashSet;

public class HashSetExample3 {
	public static void main(String[] args) {
		new HashSetExample3();
	}

	private HashSetExample3() {
		HashSet<TestObject> set = new HashSet<>();
		System.out.println(set.add(new TestObject("This")) ? "\"This\" added" : "\"This\" not added");
		System.out.println(set.add(new TestObject("is")) ? "\"is\" added" : "\"is\" not added");
		System.out.println(set.add(new TestObject("is")) ? "\"is\" added" : "\"is\" not added");
		System.out.println(set.add(new TestObject("a")) ? "\"a\" added" : "\"a\" not added");
		System.out.println(set.add(new TestObject("a")) ? "\"a\" added" : "\"a\" not added");
		System.out.println(set.add(new TestObject("test")) ? "\"test\" added" : "\"test\" not added");

		CollectionUtil.display(set);
	}

	public class TestObject {
		String data;

		TestObject(String s) {
			data = s;
		}

		@Override
		public int hashCode() {
			return 0;
		}

		@Override
		public String toString() {
			return data;
		}
	}

}
