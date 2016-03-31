import dataaccess.DAO;

public class Principale {

	public static void main(String[] args) {
		System.out.println(DAO.getFlightDao().getFlight());
	}
	

}
