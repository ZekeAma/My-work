package abstractClass;

public class LaserPrinter extends Printer{

private int remainingToner;


public LaserPrinter(String model) {
		super(model);
		this.remainingToner = 100;
		// TODO Auto-generated constructor stub
	}


/**
 * @return the remainingToner
 */
public int getRemainingToner() {
	return remainingToner;
}
public void refillToner() {
	 remainingToner = 100;
	
}
public void print() {
	System.out.println("The Toner is empty");
	if(remainingToner > 0) {
		this.remainingToner = remainingToner - 10;
		System.out.println(super.toString() + "remaining Toner : " + remainingToner);
		
	}
	
}


}