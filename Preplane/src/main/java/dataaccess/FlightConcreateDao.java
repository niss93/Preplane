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
	List<Flight> listOfFlights;

	private PersistenceManagerFactory pmf = JDOHelper.getPersistenceManagerFactory("datanucleus.properties");

	public FlightConcreateDao(PersistenceManagerFactory pmf) {
		this.pmf = pmf;
	}

	public DocFlavor[] getUnsupportedFlavors() {
		// TODO Auto-generated method stub
		return null;
	}

	public FlightConcreateDao() {

	}

	public List<Flight> getFlight() {

		// PersistenceManagerFactory pmf =
		// JDOHelper.getPersistenceManagerFactory("datanucleus.properties");
		PersistenceManager pm = pmf.getPersistenceManager();
		Transaction tx = pm.currentTransaction();

		try {
			tx.begin();
			Query q = pm.newQuery(Flight.class);
			q.setFilter("1 == indice");
			q.declareParameters("int indice");
			// List<Flight> results = (List<Flight>) q.execute(1);
			Flight res = (Flight) q.execute(1);
			List<Flight> results = new ArrayList<Flight>();
			results.add(res);
			tx.commit();
			return results;
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

}
