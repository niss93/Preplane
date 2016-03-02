package dataaccess;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.jdo.Transaction;
import javax.print.DocFlavor;
import javax.print.FlavorException;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import buisnessobject.Airport;
import buisnessobject.CrewStatus;
import buisnessobject.Flight;
import buisnessobject.FlightStatus;
import buisnessobject.User;


public class FlightConcreateDao implements FlightDao, FlavorException {
	List<Flight> listOfFlights;
	
	private PersistenceManagerFactory pmf;

	public FlightConcreateDao(PersistenceManagerFactory pmf) {
		this.pmf = pmf;
	}
	
	public DocFlavor[] getUnsupportedFlavors() {
		// TODO Auto-generated method stub
		return null;
	}
	public FlightConcreateDao(){
		this.listOfFlights = new ArrayList<Flight>();
		this.listOfFlights.add(new Flight(new Date(),new Date(),new Airport(1,"",""),new Airport(1,"",""),"haha","hehe","ehe",FlightStatus.DELAYED));
		
	}

	public List<Flight> getFlight() {
		FlightConcreateDao dao= new FlightConcreateDao();
		return dao.listOfFlights;
	}
	

	public User getFlight(String id) {
		User user = new User(4,id,"lahiyane",CrewStatus.OCC);
		return user;
	}

	public List<Flight> getFlightAir(Airport airport) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Flight getFlightCom1(String com_number) {
		// TDO Auto-generated method stub
		return null;
	}

	public Flight getFlightAtc(String atc) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Flight getFlightNotam(String notam) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Flight> getFlightStatus(String status) {
		// TODO Auto-generated method stub
		return null;
	}
	public List<Flight> getFlight(Date date) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void addFlight(Flight flight){
		PersistenceManager pm = pmf.getPersistenceManager();
		Transaction tx = pm.currentTransaction();
		try {
			tx.begin();

			pm.makePersistent(flight);

			tx.commit();
		} finally {
			if (tx.isActive()) {
				tx.rollback();
			}
			pm.close();
		}
	}

	public Flight getFlightCom(String com_number) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
