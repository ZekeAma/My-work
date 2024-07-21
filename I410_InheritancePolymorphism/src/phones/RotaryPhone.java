package phones;

/**
 * The RotaryPhone class models a desk phone equipped with a rotary dial.
 * It extends the DeskPhone class and implements a specific method for dialing
 * a number using the rotary dial mechanism.
 */
public class RotaryPhone extends DeskPhone {

    /**
     * Constructs a RotaryPhone with the given model, dimensions, and voltage.
     *
     * @param model the model name of the rotary phone
     * @param dimension the physical dimensions of the rotary phone
     * @param voltage the voltage requirement for the rotary phone
     */
    protected RotaryPhone(String model, Dimension dimension, Voltage voltage) {
        super(model, dimension, voltage);
    }

    /**
     * Simulates dialing a number by rotating the dial to initiate the call.
     *
     * @param number the phone number to dial
     * @return a message indicating that the number is being dialed using the rotary dial
     */
    @Override
    public String Call(long number) {
        return "Rotating the dial to call " + number + ".";
    }
}
