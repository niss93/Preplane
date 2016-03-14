package webservices;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import buisnessobject.Crew;
import buisnessobject.CrewStatus;
import buisnessobject.User;
import buisnessobject.ValidationTicket;
import dataaccess.DAO;
@SuppressWarnings(value = { })

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
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/user_r")
	public void addUser(@QueryParam("id") int id,
			@QueryParam("username")String username,
			@QueryParam("name") String name,
			@QueryParam("first") String firstname,
			@QueryParam("crew") String crew,
			@QueryParam("status") String status,
			@QueryParam("password") String password){
		Crew myCrew = DAO.getCrewDao().getCrew(crew);
		User user = new User(id, username, name, firstname,myCrew, CrewStatus.valueOf(status), password);
		DAO.getUserDao().addUser(user);
		
	}
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/user_v/{login}/{pass}")
	public ValidationTicket validate(@PathParam("login") String login,
			@PathParam("pass") String pass){
		System.out.println("login "+login+" pass "+pass);
		return DAO.getUserDao().checkLogin(login, pass);
	}
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/user_n/{name}")
	public User validate(@PathParam("name") String name){
		return DAO.getUserDao().getUserByName(name).get(0);
	}
	
	
	
	

}
