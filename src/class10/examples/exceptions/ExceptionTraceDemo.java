package class10.examples.exceptions;

/**
 * @author sam
 * 
 */
public class ExceptionTraceDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new ExceptionTraceDemo();
	}

	private ExceptionTraceDemo() {
		normal();
		exceptionAfterTwo();
		comp2611Exception();
	}

	@Deprecated
	private void normal() {
		System.out.println("*** normal");
		try {
			// statement 1
			System.out.println("One");
			// statement 2
			System.out.println("Two");
			// statement 3
			System.out.println("Three");
		} catch (Exception e) {
			// handle the exception
			System.out.println("Four - handle exception");
			return;
		} finally {
			// final statements�
			System.out.println("Five - finally, do something");
		}

		// Next statement
		System.out.println("Six - keep going");
	}

	private void exceptionAfterTwo() {
		System.out.println("*** exceptionOnTwo");
		try {
			// statement 1
			System.out.println("One");
			// statement 2
			System.out.println("Two");
			somethingEvil();
			// statement 3
			System.out.println("Three");
		} catch (Exception e) {
			// handle the exception
			System.out.println("Four - handle exception:" + e.getMessage());
			return;
		} finally {
			// final statements�
			System.out.println("Five - finally, do something");
		}

		// Next statement
		System.out.println("Six - keep going");
	}

	private void comp2611Exception() {
		System.out.println("*** comp2611Exception");
		try {
			// statement 1
			System.out.println("One");
			// statement 2
			System.out.println("Two");
			moreEvilness();
			// statement 3
			System.out.println("Three");
		} catch (Comp2613Exception e) {
			// handle the exception
			System.out.println(String.format("Four a - handle a %s: %s", e.getClass().getSimpleName(), e.getMessage()));
			return;
		} catch (Exception e) {
			// handle the exception
			System.out.println("Four b - handle Exception:" + e.getMessage());
			return;
		} finally {
			// final statements�
			System.out.println("Five - finally, do something");
		}

		// Next statement
		System.out.println("Six - keep going");
	}

	private void somethingEvil() throws Exception {
		if (true) {
			throw new Exception("Evil code was executed.");
		}
	}

	private void moreEvilness() throws Comp2613Exception {
		if (true) {
			throw new Comp2613Exception("more evilness");
		}
	}

	@SuppressWarnings("serial")
	public class Comp2613Exception extends Exception {
		public Comp2613Exception(String s) {
			super(s);
		}

		@Override
		public String toString() {
			return "foo";
		}
	}

}
