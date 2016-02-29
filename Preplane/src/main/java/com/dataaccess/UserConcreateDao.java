package com.dataaccess;

import java.util.ArrayList;
import java.util.List;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.jdo.Query;
import javax.jdo.Transaction;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.buisnessobject.CrewStatus;
import com.buisnessobject.User;

public class UserConcreateDao implements UserDao {
	
	private PersistenceManagerFactory pmf;

	public UserConcreateDao(PersistenceManagerFactory pmf) {
	}
	public UserConcreateDao(){
		
	}
	
	public List<User> getList() {
		User user = new User(1,"atik","lahiyane",CrewStatus.OCC);
		List<User> list = new ArrayList<User>();
		list.add(user);
		return list;
	}

	public User getList(int id) {
		List<User> user = null;
		List<User> detached = new ArrayList<User>();
		PersistenceManager pm = pmf.getPersistenceManager();
		Transaction tx = pm.currentTransaction();
		try {
			tx.begin();
			Query q = pm.newQuery(User.class);
			q.declareParameters("int id");
			q.setFilter("id == id");

			user =  (List<User>) q.execute(id);
			detached =  (List<User>) pm.detachCopyAll(user);

			tx.commit();
		} finally {
			if (tx.isActive()) {
				tx.rollback();
			}
			pm.close();
		}
		return detached.get(0);
	}

	public void addUser(User user){
		PersistenceManagerFactory pmf = JDOHelper.getPersistenceManagerFactory("com");
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
		// TODO Auto-generated method stub
		return null;
	}

}
