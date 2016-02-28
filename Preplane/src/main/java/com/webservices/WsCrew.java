package com.webservices;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.buisnessobject.Crew;
import com.buisnessobject.CrewStatus;
import com.buisnessobject.User;
import com.dataaccess.DAO;

public class WsCrew {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/crew")
	public List<Crew> getUser(){
		return DAO.getCrewDao().getCrewList();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/crew/{atc}")
	public Crew getCrewByFlight(@PathParam("atc") String atc){
		return DAO.getCrewDao().getCrewList(atc);
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/crew")
	public void addUser(){

	}

}
