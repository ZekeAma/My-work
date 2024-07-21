package phones;

/**
 * The abstract class Phone represents a general phone with a model and dimensions.
 * It includes a method to simulate making a call and a method to provide a string
 * representation of the phone.
 */
abstract class Phone {
    protected String model;
    protected Dimension dimension;

    /**
     * Constructs a new Phone with the specified model and dimensions.
     *
     * @param model the model of the phone
     * @param dimension the dimensions of the phone
     */
    public Phone(String model, Dimension dimension) {
        this.model = model;
        this.dimension = dimension;
    }

    /**
     * Simulates making a call to the given phone number.
     *
     * @param number the phone number to call
     * @return a string indicating that the call is being made
     */
    public String Call(long number) {
        return "Calling " + number;
    }

    /**
     * Returns a string representation of the Phone object, including its model and dimensions.
     *
     * @return a string representation of the Phone object
     */
    @Override
    public String toString() {
        return model + " " + dimension.toString();
    }
}
