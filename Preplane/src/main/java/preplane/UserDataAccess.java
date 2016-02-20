package preplane;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
@Path("/jarib")
public class UserDataAccess implements UserDao {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/user")
	public List<User> getList() {
		User user = new User(1,"atik","lahiyane",23,CrewStatus.OCC);
		List<User> list = new ArrayList<User>();
		list.add(user);
		return list;
	}

	public User getList(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public User getListName(String Name) {
		// TODO Auto-generated method stub
		return null;
	}

	public User getListfirst(String firstname) {
		// TODO Auto-generated method stub
		return null;
	}

}
