package InputOutput.examples.files;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class DeSerialize {
	private static final String FILENAME = "movies.dat";

	@SuppressWarnings("unchecked")
	public static void main(String args[]) {
		List<Movie> movies = new ArrayList<Movie>();

		try {
			ObjectInputStream objectInput = new ObjectInputStream(new FileInputStream(FILENAME));
			Object obj = objectInput.readObject();

			if (obj instanceof ArrayList<?>) {
				movies = (ArrayList<Movie>) obj;
				objectInput.close();
			} else {
				System.out.println("Bad movie file");
			}

		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}

		System.out.println("Reconstructed object from " + FILENAME + "\n");
		showMovies(movies);
	}

	public static void showMovies(List<Movie> movies) {
		for (Movie movie : movies) {
			System.out.println(movie);
		}
	}
}
