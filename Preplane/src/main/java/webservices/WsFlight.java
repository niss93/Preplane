package webservices;

import java.util.Date;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import buisnessobject.Airport;
import buisnessobject.Crew;
import buisnessobject.CrewStatus;
import buisnessobject.Flight;
import buisnessobject.FlightStatus;
import buisnessobject.Plane;
import buisnessobject.User;
import buisnessobject.ValidationTicket;
import dataaccess.DAO;
import dataaccess.FlightConcreateDao;
import parsers.DateParser;

@Path("/preplane")
public class WsFlight {
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/flight")
	//Renvoie tout les vols dans la base de données
	public List<Flight> getFlight(){
		return DAO.getFlightDao().getFlight();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/flight/{atc}")
	public Flight getFlightByAtc(@PathParam("atc") String atc){
		return DAO.getFlightDao().getFlightAtc(atc);
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/flight_n")
	public Flight getFlightByNotam(@QueryParam("notam") String notam){
		return DAO.getFlightDao().getFlightAtc(notam);
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/flight_s")
	public Flight getFlightByStatus(@QueryParam("status") String notam){
		return DAO.getFlightDao().getFlightAtc(notam);
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/flight_a")
	public ValidationTicket addFlight(@QueryParam("departure") String departure,
			@QueryParam("arrival") String arrival,
			@QueryParam("ddate") String ddate,
			@QueryParam("comno") String comno,
			@QueryParam("atc") String atc,
			@QueryParam("status") String status, @QueryParam("crew") String crewName,@QueryParam("arrivdate") String adate,
			@QueryParam("plane")int idPlane){
		Crew crew = DAO.getCrewDao().getCrew(crewName);
		Plane plane=DAO.getPlaneDao().getPlane(idPlane);
		Flight flight = new Flight(ddate,adate,arrival,departure,comno,atc,FlightStatus.valueOf(status),crew, plane);
		DAO.getFlightDao().addFlight(flight);
		return new ValidationTicket(true);
		}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/flight/{dh}/{departure}/{comno}")
	public void deleteFlight(@PathParam("dh") String dh, 
			@PathParam("comno") String comno,
			@PathParam("departure") String departure){
		dh = dh.substring(1);
		System.out.println("comno :"+comno+" departure: "+departure+" dh: "+dh);
		DAO.getFlightDao().deleteFlight(dh, departure, comno);
	}
}
