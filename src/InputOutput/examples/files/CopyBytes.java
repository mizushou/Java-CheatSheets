package InputOutput.examples.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;

public class CopyBytes {
	public static void main(String[] args) {
		Instant startTime = Instant.now();

		FileInputStream input = null;
		FileOutputStream output = null;

		try {
			input = new FileInputStream("Input.txt");
			output = new FileOutputStream("OutputCopyBytes.txt");
			int line;

			// -1 means end of the File
			while ((line = input.read()) != -1) {
				output.write(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (output != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		Instant endTime = Instant.now();
		System.out.println(String.format("Duration: %d ms", Duration.between(startTime, endTime).toMillis()));
	}
}
