package labels;
/*
 * Represents an address label that includes the first and las name
 * of the addresses and his/her address
 * 
 * @author Ezequiel Amaral 
 */
public class AddressLabel {
	private String firstName;
	private String lastName;
	private Adresss address;

	/**
	 * @param firstName
	 * @param lastName
	 * @param address
	 */
	public AddressLabel(String firstName, String lastName, Adresss address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}
	/*
	 * Prints an address label in the following format: </br>
	 * {firstName} {lastName}</br>
	 * {address}</br>
	 * {city},{state}, {Zip} </br>
	 */
	public void printLabel() {
		System.out.printf("#s %s%n", firstName, lastName);
		System.out.println(address.getStreet());
		System.out.printf("%s, %s %d%n", address.getCity(), address.getState(), address.getZip());
	}

	@Override
	public String toString() {
		return "AddressLabel [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + "]";
	}


}
