package dataaccess;
import java.util.Date;
import java.util.List;

import buisnessobject.Airport;
import buisnessobject.Flight;


public interface FlightDao {
	/**
	 * Get list of flight
	 * @return
	 */
	List<Flight> getFlight();
	/**
	 * Get list of flight according to the following date
	 * @param date
	 * @return
	 */
	List<Flight> getFlight(Date date);
	/**
	 * Get list of flight according to the following airport
	 * @param airport
	 * @return
	 */
	List<Flight> getFlightAir(Airport airport);
	/**
	 * Get list of flight according to the following commercial number
	 * @param com_number
	 * @return
	 */
	Flight getFlightCom(String com_number);
	/**
	 *Get list of flight according to the following atc
	 * @param atc
	 * @return
	 */
	Flight getFlightAtc(String atc);
	/**
	 * Get list of flight according to the following notam
	 * @param notam
	 * @return
	 */
	Flight getFlightNotam(String notam);
	/**
	 * Get list of flight according to the following status
	 * @param status
	 * @return
	 */
	List<Flight> getFlightStatus(String status);
	
	/**
	 * 
	 * @param flight
	 */
	void addFlight(Flight flight);
	void deleteFlight(String dh, String departure, String comno);
	public Flight getFlightbyId(int id);
}
