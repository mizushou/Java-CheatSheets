package enumeration;

public class Driver {

	public static void main(String[] args) {
		System.out.println(WeekDay.SUNDAY.getDetail());
		System.out.println(WeekDay.FRIDAY + " ordinal is " + WeekDay.FRIDAY.ordinal());
		System.out.println(WeekDay.SUNDAY + " ordinal is " + WeekDay.SUNDAY.ordinal());

		WeekDay day = WeekDay.FRIDAY;
		WeekDay day2 = WeekDay.FRIDAY;

		if (day == day2) {
			System.out.println("equals using ==");
		} else {
			System.out.println("not equals using ==");
		}

		if (day.equals(day2)) {
			System.out.println("equals using method");
		} else {
			System.out.println("not equals using method");
		}

		switch (day) {
		case SUNDAY:
			System.out.println(1);
			break;
		case MONDAY:
			System.out.println(2);
			break;
		case TUESDAY:
			System.out.println(3);
			break;
		case WEDNESDAY:
			System.out.println(4);
			break;
		case THURSDAY:
			System.out.println(5);
			break;
		case FRIDAY:
			System.out.println(6);
			break;
		case SATURDAY:
			System.out.println(7);
			break;
		}
	}

}
