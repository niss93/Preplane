import java.sql.SQLException;

public class DaoTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		userDao dao = new userDao();
		System.out.println(dao.getList());

	}

}
