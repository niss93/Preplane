package dataaccess;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManagerFactory;

public final class SingletonPmf {
	public final static PersistenceManagerFactory pmf = JDOHelper.getPersistenceManagerFactory("datanucleus.properties");

	private SingletonPmf() {
		
	}

	// public static PersistenceManagerFactory getPmf() {
	// if (pmf == null)
	// return (PersistenceManagerFactory) new SingletonPmf();
	// return pmf;
	// }

}
