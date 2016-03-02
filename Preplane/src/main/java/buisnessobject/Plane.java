package buisnessobject;

import javax.jdo.annotations.PersistenceCapable;

@PersistenceCapable

public class Plane {
	private int id;
	private String planeModel;
    private int planeCapacity;
    
	public int getIdPlane() {
		return id;
	}
	public void setIdPlane(int idPlane) {
		this.id = idPlane;
	}
	public String getPlaneModel() {
		return planeModel;
	}
	public void setPlaneModel(String planeModel) {
		this.planeModel = planeModel;
	}
	public int getPlaneCapacity() {
		return planeCapacity;
	}
	public void setPlaneCapacity(int planeCapacity) {
		this.planeCapacity = planeCapacity;
	}
}
