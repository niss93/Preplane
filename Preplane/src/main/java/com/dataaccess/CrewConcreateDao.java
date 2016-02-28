package com.dataaccess;

import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.jdo.Transaction;

import com.buisnessobject.Crew;
import com.buisnessobject.Flight;


public class CrewConcreateDao implements CrewDao {

	private PersistenceManagerFactory pmf;

	public CrewConcreateDao(PersistenceManagerFactory pmf) {
		this.pmf = pmf;
	}
	public List<Crew> getCrewList() {
		// TODO Auto-generated method stub
		return null;
	}

	public Crew getCrewList(Flight flight) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void addCrew(Crew crew){
		PersistenceManager pm = pmf.getPersistenceManager();
		Transaction tx = pm.currentTransaction();
		try {
			tx.begin();

			pm.makePersistent(crew);

			tx.commit();
		} finally {
			if (tx.isActive()) {
				tx.rollback();
			}
			pm.close();
		}
	}

}
