package class06.book.examples;

//********************************************************************
//  CD.java       Java Foundations
//
//  Represents a compact disc.
//********************************************************************

import java.text.NumberFormat;

public class CD {
	private String title;
	private String artist;
	private double cost;
	private int tracks;

	// -----------------------------------------------------------------
	// Creates a new CD with the specified information.
	// -----------------------------------------------------------------
	public CD(String name, String singer, double price, int numTracks) {
		title = name;
		artist = singer;
		cost = price;
		tracks = numTracks;
	}

	public String getDescription() {
		NumberFormat fmt = NumberFormat.getCurrencyInstance();

		String description;

		description = fmt.format(cost) + "\t" + tracks + "\t";
		description += title + "\t" + artist;

		return description;
	}

	@Override
	public String toString() {
		return "CD [title=" + title + ", artist=" + artist + ", cost=" + cost + ", tracks=" + tracks
				+ ", getDescription()=" + getDescription() + "]";
	}

}
