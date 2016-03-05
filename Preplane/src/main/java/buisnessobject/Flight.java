package buisnessobject;
import java.util.Date;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable

public class Flight {
	@Persistent
	private Date departureDate;
	@Persistent
    private String departureAirport;
	@Persistent
    private String arrivalAirport;
	@Persistent
    private String commercialNumber;
	@Persistent
	private String crew;
	@Persistent
    private String atcNumber;
	@Persistent
    private String notamNumber;
	@Persistent
    private FlightStatus Status;
	
    
    public Flight(Date departure, String arriv, String depart, String commercial, 
    		String atc, String notam, FlightStatus status, String crew){
    	this.departureDate=departure;
    	this.setDepartureAirport(arriv);
    	this.setArrivalAirport(depart);
    	this.commercialNumber=commercial;
    	this.atcNumber=atc;
    	this.notamNumber=notam;
    	this.Status=status;
    	this.crew = crew;
    	
    }
    public String toString(){
    	return "Departure: "+this.departureAirport;
    }
	public Date getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
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
	
	public String getDepartureAirport() {
		return departureAirport;
	}
	public void setDepartureAirport(String departureAirport) {
		this.departureAirport = departureAirport;
	}
	public String getArrivalAirport() {
		return arrivalAirport;
	}
	public void setArrivalAirport(String arrivalAirport) {
		this.arrivalAirport = arrivalAirport;
	}
}
