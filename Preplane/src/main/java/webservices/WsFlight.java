package webservices;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import buisnessobject.Flight;
import dataaccess.DAO;
import dataaccess.FlightConcreateDao;

@Path("/preplane")
public class WsFlight {
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/flight")
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
	
}
