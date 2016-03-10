package parsers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateParser {
	public static Date StringToDate(String date) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

		try {

			Date newdate = formatter.parse(date);
			return newdate;

		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
}
