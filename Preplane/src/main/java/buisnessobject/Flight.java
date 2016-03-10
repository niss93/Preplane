package buisnessobject;

import java.util.Date;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;

@PersistenceCapable

public class Flight {
	@Persistent
	private String departureDate;
	@Persistent
	private String arrivalDate;
	@Persistent
	private String departureAirport;
	@Persistent
	private String arrivalAirport;
	@Persistent
	private String commercialNumber;
	@Persistent
	private Crew crew;
	@Persistent
	private Plane plane;
	@Persistent
	private String atcNumber;
	@Persistent
	private String notamNumber;
	@Persistent
	private FlightStatus Status;

	public Flight() {
		//
	}

	public Flight(String ddate, String adate, String arrival, String departure, String commercial, String atc,
			FlightStatus status, Crew crew, Plane plane) {
		this.departureDate = ddate;
		this.setDepartureAirport(arrival);
		this.setArrivalAirport(departure);
		this.commercialNumber = commercial;
		this.atcNumber = atc;
		this.notamNumber = "NONE";
		this.Status = status;
		this.crew = crew;
		this.plane = plane;
		this.arrivalDate = adate;

	}

	public String toString() {
		return "Departure: " + this.departureAirport;
	}

	public String getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(String departureDate) {
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

	public Crew getCrew() {
		return this.crew;
	}

	public void setCrew(Crew crew) {
		this.crew = crew;
	}

	public String getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(String date) {
		this.arrivalDate = date;
	}

	public void setPlaneID(int planeID) {
		// TODO Auto-generated method stub
		if (plane != null)
			plane.setIdPlane(planeID);
	}
}
