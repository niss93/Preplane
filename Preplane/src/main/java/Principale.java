import java.awt.List;

import buisnessobject.CrewStatus;
import buisnessobject.Flight;
import buisnessobject.FlightStatus;
import buisnessobject.User;
import dataaccess.DAO;
import dataaccess.DbSos;
import parsers.DateParser;

public class Principale {

	public static void main(String[] args) {
		System.out.println(DAO.getFlightDao().getFlight());
	}
	

}
