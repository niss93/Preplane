package dataaccess;


public class DAO {
	public static UserDao getUserDao(){
		return new UserConcreateDao(null);
		
	}
	public static FlightDao getFlightDao(){
		return new FlightConcreateDao();
		
	}
	public static PlaneDao getPlaneDao(){
		return new PlaneConcreateDao(null);
		
	}
	public static CrewDao getCrewDao(){
		return new CrewConcreateDao(null);
		
	}

}
