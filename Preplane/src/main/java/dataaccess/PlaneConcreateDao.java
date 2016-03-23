package dataaccess;

import java.util.List;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.jdo.Transaction;
import javax.jdo.annotations.Query;

import buisnessobject.Plane;

public class PlaneConcreateDao implements PlaneDao {

	// private PersistenceManagerFactory pmf =
	// JDOHelper.getPersistenceManagerFactory("datanucleus.properties");;

	public PlaneConcreateDao(PersistenceManagerFactory pmf) {
		// this.pmf = pmf;
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

	public void addPlane(Plane plane) {
		PersistenceManagerFactory pmf = JDOHelper.getPersistenceManagerFactory("datanucleus.properties");
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

	public void delete(Plane plane) {
		// TODO Auto-generated method stub
		PersistenceManagerFactory pmf = JDOHelper.getPersistenceManagerFactory("datanucleus.properties");
		PersistenceManager pm = pmf.getPersistenceManager();
		Transaction tx = pm.currentTransaction();
		try {
			tx = pm.currentTransaction();
			tx.begin();

			pm.deletePersistent(plane);

			tx.commit();
		} finally {

			if (tx.isActive()) {
				tx.rollback();
			}
			pm.close();
		}

	}

	public void update(int id, String planeModel, int planeCapacity) {
		// TODO Auto-generated method stub

		PersistenceManagerFactory pmf = JDOHelper.getPersistenceManagerFactory("datanucleus.properties");
		PersistenceManager pm = pmf.getPersistenceManager();
		Transaction tx = pm.currentTransaction();

		try {
			tx.begin();

			// Plane p = getPlanes(id);
			Query q = (Query) pm.newQuery(Plane.class);
			((javax.jdo.Query) q).declareParameters("int idPlane");
			((javax.jdo.Query) q).setFilter("id == idPlane");

			Plane p = (Plane) ((javax.jdo.Query) q).execute(id);
			p.setPlaneModel(planeModel);
			p.setPlaneCapacity(planeCapacity);

			tx.commit();
		} finally {
			if (tx.isActive()) {
				tx.rollback();
			}
			pm.close();
		}

	}

	public Plane getPlane(int idPlane) {
		// TODO Auto-generated method stub
		return null;
	}

}
