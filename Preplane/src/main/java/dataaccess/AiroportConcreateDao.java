

package dataaccess;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;

import javax.jdo.Extent;
import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.jdo.Query;
import javax.jdo.Transaction;

import buisnessobject.Airport;

public class AiroportConcreateDao {
	
	public AiroportConcreateDao(PersistenceManagerFactory pmf) {
		// this.pmf = pmf;
	}
	
	public void addAirport(Airport airport) {
		// TODO Auto-generated method stub
		PersistenceManagerFactory pmf = JDOHelper.getPersistenceManagerFactory("datanucleus.properties");
		PersistenceManager pm = pmf.getPersistenceManager();		
		Transaction tx = pm.currentTransaction();

		try {
			tx.begin();

			pm.makePersistent(airport);

			tx.commit();
		} finally {
			if (tx.isActive()) {
				tx.rollback();
			}
			pm.close();
		}

	}
	
	

}
