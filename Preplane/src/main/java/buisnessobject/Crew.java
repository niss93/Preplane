package buisnessobject;

import java.util.List;

import javax.jdo.annotations.PersistenceCapable;

@PersistenceCapable
public class Crew {

	private String crewName;
	private String crewName;
	private List<User> crewList;
	private Flight flight;
	
	public Crew(String name){
		crewName = name;
	}

	public Crew(String name){
		crewName = name;
	}

	public Crew(String crewName, List<User> crewList, Flight flight) {
		super();
		this.crewName = crewName;
		this.crewList = crewList;
		this.flight = flight;
	}

	public List<User> getCrewList() {
		return crewList;
	}

	public void setCrewList(List<User> crewList) {
		this.crewList = crewList;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public String getCrewName() {
		return crewName;
	}

	public void setCrewName(String crewName) {
		this.crewName = crewName;
	}
}
