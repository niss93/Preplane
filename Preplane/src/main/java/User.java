import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class User {
    private int idUser;
    private String name;
    private String firstName;
    private int age;
    private CrewStatus crewStatus;

    public User(int id, String name, String first, int age, CrewStatus crew){
    	this.idUser = id;
    	this.name = name;
    	this.firstName = first;
    	this.age= age;
    	this.crewStatus= crew;
    }
    public String toString(){
    	return "id : "+this.idUser+", name: "+this.name+", firstname: "+this.firstName+", age: "+this.age;
    }
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

class userDao implements UserDao {
	Connection conn =null;
	Statement stmt=null;
	
	public userDao() throws ClassNotFoundException, SQLException{
		Class.forName(JDBC_DRIVER);
		System.out.println("Connection to database ...");
		conn = (Connection) DriverManager.getConnection(DB_URL, USER, PASS);
		
		
	}
	public List<User> getList() {
		try {
			List<User> list = new ArrayList<User>();
			stmt = (Statement) conn.createStatement();
			String sql = "Select idno, name, firstname, age from user";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				
				int id = rs.getInt("idno");
				int age = rs.getInt("age");
				String name = rs.getString("name");
				String first = rs.getString("firstname");
				User user = new User(id, name, first, age, null);
				list.add(user);
				return list;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}

	public List<User> getList(int idUser) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> getListName(String Name) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> getListfirst(String firstname) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> getLisage(int age) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
