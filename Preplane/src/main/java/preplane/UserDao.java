package preplane;
import java.util.List;

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
	User getList(int id);
	/**
	 * Get the list of user according to following name
	 * @param Name
	 * @return
	 */
	User getListName(String Name);
	/**
	 * Get the list of user according to following first name 
	 * @param firstname
	 * @return
	 */
	User getListfirst(String firstname);
	
}
