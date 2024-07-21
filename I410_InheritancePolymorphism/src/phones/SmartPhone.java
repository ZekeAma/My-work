package phones;

import java.util.Random;

/**
 * The SmartPhone class represents a smartphone with storage capability.
 * It extends the Phone class and adds functionalities for making calls,
 * browsing the web, and taking pictures. It also includes information about
 * the phone's storage.
 */
public class SmartPhone extends Phone {
    private int Storage;

    /**
     * Constructs a SmartPhone with the specified model, dimensions, and storage.
     *
     * @param model the model of the smartphone
     * @param dimension the dimensions of the smartphone
     * @param Storage the storage capacity of the smartphone in gigabytes
     * @throws IllegalArgumentException if the storage is less than or equal to zero
     */
    public SmartPhone(String model, Dimension dimension, int Storage) {
        super(model, dimension);
        if (Storage <= 0) {
            throw new IllegalArgumentException("Storage needs to be assigned a positive value.");
        }
        this.Storage = Storage;
    }

    /**
     * Simulates making a call by selecting the number.
     *
     * @param number the phone number to call
     * @return a message indicating that the number is being called
     */
    @Override
    public String Call(long number) {
        return "Calling " + number + " by selecting the number";
    }

    /**
     * Simulates browsing the web.
     *
     * @return a message indicating that the web is being browsed
     */
    public String browse() {
        return "Browsing the web";
    }

    /**
     * Simulates taking a picture with the smartphone. 
     * The picture orientation is randomly selected.
     *
     * @return a message indicating the orientation of the picture being taken
     */
    public String takePicture() {
        String[] orientations = { "taking a horizontal picture.", "taking a vertical picture." };
        Random random = new Random();
        int randomIndex = random.nextInt(orientations.length);
        return orientations[randomIndex];
    }

    /**
     * Returns a string representation of the SmartPhone object, including its model,
     * dimensions, and storage capacity.
     *
     * @return a string representation of the SmartPhone object
     */
    @Override
    public String toString() {
        return super.model + " " + super.dimension + " " + Storage + "GB";
    }
}
