package class10.examples.exceptions;

import java.text.DateFormat;
import java.util.Calendar;

public class GeometricObject {

	private final Calendar _date;

	public GeometricObject() {
		_date = Calendar.getInstance();
	}

	public String getDateCreated() {
		return DateFormat.getDateTimeInstance().format(_date);
	}
}
