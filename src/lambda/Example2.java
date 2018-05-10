package lambda;

@FunctionalInterface
interface IncrementByOne {

	public int incrementByOne(int num);

}

public class Example2 {

	public static void main(String[] args) {
		IncrementByOne obj = (x) -> x + 1;

		System.out.println(obj.incrementByOne(15));
	}

}
