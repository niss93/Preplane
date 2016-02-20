package preplane;
import java.util.List;

public interface CrewDao {
	/**
	 * Return the list of crews
	 * @return
	 */
	List<Crew> getCrewList();
	
	/**
	 * Return the list of crew of the flight in parameter
	 * @param flight
	 * @return
	 */
	List<Crew> getCrewList(Flight flight);

}
