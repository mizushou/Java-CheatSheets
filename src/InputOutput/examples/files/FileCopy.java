package InputOutput.examples.files;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;

public class FileCopy {
	/**
	 * Main method
	 * 
	 * @param args
	 *            [0] for sourcefile
	 * @param args
	 *            [1] for target file
	 */
	public static void main(String[] args) throws IOException {
		Instant startTime = Instant.now();
		// Check command-line parameter usage
		if (args.length != 2) {
			System.out.println("Usage: java CopyFile sourceFile targetfile");
			System.exit(0);
		}

		// Check if source file exists
		File sourceFile = new File(args[0]);
		if (!sourceFile.exists()) {
			System.out.println("Source file " + args[0] + " not exist");
			System.exit(0);
		}

		// Check if target file exists
		File targetFile = new File(args[1]);
		if (targetFile.exists()) {
			System.out.println("Target file " + args[1] + " already exists");
		}

		// Create an input stream
		BufferedInputStream input = new BufferedInputStream(new FileInputStream(sourceFile));

		// Create an output stream
		BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(targetFile));

		// Display the file size
		System.out.println("The file " + args[0] + " has " + input.available() + " bytes");

		// Continuously read a byte from input and write it to output
		int line;
		// -1 means end of the File
		while ((line = input.read()) != -1) {
			output.write(line);
		}

		// Close streams
		input.close();
		output.close();

		System.out.println("Copy done!");
		Instant endTime = Instant.now();
		System.out.println(String.format("Duration: %d ms", Duration.between(startTime, endTime).toMillis()));
	}
}
