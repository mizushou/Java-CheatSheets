package InputOutput.examples.files;

import java.io.Serializable;

public class Movie implements Serializable {

	private static final long serialVersionUID = 1L;

	private String category;
	private String title;

	public Movie(String category, String title) {
		this.category = category;
		this.title = title;
	}

	@Override
	public String toString() {
		return "CATEGORY = " + category + "\t" + "TITLE = " + title;
	}
}
