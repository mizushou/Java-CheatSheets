package class02;

public class EnumExample {

	public static void main(String[] args) {
		Season season = Season.SUMMER;		
		System.out.println(season);
		System.out.println(season.getDescription());
	}

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

}
