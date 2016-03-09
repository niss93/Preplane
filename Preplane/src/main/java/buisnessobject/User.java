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
	private String username;
	
	@Persistent
    private String name;
	
    @Persistent
	private String firstName;
    
	@Persistent
	private Crew myCrew;
	
	@Persistent
	private CrewStatus crewStatus;
    
	@Persistent
	private String password;

    public User(int id, String username, String name, String firstname,Crew myCrew, CrewStatus crew, String password){
    	this.id = id;
    	this.username=username;
    	this.name = name;
    	this.firstName = firstname;
    	this.myCrew=myCrew;
    	this.crewStatus= crew;
    	this.password=password;
    }
    public String toString(){
    	return "id : "+this.id+", name: "+this.name+", firstname: "+this.firstName+" password:"+this.password;
    }
    public int getIdUser() {
		return id;
	}
	public void setIdUser(int idUser) {
		this.id = idUser;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Crew getMyCrew() {
		return myCrew;
	}
	public void setMyCrew(Crew myCrew) {
		this.myCrew = myCrew;
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
    public String getPassword(){
    	return password;
    }
    public void setPassword(String pass ){
    	this.password = pass;
    }

}
	

