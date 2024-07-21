package phones;

/**
 * The DeskPhone class represents a desk phone that extends the Phone class.
 * It provides methods to plug in and unplug the phone, as well as to check its connection status.
 */
public class DeskPhone extends Phone {
    private boolean connected;
    private Voltage voltage;

    /**
     * Constructs a new DeskPhone with the specified model, dimensions, and voltage.
     *
     * @param model the model of the desk phone
     * @param dimension the dimensions of the desk phone
     * @param voltage the voltage requirement for the desk phone
     */
    protected DeskPhone(String model, Dimension dimension, Voltage voltage) {
        super(model, dimension);
        this.voltage = voltage;
        this.connected = false;
    }

    /**
     * Plugs in the phone, setting its connection status to true.
     */
    public void PlugIn() {
        connected = true;
    }

    /**
     * Unplugs the phone, setting its connection status to false.
     */
    public void unPlug() {
        connected = false;
    }

    /**
     * Checks if the phone is connected.
     *
     * @return true if the phone is connected, false otherwise
     */
    public boolean isConnected() {
        return connected;
    }

    /**
     * Returns a string representation of the DeskPhone object, including its model,
     * dimensions, voltage, and connection status.
     *
     * @return a string representation of the DeskPhone object
     */
    @Override
    public String toString() {
        String connectionInfo = connected ? "connected" : "not connected";
        return super.model + " " + super.dimension + " " + voltage + " " + connectionInfo;
    }
}
