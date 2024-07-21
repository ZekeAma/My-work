package labInterface;
import java.util.ArrayList;

public class App
{

	/**
	 * @param args
	 * initializes 4 instances of objects
	 * 
	 */
	public static void main(String[] args)
	{
		Plane myPlane = new Plane(4, "Boing 747");
		System.out.printf("myPlane: %s%n", myPlane);

		Hangglider myHangglider = new Hangglider(true);
		System.out.printf("myHangglider: %s%n", myHangglider);

		Bird myBird = new Bird("Swallow");
		System.out.printf("myBird: %s%n", myBird);
		ArrayList<Flyable> list = new ArrayList<Flyable>();
		
		list.add(myPlane);
		list.add(myHangglider);
		list.add(myBird);
		
		for(Flyable fly: list) {
      fly.land();
      fly.launch();
    
		}
	}
   
	
}
