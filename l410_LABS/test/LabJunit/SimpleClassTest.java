package LabJunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test for SimpleClass.
 * Contains tests for the isLeapYear method.
 */
class SimpleClassTest {

    /**
     * Tests that years that are multiples of 4 but not multiples of 100 are leap years.
     */
    @Test
    void isLeapYear_YearIsMultipleOf4ButNotOf100_True() {
        assertTrue(SimpleClass.isLeapYear(2024));
    }

    /**
     * Tests that years that are multiples of 100 but not multiples of 400 are not leap years.
     */
    @Test
    void isLeapYear_YearIsMultipleOf100butNotOf400_False() {
        assertFalse(SimpleClass.isLeapYear(1900));
    }

    /**
     * Tests that years that are multiples of 400 are leap years.
     */
    @Test
    void isLeapYear_YearIsMultipleOf400_True() {
        assertTrue(SimpleClass.isLeapYear(2000), "Years that can be exactly divided by 400 should be leap years.");
    }

    /**
     * Tests that years that are not multiples of 4 are not leap years.
     */
    @Test
    void isLeapYear_YearIsNotMultipleOf4_False() {
        assertFalse(SimpleClass.isLeapYear(2021));
    }

    /**
     * Tests that the method throws an IllegalArgumentException for the year 0.
     */
    @Test
    void isLeapYear_YearIsZero_ThrowsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> {
            SimpleClass.isLeapYear(0);
        });
    }

    /**
     * Tests that the method throws an IllegalArgumentException for negative years.
     */
    @Test
    void isLeapYear_YearIsNegative_ThrowsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> {
            SimpleClass.isLeapYear(-400);
        });
    }
}
