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
import buisnessobject.CrewStatus;
import buisnessobject.Flight;
import buisnessobject.FlightStatus;
import buisnessobject.User;
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
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/flight")
	public void addFlight(@QueryParam("depart") String departure,
			@QueryParam("arriv") String arrival,
			@QueryParam("date") String date,
			@QueryParam("notam") String notam,
			@QueryParam("atc") String atc,
			@QueryParam("status") String status, @QueryParam("status") String crew){
		
		Flight flight = new Flight(date, arrival, departure,
				"test commercial", atc, notam, FlightStatus.valueOf(status), crew);
		DAO.getFlightDao().addFlight(flight);
		
		}
	
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/flight/{atc}")
	public void deleteFlight(@PathParam("atc") String atc){
		DAO.getFlightDao().deleteFlight(atc);
	}
}
