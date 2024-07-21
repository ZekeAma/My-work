package phones;

/**
 * The PushButtonPhone class represents a desk phone with push buttons.
 * It extends the DeskPhone class and provides a specific implementation
 * for dialing a number using push buttons.
 */
public class PushButtonPhone extends DeskPhone {

    /**
     * Constructs a new PushButtonPhone with the specified model, dimensions, and voltage.
     *
     * @param model the model of the push button phone
     * @param dimension the dimensions of the push button phone
     * @param voltage the voltage requirement for the push button phone
     */
    protected PushButtonPhone(String model, Dimension dimension, Voltage voltage) {
        super(model, dimension, voltage);
    }

    /**
     * Simulates dialing a number by pressing buttons to call the given phone number.
     *
     * @param number the phone number to call
     * @return a string indicating that the number is being dialed using push buttons
     */
    @Override
    public String Call(long number) {
        return "Pushing buttons to call " + number + ".";
    }
}
