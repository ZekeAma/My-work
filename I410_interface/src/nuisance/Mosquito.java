package nuisance;

public class Mosquito extends Insect implements Nuisance{

	public Mosquito(String species) {
		super(species);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String annoy() {
		
		return "buzz buzz buzz";
		
	}
	public String buzz() {
		return super.getSpecies() + " buzzing around";
	}

}
