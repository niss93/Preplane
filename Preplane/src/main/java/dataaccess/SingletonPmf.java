package dataaccess;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManagerFactory;

public class SingletonPmf {
	private static PersistenceManagerFactory pmf;
	
	private SingletonPmf(){
		this.pmf = JDOHelper.getPersistenceManagerFactory("datanucleus.properties");
	}
	public static PersistenceManagerFactory getPmf(){
		if(pmf == null) return (PersistenceManagerFactory) new SingletonPmf();
		return pmf;
	}
	
}
