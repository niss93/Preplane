package webservices;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import buisnessobject.CrewStatus;
import buisnessobject.User;
import dataaccess.DAO;
@SuppressWarnings(value = { "unchecked" })

@Path("/preplane")
public class WsUser {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/users")
	public List<User> getUser(){
		return DAO.getUserDao().getList();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/user/{id}")
	public List<User> getUser(@PathParam("id") int id){
		return (List<User>) DAO.getUserDao().getUserByid(id);
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/user_s")
	public List<User> getUser(@QueryParam("status") String status){
		return (List<User>) DAO.getUserDao().getListByStatus(CrewStatus.valueOf(status));
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/user")
	public void addUser(@QueryParam("id") int id,
			@QueryParam("name") String name,
			@QueryParam("first") String firstname,
			@QueryParam("status") String status,
			@QueryParam("password") String password){
		
		User user = new User(id, name, firstname, CrewStatus.valueOf(status), password);
		DAO.getUserDao().addUser(user);
		
	}
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/user")
	public void addUser(@QueryParam("mail") String mail,
			@QueryParam("password") String pass){

		
	}
	
	
	
	

}
