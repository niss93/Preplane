package dataaccess;

import java.util.List;

import buisnessobject.CrewStatus;
import buisnessobject.User;
import buisnessobject.ValidationTicket;


public interface UserDao {   
	/**
	 * Get the list of user 
	 * @return
	 */
	List<User> getList();
	/**
	 * Get the list of user according to following id
	 * @param idUser
	 * @return
	 */
	List<User> getUserByid(int id);
	List<User> getUserByName(String name);

	/**
	 * 
	 * @param crewStatus
	 * @return
	 */
	List<User> getListByStatus(CrewStatus crewStatus);
	
	void addUser(User user);
	public ValidationTicket checkLogin(String login, String pass);
}
