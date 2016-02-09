public class User {
    private int idUser;
    private String name;
    private String firstName;
    private int age;
    private CrewStatus crewStatus;

    public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public CrewStatus getCrewStatus() {
		return crewStatus;
	}
	public void setCrewStatus(CrewStatus crewStatus) {
		this.crewStatus = crewStatus;
	}
	
	void editFlight(Flight flight) {
		if(this.crewStatus == CrewStatus.OCC) {
			// edition allowed for OCC members only
		}
    }
    void addFlight(Flight flight) {
    	if(this.crewStatus == CrewStatus.OCC) {
    		// addition allowed for OCC members only
    	}
    }
}
