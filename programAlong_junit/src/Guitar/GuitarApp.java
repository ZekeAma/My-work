package Guitar;

public class GuitarApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Guitars guitar1 = new Guitars(true, 6);
		Guitars guitar2 = new Guitars(false, 12);
		Guitars guitar3 = new Guitars(true, 6);
		
	Guitars[] guitars = {guitar1, guitar2, guitar3};
	for(Guitars fuigars: guitars) {
		System.out.println(fuigars.toString());
		
	}
	System.out.println();
    System.out.println("guitar1 equals guitar2: " + guitar1.equals(guitar2));
    System.out.println("guitar1 equals guitar3: " + guitar1.equals(guitar3));
    
    System.out.println(guitar1.compareTo(guitar2));
    System.out.println(guitar1.compareTo(guitar3));
	}

}
