package cutter;
/**
 * Cutter represents a tool that can cut.
 * Different cutters can cut in different ways.
 * 
 * @author Zeke
 */

public abstract class Cutter {
 private int size;

/**
 * Initializes the field size.
 * @param size
 */
public Cutter(int size) {
	this.size = size;
}

/**
 * Returns the value of the field size.
 * @return the size
 */
public int getSize() {
	return size;
}
/**
 * Returns a string that describes object cuts
 * @return a description  how this object cuts
 */

 public abstract String cut();
/**
 * Returns a string of the following format
 * {name of the Class} size={size}
 * 
 * *see java.lang.Object#toString()
 */
 
 
@Override
public String toString() {
	return this.getClass().getSimpleName() + " size=" + size + "\"";
}

}
