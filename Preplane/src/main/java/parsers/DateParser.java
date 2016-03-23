package parsers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.eclipse.jetty.util.log.Log;

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
	
	public static void main(String[] args) {
		System.out.println(StringToDate("10/6/2000"));
	}
}
