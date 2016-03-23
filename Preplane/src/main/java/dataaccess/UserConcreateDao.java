package dataaccess;

import java.util.ArrayList;
import java.util.List;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.jdo.Query;
import javax.jdo.Transaction;

import buisnessobject.CrewStatus;
import buisnessobject.User;
import buisnessobject.ValidationTicket;

public class UserConcreateDao implements UserDao {

	// private PersistenceManagerFactory pmf =
	// JDOHelper.getPersistenceManagerFactory("datanucleus.properties");

	public UserConcreateDao(PersistenceManagerFactory pmf) {
	}

	public UserConcreateDao() {

	}

	public List<User> getList() {

		return null;
	}

	public void addUser(User user) {
		// PersistenceManagerFactory pmf =
		// JDOHelper.getPersistenceManagerFactory("datanucleus.properties");
		PersistenceManagerFactory pmf = JDOHelper.getPersistenceManagerFactory("datanucleus.properties");
		PersistenceManager pm = pmf.getPersistenceManager();
		Transaction tx = pm.currentTransaction();
		try {
			tx.begin();

			pm.makePersistent(user);

			tx.commit();
		} finally {
			if (tx.isActive()) {
				tx.rollback();
			}
			pm.close();
		}
		System.out.println("User added with success");
	}

	public User getListByid(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> getListByStatus(CrewStatus status) {

		List<User> actions = new ArrayList<User>();

		List<User> detached = new ArrayList<User>();

		// PersistenceManagerFactory pmf =
		// JDOHelper.getPersistenceManagerFactory("datanucleus.properties");
		PersistenceManagerFactory pmf = JDOHelper.getPersistenceManagerFactory("datanucleus.properties");
		PersistenceManager pm = pmf.getPersistenceManager();
		Transaction tx = pm.currentTransaction();

		try {
			tx.begin();
			Query q = pm.newQuery(User.class);
			q.declareParameters("String status");
			q.setFilter("crewstatus == status");
			actions.add((User) q.execute(status));
			// actions = (List<User>) q.execute(status);
			detached = (List<User>) pm.detachCopyAll(actions);

			tx.commit();
		} finally {
			if (tx.isActive()) {
				tx.rollback();
			}
			pm.close();
		}
		return detached;
	}

	// @SuppressWarnings("unchecked")

	public List<User> getUserByid(int id) {
		List<User> actions = new ArrayList<User>();
		List<User> detached = new ArrayList<User>();
		// PersistenceManagerFactory pmf =
		// JDOHelper.getPersistenceManagerFactory("datanucleus.properties");
		PersistenceManagerFactory pmf = JDOHelper.getPersistenceManagerFactory("datanucleus.properties");
		PersistenceManager pm = pmf.getPersistenceManager();
		Transaction tx = pm.currentTransaction();
		try {
			tx.begin();
			Query q = pm.newQuery(User.class);
			q.declareParameters("int id1");
			q.setFilter("id1 == id");
			actions.add((User) q.execute(id));
			// actions = (List<User>) q.execute(id);
			detached = (List<User>) pm.detachCopyAll(actions);

			tx.commit();
		} finally {
			if (tx.isActive()) {
				tx.rollback();
			}
			pm.close();
		}
		return detached;
	}

	public ValidationTicket checkLogin(String login, String pass) {
		List<User> list = this.getUserByName(login);
		User user = list.get(0);
		System.out.println(user);
		if (user.getPassword().equals(pass))
			return new ValidationTicket(true);
		return new ValidationTicket(false);
	}

	public List<User> getUserByName(String name) {
		List<User> users = new ArrayList<User>();
		List<User> detached = new ArrayList<User>();
		// PersistenceManagerFactory pmf =
		// JDOHelper.getPersistenceManagerFactory("datanucleus.properties");
		PersistenceManagerFactory pmf = JDOHelper.getPersistenceManagerFactory("datanucleus.properties");
		PersistenceManager pm = pmf.getPersistenceManager();
		Transaction tx = pm.currentTransaction();
		try {
			tx.begin();
			Query q = pm.newQuery(User.class);
			q.declareParameters("String firstname");
			q.setFilter("firstname == name");
			users.add((User) q.execute(name));
			// users = (List<User>) q.execute(name);
			detached = (List<User>) pm.detachCopyAll(users);

			tx.commit();
		} finally {
			if (tx.isActive()) {
				tx.rollback();
			}
			pm.close();
		}
		return detached;
	}

}
