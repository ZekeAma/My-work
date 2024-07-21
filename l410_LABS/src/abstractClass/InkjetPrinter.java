package abstractClass;

public class InkjetPrinter extends Printer {
	private int remainingCartridge;

	public InkjetPrinter(String model) {
		super(model);
		this.remainingCartridge  = 100;
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the remainingCartridge
	 */
	public int getRemainingCartridge() {
		return remainingCartridge;
	}
	public void refillCartridge() {
		remainingCartridge = 100;
	}
	public void print() {
		System.out.println("The cartridge is empty");
		
		if(remainingCartridge > 0) {
			this.remainingCartridge = remainingCartridge - 10;
			System.out.println(super.toString() + "Remaining Cartridge : " + remainingCartridge);
		}
		
	}

}
