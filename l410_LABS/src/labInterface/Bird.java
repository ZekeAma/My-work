package labInterface;

public class Bird implements Flyable {
	private final String type;
/**
 * method to get the type of bird
 * @param t
 */
	public Bird(String t)
	{
		type = t;
	}
	/*
	 * string toString method 
	 */

	@Override
	public String toString()
	{
		return type;
	}
	@Override
	public void land() {
		// TODO Auto-generated method stub
		System.out.println("Flapping the wings until landing");
		System.out.println();
	}
	@Override
	public void launch() {
		// TODO Auto-generated method stub
		System.out.println("Flapping the wings to take off");
		System.out.println();
	}
}
