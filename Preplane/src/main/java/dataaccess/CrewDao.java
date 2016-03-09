package dataaccess;
import java.util.List;

import buisnessobject.Crew;
import buisnessobject.Flight;



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
	Crew getCrewList(String atc);
	/**
	 * Return the crew of corresponding name
	 * @param name
	 * @return
	 */
	Crew getCrew(String name);
}
