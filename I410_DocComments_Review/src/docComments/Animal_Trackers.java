package docComments;

import java.util.ArrayList;

/**
 * The {@code Animal_Trackers} class represents an animal with a tracking device.
 * Each animal has a unique ID, a name, a type of tracker, and a color.
 */
public class Animal_Trackers {
    private String animal;
    private String tracker;
    private String color;
    private final int id;
    private static int count = 1234567;

    /**
     * Constructs a new {@code Animal_Trackers} object with the specified animal name,
     * tracker device, and color. The ID is automatically assigned and incremented.
     *
     * @param animal the name of the animal
     * @param tracker the type of tracker device
     * @param color the color of the tracker
     */
    public Animal_Trackers(String animal, String tracker, String color) {
        this.animal = animal;
        this.tracker = tracker;
        this.color = color;
        this.id = ++count;
    }

    /**
     * Returns the name of the animal.
     *
     * @return the animal name
     */
    public String getAnimal() {
        return animal;
    }

    /**
     * Sets the name of the animal.
     *
     * @param animal the animal name to set
     */
    public void setAnimal(String animal) {
        this.animal = animal;
    }

    /**
     * Returns the type of tracker device.
     *
     * @return the tracker type
     */
    public String getTracker() {
        return tracker;
    }

    /**
     * Sets the type of tracker device.
     *
     * @param tracker the tracker type to set
     */
    public void setTracker(String tracker) {
        this.tracker = tracker;
    }

    /**
     * Returns the color of the tracker.
     *
     * @return the tracker color
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the color of the tracker.
     *
     * @param color the tracker color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Returns the current count of created animals.
     *
     * @return the current animal count
     */
    public static int getCount() {
        return count;
    }

    /**
     * Sets the current count of created animals.
     *
     * @param count the animal count to set
     */
    public static void setCount(int count) {
        Animal_Trackers.count = count;
    }

    /**
     * Returns the unique ID of the animal.
     *
     * @return the animal ID
     */
    public int getId() {
        return id;
    }

    /**
     * Returns a string representation of the {@code Animal_Trackers} object,
     * including the animal name, tracker type, color, and ID.
     *
     * @return a string representation of the object
     */
    @Override
    public String toString() {
        return "Animal_Trackers [animal=" + animal + ", tracker=" + tracker + ", color=" + color + ", id=" + id + "]";
    }
}
