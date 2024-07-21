package labPolymorphism;

/**
 * Represents a dog with a specific breed.
 */
public class Dog
{
    private final String breed;

    /**
     * Constructs a new Dog object with the given breed.
     *
     * @param b The breed of the dog.
     */
    public Dog(String b)
    {
        breed = b;
    }

    /**
     * Makes the dog communicate by printing "bark bark".
     */
    public void communicate()
    {
        System.out.println("bark bark");
    }

    /**
     * Makes the dog move by printing "run".
     */
    public void move()
    {
        System.out.println("run");
    }

    /**
     * Gets the breed of the dog.
     *
     * @return The breed of the dog.
     */
    public String getBreed()
    {
        return breed;
    }
    /**
     * Returns the class and dog breed
     * 
     */
    @Override
    public String toString() {
    	return this.getClass().getSimpleName() + ": " + getBreed();
    }
}
