package preplane;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.print.DocFlavor;
import javax.print.FlavorException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/jarib")
public class FlightDataAccess implements FlightDao, FlavorException {
	List<Flight> listOfFlights;
	
	public DocFlavor[] getUnsupportedFlavors() {
		// TODO Auto-generated method stub
		return null;
	}
	public FlightDataAccess(){
		this.listOfFlights = new ArrayList<Flight>();
		this.listOfFlights.add(new Flight(new Date(),new Date(),new Airport(1,"",""),new Airport(1,"",""),"haha","hehe","ehe",FlightStatus.DELAYED));
		
	}
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/flight")
	public List<Flight> getFlight() {
		FlightDataAccess dao= new FlightDataAccess();
		return dao.listOfFlights;
	}

	public List<Flight> getFlight1(Date date) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Flight> getFlightAir(Airport airport) {
		// TODO Auto-generated method stub
		return null;
	}
	@GET
	@Produces(MediaType.TEXT_HTML)
	@Path("/flight?com={com_number}")
	public String retour(@PathParam("com_number")String com_number){
		return com_number;
	}
	public Flight getFlightCom(String com_number) {
		// TODO Auto-generated method stub
		return null;
	}

	public Flight getFlightAtc(String atc) {
		// TODO Auto-generated method stub
		return null;
	}

	public Flight getFlightNotam(String notam) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Flight> getFlightStatus(String status) {
		// TODO Auto-generated method stub
		return null;
	}
	public List<Flight> getFlight(Date date) {
		// TODO Auto-generated method stub
		return null;
	}

}
