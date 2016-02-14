import java.util.List;

public interface UserDao {
	 // JDBC driver name and database URL
	   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost/preplane";

	   //  Database credentials
	   static final String USER = "root";
	   static final String PASS = "amablk";
	   
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
	List<User> getList(int idUser);
	/**
	 * Get the list of user according to following name
	 * @param Name
	 * @return
	 */
	List<User> getListName(String Name);
	/**
	 * Get the list of user according to following first name 
	 * @param firstname
	 * @return
	 */
	List<User> getListfirst(String firstname);
	/**
	 * Get the list of user according to following age
	 * @param age
	 * @return
	 */
	List<User> getLisage(int age);
	
}
