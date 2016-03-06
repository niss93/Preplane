import buisnessobject.Flight;
import buisnessobject.FlightStatus;
import dataaccess.DAO;
import dataaccess.DbSos;
import parsers.DateParser;

public class Principale {

	public static void main(String[] args) {
	
DAO.getFlightDao().addFlight(new Flight("13/05/1992","Marseille",
				"Rabat","atc1Z","atc43E","notam",FlightStatus.valueOf("ON_TIME"),"Dream team"));
	}

}
