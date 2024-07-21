package doc_comments;

/**
 * The Car class represents a car with a specific make, model, and miles per gallon (mpg).
 * This class provides methods to retrieve the make, model, and mpg of the car.
 * 
 * @autor Ezequiel Amaral
 */
public class Car {
    private String make;
    private String model;
    private int mpg;

    /**
     * Constructs a new Car object with the specified make, model, and mpg.
     * 
     * @param make the make of the car
     * @param model the model of the car
     * @param mpg the miles per gallon (mpg) of the car
     */
    public Car(String make, String model, int mpg) {
        this.make = make;
        this.model = model;
        this.mpg = mpg;
    }

    /**
     * Returns the make of the car.
     * 
     * @return the make of the car
     */
    public String getMake() {
        return make;
    }

    /**
     * Returns the model of the car.
     * 
     * @return the model of the car
     */
    public String getModel() {
        return model;
    }

    /**
     * Returns the miles per gallon (mpg) of the car.
     * 
     * @return the mpg of the car
     */
    public int getMpg() {
        return mpg;
    }
}

