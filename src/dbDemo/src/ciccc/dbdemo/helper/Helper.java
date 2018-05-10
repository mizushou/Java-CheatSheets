package dbDemo.src.ciccc.dbdemo.helper;

import java.time.LocalDate;

/**
 * @author Rodrigo Moura Gonçalves
 * 
 */
public class Helper {

	public static final String DATE_SPLIT_REGEX = "\\-";

	private static final int JANUARY = 1;
	private static final int FEBRUARY = 2;
	private static final int MARCH = 3;
	private static final int APRIL = 4;
	private static final int MAY = 5;
	private static final int JUNE = 6;
	private static final int JULY = 7;
	private static final int AUGUST = 8;
	private static final int SEPTEMBER = 9;
	private static final int OCTOBER = 10;
	private static final int NOVEMBER = 11;
	private static final int DECEMBER = 12;

	private static final int MIN_YEAR = 1900;

	private static final int FOUR = 4;
	private static final int ONE_HUNDRED = 100;
	private static final int FOUR_HUNDRED = 400;
	private static final int TWENTY_EIGHT_DAYS = 28;
	private static final int TWENTY_NINE_DAYS = 29;
	private static final int THIRTY_DAYS = 30;
	private static final int THIRTY_ONE_DAYS = 31;

	public static LocalDate convertStringFromDBToDate(String stringDate) throws Exception {

		String[] date = stringDate.split(DATE_SPLIT_REGEX);
		int year, month, day;

		if (date.length == 3) {
			year = Integer.parseInt(date[0]);
			month = Integer.parseInt(date[1]);
			day = Integer.parseInt(date[2]);
		} else {
			throw new Exception("Invalid date: " + stringDate);
		}

		if (!isDateValid(year, month, day)) {
			throw new Exception("Invalid values for date. Year: " + year + ", month: " + month + ", day: " + day);
		}

		LocalDate localDate = LocalDate.of(year, month, day);

		return localDate;
	}

	public static boolean isDateValid(int year, int month, int day) {
		if (!isYearValid(year) || !isMonthValid(month)) {
			return false;
		}

		int lastDayOfMonth = getNumberOfDaysInMonth(month, year);
		if (!(day > 0 && day <= lastDayOfMonth)) {
			return false;
		}

		return true;
	}

	private static boolean isYearValid(int year) {
		if (year >= MIN_YEAR) {
			return true;
		} else {
			return false;
		}
	}

	private static boolean isMonthValid(int month) {
		if (month >= JANUARY && month <= DECEMBER) {
			return true;
		} else {
			return false;
		}
	}

	private static int getNumberOfDaysInMonth(int month, int year) {
		int numberOfDays;

		switch (month) {
		case JANUARY:
		case MARCH:
		case MAY:
		case JULY:
		case AUGUST:
		case OCTOBER:
		case DECEMBER:
			numberOfDays = THIRTY_ONE_DAYS;
			break;
		case APRIL:
		case JUNE:
		case SEPTEMBER:
		case NOVEMBER:
			numberOfDays = THIRTY_DAYS;
			break;
		case FEBRUARY:
			numberOfDays = isLeapYear(year) ? TWENTY_NINE_DAYS : TWENTY_EIGHT_DAYS;
			break;
		default:
			numberOfDays = 0;
			break;
		}

		return numberOfDays;
	}

	private static boolean isLeapYear(int year) {
		if (year % FOUR_HUNDRED == 0 || (year % FOUR == 0 && year % ONE_HUNDRED != 0)) {
			return true;
		} else {
			return false;
		}
	}

}
