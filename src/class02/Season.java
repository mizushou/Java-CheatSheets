package class02;

public enum Season {
	WINTER("It's cold!"), SPRING("Getting warmer"), SUMMER("Nice and warm"), FALL("Getting colder");

	private String description;

	Season(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
}