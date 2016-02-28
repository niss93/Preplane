package com.dataaccess;
import java.util.List;

import com.buisnessobject.Crew;
import com.buisnessobject.Flight;



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
	Crew getCrewList(Flight flight);

}
