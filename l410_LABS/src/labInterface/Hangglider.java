package labInterface;


public class Hangglider implements Flyable
{
	private final boolean isRigidWing;
        
	public Hangglider(boolean rigidWing)
	{
		isRigidWing = rigidWing;
	}

	@Override
	public String toString()
	{
		return String.format(isRigidWing ? "Rigid-wing" : "Flex-wing");
	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		System.out.println("Gliding to");
		System.out.println();
		
	}

	@Override
	public void launch() {
		// TODO Auto-generated method stub
		System.out.println("Runing until take-off");
		System.out.println();
	}
}
