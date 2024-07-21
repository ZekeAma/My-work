package unitTesting;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TreasureChestTest {
	private TreasureChest treasure;
	private TreasureChest emptyChest;
	private final BigDecimal DELTA = new BigDecimal(.00001);
	

	@BeforeEach
	void setUp() throws Exception {
		treasure = new TreasureChest(10);
		emptyChest = new TreasureChest(0);
		TreasureChest.setGoldprice(new BigDecimal(1426.90));
	}

	@Test
	void testTreasureChest_PositiveNumberOfCoins_AllCoinsStoredInTreasureChest() {
		TreasureChest Treasure7 = new TreasureChest(7);
		int expected = 7;
		int actual = Treasure7.getGold();
		assertEquals(expected, actual);
	}

	@Test
	void testTreasureChest_ZeroCOins_NoCoinsStoredInTreasureChest() {
		TreasureChest Treasure0 = new TreasureChest(0);
		int expected = 0;
		int actual = Treasure0.getGold();
		assertEquals(expected, actual);
	}
	@Test
	void testTreasureChest_NegativeNumverOfCOins_ThrowsIllegalArgumentException() {
		assertThrows(IllegalArgumentException.class, () -> {new TreasureChest(-2);} );
	}

	
	@Test
	void addGOld_AddingPositiveNumberOfCOins_IncreaseNumberOfCOinsInTreasureChest() {
		treasure.addGold(5);
		int expected = 15;
	    int actual = treasure.getGold();
	    assertEquals(expected, actual);
		
		
	}
	
	@Test
	void addGOld_AddingZeroCOins_LeavesNumberOfCOinsInTreasureChest() {
		treasure.addGold(0);
		int expected = 10;
	    int actual = treasure.getGold();
	    assertEquals(expected, actual);
		
		
	}
	
	@Test
	void addGOld_AddingNegativeNumberOfCOins_ThrowsIllegalArgumentException() {
		assertThrows(IllegalArgumentException.class, () -> {treasure.addGold(-1);} );
		
		
	}
	
	@Test
	void RemoveGoldCoins_RemovingPositiveNumberOfCoins_DecreaseNumberOfCoinsInTreasureChest() {
		treasure.removeGold(5);
		int expected = 5;
		int actual = treasure.getGold();
		assertEquals(expected, actual);
		
	}
	@Test
	void RemoveZeronCoins_RemovingZeroCoins_NumberOfCoinsInTreasureChest_GOldCoinRemainTheSame() {
		treasure.removeGold(0);
		assertEquals(10, treasure.getGold());
		
	}
	@Test
	void removeGold_NumberOfGoldCoinsIsGreaterThanGold_ThrowsIllegalException() {
		assertThrows(IllegalArgumentException.class, () -> {treasure.removeGold(11);} );
	
		
	}
	@Test
	void removeGold_IfNumberOfGoldCoinsIsnegative_ThrowsIllegalException() {
		assertThrows(IllegalArgumentException.class, () -> {treasure.removeGold(-3);} );
	
		
	}

	
	@Test
	void setGoldPrice_SettingPositiveValue_PriceOfgoldChanges() {
		TreasureChest.setGoldprice(new BigDecimal(1376.57));;
		assertEquals(new BigDecimal(1376.57), TreasureChest.getGoldprice());
		
	}
	@Test
	void setGoldPrice_SettingZeroValue_PriceOfgoldChanges() {
		TreasureChest.setGoldprice(new BigDecimal(0));
		assertEquals(new BigDecimal(0), TreasureChest.getGoldprice());
		
	}
	@Test
	void setGoldPrice_SettingNegatieveValue_ThrowsIllegalArgumentException() {
		assertThrows(IllegalArgumentException.class,() -> {TreasureChest.setGoldprice(new BigDecimal(-0.001)) ;});
		
	}


	@Test
	void ValueinDollars_FailedTreasureChest_ReturnsTotalAmountOfGoldMultipliedWithPrice() {
		BigDecimal difference = (new BigDecimal(13805.2575).subtract(treasure.valueinDollars())).abs();
		assertTrue(!(difference.compareTo(DELTA) > 1));
		
	}
	@Test
	void ValueinDollars_EmptyTreasureChest_Returns0() {
		BigDecimal difference = (BigDecimal.ZERO.subtract(emptyChest.valueinDollars())).abs();
		assertTrue(!(difference.compareTo(DELTA) > 1));
		
	}


	@Test
	void toString_PositiveNumberOfCoins_ReturnNumberCoinsInBrackets() {
		String expected = "[10 coins ]";
		String actual = treasure.toString();
		assertEquals(expected, actual);
	}
	@Test
	void toString_NoCoins_ReturnNumberCoinsInBrackets() {
		String expected = "[0 coins ]";
		String actual = emptyChest.toString();
		assertEquals(expected, actual);
	}

}
