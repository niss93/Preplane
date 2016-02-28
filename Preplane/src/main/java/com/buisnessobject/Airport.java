package com.buisnessobject;

import javax.jdo.annotations.PersistenceCapable;

@PersistenceCapable
public class Airport {
	private int id;
    private String country;
    private String city;
    
    public Airport(int id,String country,String city){
    	this.id=id;
    	this.country=country;
    	this.city=city;
    	
    }
	public int getIdAirport() {
		return id;
	}
	public void setIdAirport(int idAirport) {
		this.id = idAirport;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}

