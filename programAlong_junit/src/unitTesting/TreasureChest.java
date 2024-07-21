package unitTesting;

import java.math.BigDecimal;
/**
 * Treasure chest that is defined by the amount of gold coins thare are stored in it.
 * In this class we assume that each coins is a Twenty-dollar liberty Gold Coin. This 
 * assumption combined with the knowledgde of the gold price and the amount of gold.
 * In each coin allows us to calculate the dollar value of the treasure chest.
 * 
 * 
 * @author Ezequiel
 */

public class TreasureChest {
	/**
	 * Number of gold coins.
	 */
	private int gold;
	/**
	 * Amount of gold per coin measured in ounces.
	 */
    private static final BigDecimal GOLD_PER_COIN  = new BigDecimal(0.9875);
    /**
     * Price of gold per coin measured in ounces.
     */
    private static BigDecimal goldPrice = new BigDecimal(1426.90);
    
	/**
	 * Initializes a newly created TreasureChest with the specified number of gold coins.
	 * <p>
	 * @param goldCoins the number of gold in the newly created treasure chest
	 * @throws IllegalArgumentException if <code>GoldCoins</code> is negative.
	 * 
	 * 
	 */
	public TreasureChest (int goldCoins) {
		if(goldCoins < 0)
			throw new IllegalArgumentException("The number of gold coins in the treasure chest can't be negative");
		
		this.gold = goldCoins;
	}
	/**
	 * @return the amount of gold in this treasure chest
	 */
	public int getGold() {
		return gold;
	}
	
	/**
	 * adds the specified number of coins to this treasure chest
	 * <p>
	 * 
	 * @param numberOfCoins number of gold coins to be removed
	 * @throws IllegalArgumentException if the <code>numberofgoldCOins</code> is negative
	 */
	public void addGold(int numberOfCoins) {
		if(numberOfCoins < 0)
			throw new IllegalArgumentException("The number of gold coins " + " added to the teasurecan't be negative");
	
		gold = numberOfCoins + gold;
	
	}
	/**
	 * Removes the specifed number of coins from this treasure chest.
	 * <p>
	 * @param numberOfCoins number of coins to be removed
	 * @return 
	 * @return the number of gold coins left in the treasure chest
	 * @throws IllegalArgumentExeption if the <code>numberOfCoins</code> is negative
	 * 
	 * 
	 * 
	 */
	public int removeGold(int numberOfCoins) {
		if(numberOfCoins < 0 || numberOfCoins > this.gold)
			throw new IllegalArgumentException("Number of gold coins " + " Removed from the treasure Chest cannot be positve");
		this.gold -= numberOfCoins;
		return this.gold;
	}
	/**
	 * @return the price of one ounce of gold
	 */
	public static BigDecimal getGoldprice() {
		
		return goldPrice;
	}
	/**
	 * Updates the price of gold with the <code>goldPrice</code> provided
	 * <p>
	 * @param goldPrice the goldPrice to set 
	 * @throws IllegalArgumentException if the <code>goldPrice</code> is negative.
	 */
	public static void setGoldprice(BigDecimal goldPrice) {
	if (goldPrice.compareTo(BigDecimal.ZERO) < 0) {
	throw new IllegalArgumentException("The gold price can't be negative");
	}
	
TreasureChest.goldPrice = goldPrice;
	}
	
     /**
      * 
      * @return
      */
	
	public BigDecimal valueinDollars() {
		
		return new BigDecimal(gold).multiply(GOLD_PER_COIN).multiply(goldPrice);
		
	}
	@Override
	public String toString() {
	
		return "[" + gold + " coins ]"; //TODO
	}
	
	
	

    
    
}

