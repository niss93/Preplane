import java.util.List;

public interface AirportDao {
	/** Get the list of airport
	 * 
	 * @return
	 */
	List<Airport> getAirport();
	/** Get the airport using id
	 * 
	 * @param idAirport
	 * @return
	 */
	List<Airport> getAirport (String idAirport);
	/** Get the airport using the country
	 * 
	 * @param country
	 * @return
	 */
	List<Airport> getAirportContry (String country);
	/** Get the airport using the city
	 * 
	 * @param city
	 * @return
	 */
	List<Airport> getAirportCity (String city);
	
}
