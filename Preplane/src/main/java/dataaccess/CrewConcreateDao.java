package dataaccess;

import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.jdo.Transaction;

import buisnessobject.Crew;
import buisnessobject.Flight;


public class CrewConcreateDao implements CrewDao {

	private PersistenceManagerFactory pmf;

	public CrewConcreateDao(PersistenceManagerFactory pmf) {
		this.pmf = pmf;
	}
	public List<Crew> getCrewList() {
		// TODO Auto-gevc cnerated method stub
		return null;
	}

	public Crew getCrewList(String atc) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void addCrew(Crew crewh){
		PersistenceManager pm = pmf.getPersistenceManager();
		Transaction tx = pm.currentTransaction();
		try {
			tx.begin();

			pm.makePersistent(crewh);

			tx.commit();
		} finally {
			if (tx.isActive()) {
				tx.rollback();
			}
			pm.close();
		}
	}

}
