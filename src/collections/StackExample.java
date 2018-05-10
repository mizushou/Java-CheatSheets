package collections;

import java.util.Iterator;
import java.util.Stack;

public class StackExample {

	public static void main(String a[]) {
		Stack<Integer> stack = new Stack<>();

		System.out.println("Empty stack : " + stack.isEmpty());

		stack.push(101);
		stack.push(102);
		stack.push(103);
		stack.push(104);
//		stack.push(105);
		
//		for (Integer integer : stack) {
//			System.out.println(integer);
//		}

		Iterator<Integer> it = stack.iterator();
		while (it.hasNext()) {
			int number = it.next();
			System.out.println(number);
		}

		System.out.println("Non-Empty stack : " + stack);
		System.out.println("Non-Empty stack : search() Operation : " + stack.search(101));
		System.out.println("Non-Empty stack: Pop Operation : " + stack.pop());
		System.out.println("Non-Empty stack : After Pop Operation : " + stack);
		System.out.println("Non-Empty stack : Peek Operation : " + stack.peek());
		System.out.println("Non-Empty stack : After Peek Operation : " + stack);
		System.out.println("Non-Empty stack : search() Operation : " + stack.search(101));
		System.out.println("Non-Empty stack : " + stack.isEmpty());
	}
}
