package InputOutput.examples.files;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Serialize {
	private static final String FILENAME = "movies.dat";

	public static void main(String args[]) {
		ArrayList<Movie> movies = new ArrayList<>();
		movies.add(new Movie("Drama", "The Shawshank Redemption"));
		movies.add(new Movie("Action", "The Bourne Identity"));
		movies.add(new Movie("Comedy", "Ferris Bueller's Day Off"));
		movies.add(new Movie("SciFi", "Inception"));

		// stream the movies out to a file
		ObjectOutputStream output = null;
		try {
			output = new ObjectOutputStream(new FileOutputStream(FILENAME));
			output.writeObject(movies);
			
			System.out.println("Serializable Done!");
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			try {
				output.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
