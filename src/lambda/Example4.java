package lambda;

public class Example4 {

	public static void main(String[] args) {
		ConcatWords2 result = (textA, textB, textC) -> textA + " " + textB + " " + textC;
		System.out.println(result.concatWord("Let's", "get", "started!"));
	}

}
