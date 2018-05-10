package enumeration;

public enum WeekDay {

	SUNDAY("Sun"), MONDAY("Mon"), TUESDAY("Tue"), WEDNESDAY("Wed"), THURSDAY("Thu"), FRIDAY("Fri"), SATURDAY("Sat");

	private String detail;

	private WeekDay(String detail) {
		this.detail = detail;
	}

	public String getDetail() {
		return detail;
	}

}
