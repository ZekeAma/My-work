package labels;

public class LabelApp {

	public static void main(String[] args) {
		Adresss address1 = new Adresss("1133 fremont ave", "salt lake city", "utah", 84104);
		System.out.println("address1: " + address1.getStreet() + " " + address1.getCity()+ " " + address1.getState());
		Adresss address2 = new Adresss("1144 fremont ave", "salt lake city", "utah", 84104);
		System.out.println("address2: " + address2);
		System.out.println();
		
		AddressLabel addressLabel = new AddressLabel("ZEKE", "AMA" , address1);
		System.out.println("addresslabel: " + addressLabel);
		System.out.println();
		
		addressLabel.printLabel();
	}

}
