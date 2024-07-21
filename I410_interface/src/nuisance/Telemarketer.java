package nuisance;

public class Telemarketer extends Person implements Nuisance{

	public Telemarketer(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	 @Override
	    public String annoy() {
	        return getName() + " annoys by giving a sales pitch";
	    }
   public String giveSalePitch() {
	   return getName() + " preasures other to buy stuff";
   }
}
