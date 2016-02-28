package com.webservices;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.buisnessobject.Flight;
import com.dataaccess.DAO;
import com.dataaccess.FlightConcreateDao;

@Path("/preplane")
public class WebServicesFlight {
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/flight")
	public List<Flight> getFlight(){
		FlightConcreateDao daoFlight = (FlightConcreateDao) DAO.getFlightDao();
		return daoFlight.getFlight();
	}
	

}
