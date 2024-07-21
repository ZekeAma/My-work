package cutter;
/**
 * ElectricPruning shares are a variation of pruningShears 
 * the difference is they are electric
 * also stating the power boolean
 * 
 */

public class ElectricPruningShears extends PruningShares {
	private boolean power;
	/**
	 *  Initializing the constructor for size
	 * @param size
	 */
	

public ElectricPruningShears(int size) {
		super(size);
		// TODO Auto-generated constructor stub
	}
/**
 * this returns if the electric Shears are on
 * @return
 */
public boolean isOn() {
return power;
}
/**
 * This will print if the electric shears are on or off
 * 
 */
public void onOff() {
	power = !power;
}
/**
 * this will return the cut of the shears
 * @return
 */
public String cut() {
	if(isOn())
		return super.cut();
	else return "";
}
/**
 * 
 */
@Override
public String toString() {
	return super.toString() + " power=" + (power ? "on" : "off");
}


}