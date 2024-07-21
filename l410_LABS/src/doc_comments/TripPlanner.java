package doc_comments;

/**
 * The TripPlanner class represents a trip, including departure and arrival locations,
 * distance, and the car used for the trip.
 * 
 * @author Ezequiel Amaral
 */
public class TripPlanner {
    private String departure;
    private String arrival;
    private int distance;
    private Car car;

    /**
     * Constructs a new TripPlanner object with the specified departure location, 
     * arrival location, distance, and car.
     * 
     * @param departure the departure location of the trip
     * @param arrival the arrival location of the trip
     * @param distance the distance of the trip in miles
     * @param car the car used for the trip
     */
    public TripPlanner(String departure, String arrival, int distance, Car car) {
        this.departure = departure;
        this.arrival = arrival;
        this.distance = distance;
        this.car = car;
    }

    /**
     * Returns a string representation of the TripPlanner object, including 
     * departure location, arrival location, distance, and car model.
     * 
     * @return a string representation of the TripPlanner object
     */
    @Override
    public String toString() {
        return "TripPlanner [departure=" + departure + ", arrival=" + arrival + ", distance=" + distance + ", car=" + car.getModel() + "]";
    }

    /**
     * Calculates the fuel consumption for the given distance and car.
     * 
     * @param distance the distance of the trip in miles
     * @param car the car used for the trip
     * @return the fuel consumption in gallons
     */
    public double fuelConsumption(int distance, Car car) {
        double fuel = (double) distance / car.getMpg();
        return fuel;
    }
}
