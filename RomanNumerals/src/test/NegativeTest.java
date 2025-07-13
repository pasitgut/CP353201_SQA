package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.RomanNumerals;

public class NegativeTest {
	RomanNumerals romanNumerals;
	
	@BeforeEach
	void setUp() {
		romanNumerals = new RomanNumerals();
	}
	
	// Negative Test
		// TC23: romanNumber = K, expected result = NullPointerException [โปรแกรม error]
		@Test
		void testK() {
			// assertEquals(NullPointerException.class,
			// romanNumerals.convertRomanNumToInt("J"));
			assertThrows(NullPointerException.class, () -> romanNumerals.convertRomanNumToInt("K"));
		}

		// TC24: romanNumber = i, expected result = NullPointerException [โปรแกรม error]
		@Test
		void testRomanLowerCase() {
			// assertEquals(NullPointerException.class,
			// romanNumerals.convertRomanNumToInt("i"));
			assertThrows(NullPointerException.class, () -> romanNumerals.convertRomanNumToInt("i"));
		}

		// TC25: romanNumber = VV, expected result != 10
		@Test
		void testVV() {
			assertNotEquals(10, romanNumerals.convertRomanNumToInt("VV"));
		}

		// TC26: romanNumber = LL, expected result != 100
		@Test
		void testLL() {
			assertNotEquals(100, romanNumerals.convertRomanNumToInt("LL"));
		}

		// TC27: romanNumber = XXXX, expected result != 40
		@Test
		void testXXXX() {
			assertNotEquals(40, romanNumerals.convertRomanNumToInt("XXXX"));
		}

		// TC28: romanNumber = IIIII, expected result != 5
		@Test
		void testIIIII() {
			assertNotEquals(5, romanNumerals.convertRomanNumToInt("IIIII"));
		}

		// TC29: romanNumber = empty, expected result = 0
		@Test
		void testEmptyInput() {
			assertEquals(0, romanNumerals.convertRomanNumToInt(""));
		}
		
}
