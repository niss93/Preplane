package buisnessobject;

public class Airport {
	private String codeOACI;
    private String country;
    private String city;
    
    public Airport(String OACI,String country,String city){
    	this.setCodeOACI(OACI);
    	this.country=country;
    	this.city=city;
    	System.out.println("haha");
    }

	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getCodeOACI() {
		return codeOACI;
	}

	public void setCodeOACI(String codeOACI) {
		this.codeOACI = codeOACI;
	}
}

