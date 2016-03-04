package dataaccess;
import java.util.Date;
import java.util.List;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.jdo.Transaction;
import javax.print.DocFlavor;
import javax.print.FlavorException;


import buisnessobject.Airport;
import buisnessobject.Flight;


public class FlightConcreateDao implements FlightDao, FlavorException {
	List<Flight> listOfFlights;
	
	private PersistenceManagerFactory pmf = JDOHelper.getPersistenceManagerFactory("datanucleus.properties");;

	public FlightConcreateDao(PersistenceManagerFactory pmf) {
		this.pmf = pmf;
	}
	
	public DocFlavor[] getUnsupportedFlavors() {
		// TODO Auto-generated method stub
		return null;
	}
	public FlightConcreateDao(){
		
	}

	public List<Flight> getFlight() {
		return listOfFlights;
		
	}
	

	public Flight getFlightbyId(int id) {
		return null;
		
	}

	public List<Flight> getFlightAir(Airport airport) {
		// TODO Auto-generated method stub
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
	
	public void addFlight(Flight flight) {
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
		System.out.println("Flight added with success");
	}

	public Flight getFlightCom(String com_number) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteFlight(int id) {
		PersistenceManager pm = pmf.getPersistenceManager();
		Object obj = pm.getObjectById(id);  // Retrieves the object to delete
		pm.deletePersistent(obj);
	}

	

	

}
