package phones;

/**
 * The Dimension class represents the physical dimensions of a phone, 
 * including its height, width, and depth.
 */
public class Dimension {
    private double height;
    private double width;
    private double depth;

    /**
     * Constructs a Dimension object with the specified height, width, and depth.
     *
     * @param height the height of the dimension
     * @param width the width of the dimension
     * @param depth the depth of the dimension
     * @throws IllegalArgumentException if any of the dimensions are less than or equal to zero
     */
    public Dimension(double height, double width, double depth) {
        if (width <= 0 || height <= 0 || depth <= 0) {
            throw new IllegalArgumentException("The height, width, and depth of a dimension needs to be positive.");
        }
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    /**
     * Gets the height of the dimension.
     *
     * @return the height of the dimension
     */
    public double getHeight() {
        return height;
    }

    /**
     * Gets the width of the dimension.
     *
     * @return the width of the dimension
     */
    public double getWidth() {
        return width;
    }

    /**
     * Gets the depth of the dimension.
     *
     * @return the depth of the dimension
     */
    public double getDepth() {
        return depth;
    }

    /**
     * Returns a string representation of the Dimension object.
     * The format is (height x width x depth) with the height and depth rounded to one decimal place.
     *
     * @return a string representation of the Dimension object
     */
    @Override
    public String toString() {
        return "(" + Math.round(height * 10.0) / 10.0 + " x " + width + " x " + Math.round(depth * 10.0) / 10.0 + ")";
    }
}
