package labels;
/**
 * US address that is not a PO box.
 * 
 * 
 * @author Ezequiel Amaral 
 */
public class Adresss {

	private String street;
	private String city;
	private String state;
	private int zip;
	
	/**
	 * @param street street address
	 * @param city 
	 * @param state Us State
	 * @param zip 5-digit zip code
	 */
	public Adresss(String street, String city, String state, int zip) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	/**
	 * Returns the street address.
	 * @return the street 
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * returns the city or town
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Returns the 2 letter abbreviation US state 
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * returns the 5 digit zip code
	 * @return the zip
	 */
	public int getZip() {
		return zip;
	}
	
	
}
