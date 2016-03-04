package buisnessobject;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable

public class User {
	@Persistent
	@PrimaryKey
    private int id;
	
	@Persistent
    private String name;
    
	@Persistent
	private String firstName;
    
	@Persistent
	private CrewStatus crewStatus;
    
	@Persistent
	private String password;

    public User(int id, String name, String firstname,CrewStatus crew, String password){
    	this.id = id;
    	this.name = name;
    	this.firstName = firstname;
    	this.crewStatus= crew;
    	this.password=password;
    }
    public String toString(){
    	return "id : "+this.id+", name: "+this.name+", firstname: "+this.firstName;
    }
    public int getIdUser() {
		return id;
	}
	public void setIdUser(int idUser) {
		this.id = idUser;
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
	

