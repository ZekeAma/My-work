package cutter;

public class CutterApp {

	public static void main(String[] args) {
		 Pliers SideCutter = new Pliers(6, PliersType.SIDE_CUTTER);
		 Pliers EndNipper = new Pliers(11, PliersType.END_NIPPER);
		 Pliers FLushCutter = new Pliers(5, PliersType.FLUSH_CUTTER);
		 
		 PruningShares Shears = new PruningShares(9);
		 ElectricPruningShears eshares1 = new  ElectricPruningShears(11);
		 ElectricPruningShears eshares2 = new  ElectricPruningShears(12);
		 eshares1.onOff();
		 eshares2.onOff();
		 
       Cutter[] pliers = {SideCutter, EndNipper, FLushCutter, Shears, eshares1, eshares2};
       for(Cutter cuts: pliers) {
    	   System.out.println(cuts + ":");
    	   System.out.println("size = " + cuts.getSize());
    	   if(cuts instanceof ElectricPruningShears ) {
    		   System.out.print("power: " + (((ElectricPruningShears) cuts).isOn() ? "on " : "off"));
    	   }
    	   
    	   System.out.println(cuts.cut());
    	   System.out.println();
    	  
       }
	}

}
