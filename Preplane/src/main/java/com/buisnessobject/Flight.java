package com.buisnessobject;
import java.util.Date;

import javax.jdo.annotations.PersistenceCapable;
@PersistenceCapable
public class Flight {
	private Date departureDate;
    private Date arrivalDate;
    private Airport departureAirport;
    private Airport arrivalAirport;
    private String commercialNumber;
    private String atcNumber;
    private String notamNumber;
    private FlightStatus Status;
    
    public Flight(Date departure, Date arrival, Airport arriv, Airport depart, String commercial, String atc, String notam, FlightStatus status){
    	this.departureDate=departure;
    	this.arrivalDate=arrival;
    	this.departureAirport=arriv;
    	this.arrivalAirport=depart;
    	this.commercialNumber=commercial;
    	this.atcNumber=atc;
    	this.notamNumber=notam;
    	this.Status=status;
    	
    }
	public Date getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}
	public Date getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	public Airport getDepartureAirport() {
		return departureAirport;
	}
	public void setDepartureAirport(Airport departureAirport) {
		this.departureAirport = departureAirport;
	}
	public Airport getArrivalAirport() {
		return arrivalAirport;
	}
	public void setArrivalAirport(Airport arrivalAirport) {
		this.arrivalAirport = arrivalAirport;
	}
	public String getCommercialNumber() {
		return commercialNumber;
	}
	public void setCommercialNumber(String commercialNumber) {
		this.commercialNumber = commercialNumber;
	}
	public String getAtcNumber() {
		return atcNumber;
	}
	public void setAtcNumber(String atcNumber) {
		this.atcNumber = atcNumber;
	}
	public String getNotamNumber() {
		return notamNumber;
	}
	public void setNotamNumber(String notamNumber) {
		this.notamNumber = notamNumber;
	}
	public FlightStatus getFlightStatus() {
		return Status;
	}
	public void setFlightStatus(FlightStatus flightStatus) {
		this.Status = flightStatus;
	}
}
