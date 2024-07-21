package labPolymorphism;

public class DogApp
{
    public static void main(String[] args)
    {
    	
        Dog myDog = new Dog("Greyhound");
        actAsDog(myDog);

        SledDog mySledDog = new SledDog("Husky");
        actAsDog(mySledDog);

        CircusDog myCircusDog = new CircusDog("Terrier");
        actAsDog(myCircusDog);
        System.out.println("Using an Array");
        System.out.println();
        Dog[] dogs = {myDog, mySledDog, myCircusDog};
  for(Dog Doggies : dogs) {
	  System.out.println(Doggies);
    
    if(Doggies instanceof SledDog) {
    	((SledDog) Doggies).pullSled();
    }
    Doggies.communicate();
    Doggies.move();
    System.out.println();
    
    

	  
  }
    }

    private static void actAsDog(Dog d)
    {
    	System.out.println(d);
        d.communicate();
        d.move();
        System.out.println();
    }
  

}