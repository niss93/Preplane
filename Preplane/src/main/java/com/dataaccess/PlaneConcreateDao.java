package com.dataaccess;


import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.jdo.Transaction;

import com.buisnessobject.Plane;

public class PlaneConcreateDao implements PlaneDao  {

	private PersistenceManagerFactory pmf;

	public PlaneConcreateDao(PersistenceManagerFactory pmf) {
		this.pmf = pmf;
	}
	
	public List<Plane> getPlanes() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Plane> getPlanes(String idplane) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Plane> getPlanesCapa(int Capacity) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void addPlane(Plane plane){
		PersistenceManager pm = pmf.getPersistenceManager();
		Transaction tx = pm.currentTransaction();
		try {
			tx.begin();

			pm.makePersistent(plane);

			tx.commit();
		} finally {
			if (tx.isActive()) {
				tx.rollback();
			}
			pm.close();
		}
	}

}
