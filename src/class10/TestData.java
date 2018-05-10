package class10;
//********************************************************************
//  TestData.java       Java Foundations
//
//  Demonstrates I/O exceptions and the use of a character file
//  output stream.
//********************************************************************

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class TestData {
	// -----------------------------------------------------------------
	// Creates a file of test data that consists of ten lines each
	// containing ten integer values in the range 10 to 99.
	// -----------------------------------------------------------------
	public static void main(String[] args) {
		final int MAX = 10;

		int value;
		String file = "table.txt";

		Random rand = new Random();

		FileWriter fw;
		PrintWriter outFile = null;
		try {
			fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			outFile = new PrintWriter(bw);

			for (int line = 1; line <= MAX; line++) {
				for (int num = 1; num <= MAX; num++) {
					value = rand.nextInt(90) + 10;
					outFile.print(value + "   ");
				}
				outFile.println();
			}
		} catch (IOException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		} finally {
			if (outFile != null) {
				outFile.close();
			}
		}

		System.out.println("Output file has been created: " + file);
	}
}
