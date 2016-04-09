package dataaccess;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.jdo.Query;
import javax.jdo.Transaction;
import javax.print.DocFlavor;
import javax.print.FlavorException;

import buisnessobject.Airport;
import buisnessobject.Flight;

public class FlightConcreateDao implements FlightDao, FlavorException {

	public FlightConcreateDao(PersistenceManagerFactory pmf) {
		// this.pmf = pmf;
	}

	public DocFlavor[] getUnsupportedFlavors() {
		// TODO Auto-generated method stub
		return null;
	}

	public FlightConcreateDao() {

	}

	public List<Flight> getFlight() {

		PersistenceManagerFactory pmf = JDOHelper.getPersistenceManagerFactory("datanucleus.properties");
		PersistenceManager pm = pmf.getPersistenceManager();
		Transaction tx = pm.currentTransaction();
		List<Flight> flights = new ArrayList<Flight>();
		List<Flight> detached = new ArrayList<Flight>();


		try {
			tx.begin();
			Query q = pm.newQuery(Flight.class);
			q.setFilter("1 == 1");
			List<Flight> results = new ArrayList<Flight>();
			flights = (List<Flight>) q.execute(1);
			detached = (List<Flight>) pm.detachCopyAll(flights);
			tx.commit();
			return detached;
		} finally {
			if (tx.isActive()) {
				tx.rollback();
			}
			pm.close();
		}

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

		PersistenceManagerFactory pmf = JDOHelper.getPersistenceManagerFactory("datanucleus.properties");
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

	public void addListOfFlight(List<Flight> flights) {
		PersistenceManagerFactory pmf = JDOHelper.getPersistenceManagerFactory("datanucleus.properties");
		PersistenceManager pm = pmf.getPersistenceManager();
		Transaction tx = pm.currentTransaction();
		try {
			tx.begin();
			// Make persistent for all the the Flight objects of the list
			for (Flight flight : flights) {
				pm.makePersistent(flight);
			}

			tx.commit();
		} finally {
			if (tx.isActive()) {
				tx.rollback();
			}
			pm.close();
		}
	}

	public void deleteFlight(String dh, String departure, String comno) {
		DbSos.deleteFlight(dh, departure, comno);
	}

	public void updateFlight(String commercialNumber,String atcNumber ,String notamNumber ,String departureDate,String arrivalDate,String arrivalAirport,String departureAirport){
		// TODO Auto-generated method stub
		PersistenceManagerFactory pmf = JDOHelper.getPersistenceManagerFactory("datanucleus.properties");
		PersistenceManager pm = pmf.getPersistenceManager();
		Transaction tx = pm.currentTransaction();
				
				try
				{
				    tx.begin();

				    Query q = pm.newQuery(Flight.class);
					q.declareParameters("String numcom");
					q.setFilter("commercialNumber == numcom");

					Flight f = (Flight) q.execute(commercialNumber);
			        f.setNotamNumber ( notamNumber ); 
			        f.setAtcNumber ( atcNumber  ); 
			        f.setDepartureAirport(departureAirport);
			        f.setArrivalAirport(arrivalAirport);
			        f.setDepartureDate(departureDate);
			        f.setArrivalDate(arrivalDate);

				    tx.commit();
				}
				finally
				{
				    if (tx.isActive())
				    {
				        tx.rollback();
				    }
				    pm.close();
				}
				
			
			}
	
}

