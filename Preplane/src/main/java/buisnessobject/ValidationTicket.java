package buisnessobject;

public class ValidationTicket {
	
	private boolean ticket = false;
	
	public ValidationTicket(boolean value){
		this.setTicket(value) ;
	}

	public boolean isTicket() {
		return ticket;
	}

	public void setTicket(boolean ticket) {
		this.ticket = ticket;
	}

}
