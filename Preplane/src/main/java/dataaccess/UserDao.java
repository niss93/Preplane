package dataaccess;

import java.util.List;

import buisnessobject.CrewStatus;
import buisnessobject.User;


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
	User getListByid(int id);
	/**
	 * 
	 * @param status
	 * @return
	 */
	List<User> getListByStatus(CrewStatus status);
	
	void addUser(User user);
}
