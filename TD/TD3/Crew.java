import java.util.List;

public class Crew {
    private List<User> crewList;
    private Flight flight;
	
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
}
