package lambda;

@FunctionalInterface
interface ConcatWords {

	public String concatWord(String a, String b);

}

public class Example3 {

	public static void main(String[] args) {

		ConcatWords result = (wordA, wordB) -> wordA + " " + wordB;
		System.out.println(result.concatWord("Lambda", "Expressions"));

	}

}