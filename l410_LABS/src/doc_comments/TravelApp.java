package doc_comments;

public class TravelApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car m4 = new Car("BMW", "M4", 25);
		Car Civic = new Car("Honda", "Civic", 42);
		System.out.println("Cars: ");
		System.out.println( m4.getMake() + 
				" " + m4.getModel() + " " + m4.getMpg());
		System.out.println(Civic.getMake() + " "  +
				Civic.getModel() + " " + Civic.getMpg());
		System.out.println();
		TripPlanner CaliTrip = new TripPlanner("Sf", "LA", 382, m4);
		TripPlanner TampaTrip = new TripPlanner("Tampa", "Miami", 280, Civic);
		System.out.println("California Trip");
		System.out.println("TripPlanner "+CaliTrip);
		System.out.printf("fuel consumption: %.1f " , CaliTrip.fuelConsumption(382, m4));
		System.out.println();
		System.out.println();
		
		System.out.println("Florida Trip");
		System.out.println(TampaTrip);
		System.out.printf("fuel cosnumption: %.1f ", TampaTrip.fuelConsumption(280, Civic));
	}

}
