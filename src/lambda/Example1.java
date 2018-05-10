package lambda;

@FunctionalInterface
interface MyInterface1 {

	public String doSomething();

}

public class Example1 {

	public static void main(String[] args) {
//		MyInterface1 some = () -> {
//			return "Doing something...";
//		};
		
		MyInterface1 some = () -> "Doing something...";
		
		MyInterface1 something = () -> "Doing something else...";

		System.out.println(some.doSomething());
		
		System.out.println(something.doSomething());
	}

}
