package InputOutput.examples.files;

import java.io.File;
import java.time.Duration;
import java.time.Instant;
import java.util.Formatter;
import java.util.Scanner;

public class ReadFileUsingScanner {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) {
		Instant startTime = Instant.now();

		Scanner scanner = null;
		Formatter output = null;

		try {
			scanner = new Scanner(new File(args[0]));
			output = new Formatter("ReadFileUsingScanner.txt");

			int i = 0;
			while (scanner.hasNext()) {
				String row = scanner.nextLine();
				System.out.println(row);
				output.format("%d. %s%n", ++i, row);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (scanner != null) {
				try {
					scanner.close();
				} catch (Exception e) {
				}
			}
			if (output != null) {
				try {
					output.close();
				} catch (Exception e) {
				}
			}

			Instant endTime = Instant.now();
			System.out.println(String.format("Duration: %d ms", Duration.between(startTime, endTime).toMillis()));
		}

	}

}
