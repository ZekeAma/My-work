package abstractClass;

/**
 * abstract class that carries the model and count also the serial number 
 * of the printer
 * 
 */

public abstract class Printer {
private String model;
private static int count;
private int serialNumber;
/**
 * constructor that initializes the fields model, count and Serial number.
 * @param model
 * @param count
 * @param serialNumber
 */
public Printer(String model) {
	this.model = model;
	Printer.count = count + 1;
	this.serialNumber = 12345 + count;
	
}
/**
 * returns the model of printer
 * @return the model
 */
public String getModel() {
	return model;
}
/**
 * returns the serial number of the printer
 * @return the serialNumber
 */
public int getSerialNumber() {
	return serialNumber;
}
/**
 * should print the amount of of toner or how full a ink cartridge is 
 * 
 */
public abstract void print();
	

@Override
public String toString() {
	return this.getClass().getSimpleName() + ": " + model +  " #"+ serialNumber;
}

}
