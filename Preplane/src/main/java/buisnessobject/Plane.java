package buisnessobject;

import javax.jdo.annotations.PersistenceCapable;

@PersistenceCapable

public class Plane {
	private int id;
	private Airport airport;
	private String planeModel;
    private int planeCapacity;
    
    public Plane(){
    	
    }

	public Plane(int id, Airport arpt, String model, int capacity){
    	this.id = id;
    	this.airport = arpt;
    	this.planeModel = model;
    	this.planeCapacity = capacity;
    }
    
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
	public Airport getAirport() {
		return airport;
	}
	public void setAirport(Airport airport) {
		this.airport = airport;
	}
}
