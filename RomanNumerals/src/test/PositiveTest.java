package test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.RomanNumerals;

public class PositiveTest {
	RomanNumerals romanNumerals;
	
	@BeforeEach
	void setUp() {
		romanNumerals = new RomanNumerals();
	}
	
	// Positive Case
		// TC01: romanNumber = I,expected result = 1
		@Test
		void testI() {
			assertEquals(1, romanNumerals.convertRomanNumToInt("I"));
		}

		// TC02: romanNumber = V, expected result = 5
		@Test
		void testV() {
			assertEquals(5, romanNumerals.convertRomanNumToInt("V"));
		}

		// TC03: romanNumber = L, expected result = 50
		@Test
		void testL() {
			assertEquals(50, romanNumerals.convertRomanNumToInt("L"));
		}

		// TC04: romanNumber = D, expected result = 500
		@Test
		void testD() {
			assertEquals(500, romanNumerals.convertRomanNumToInt("D"));
		}

		// TC05: romanNumber = M, expected result = 1000
		@Test
		void testM() {
			assertEquals(1000, romanNumerals.convertRomanNumToInt("M"));
		}

		// TC06: romanNumber = IV, expected result = 4
		@Test
		void testIV() {
			assertEquals(4, romanNumerals.convertRomanNumToInt("IV"));
		}

		// TC07: romanNumber = IX, expected result = 9
		@Test
		void testIX() {
			assertEquals(9, romanNumerals.convertRomanNumToInt("IX"));
		}

		// TC08: romanNumber = VI, expected result = 6
		@Test
		void testVI() {
			assertEquals(6, romanNumerals.convertRomanNumToInt("VI"));
		}

		// TC09: romanNumber = CI, expected result = 101
		@Test
		void testCI() {
			assertEquals(101, romanNumerals.convertRomanNumToInt("CI"));
		}

		// TC10: romanNumber = MI, expected result = 1001
		@Test
		void testMI() {
			assertEquals(1001, romanNumerals.convertRomanNumToInt("MI"));
		}

		// TC11: romanNumber = II, expected result = 2
		@Test
		void testII() {
			assertEquals(2, romanNumerals.convertRomanNumToInt("II"));
		}

		// TC12: romanNumber = XX, expected result = 20
		@Test
		void testXX() {
			assertEquals(20, romanNumerals.convertRomanNumToInt("XX"));
		}

		// TC13: romanNumber = MM, expected result = 2000
		@Test
		void testMM() {
			assertEquals(2000, romanNumerals.convertRomanNumToInt("MM"));
		}

		// TC14: romanNumber = III, expected result = 3
		@Test
		void testIII() {
			assertEquals(3, romanNumerals.convertRomanNumToInt("III"));
		}

		// TC15: romanNumber = MMM, expected result = 3000
		@Test
		void testMMM() {
			assertEquals(3000, romanNumerals.convertRomanNumToInt("MMM"));
		}

		// TC16: romanNumber = XXXVI, expected result = 26
		@Test
		void testXXXVI() {
			assertEquals(26, romanNumerals.convertRomanNumToInt("XXXVI"));
		}

		// TC17: romanNumber = XXVII, expected result = 27
		@Test
		void testXXVII() {
			assertEquals(27, romanNumerals.convertRomanNumToInt("XXVII"));
		}

		// TC18: romanNumber = LXVII, expected result = 67
		@Test
		void testLXVII() {
			assertEquals(67, romanNumerals.convertRomanNumToInt("LXVII"));
		}

		// TC19: romanNumber = LXXIV, expected result = 74
		@Test
		void testLXXIV() {
			assertEquals(74, romanNumerals.convertRomanNumToInt("LXXIV"));
		}

		// TC20: romanNumber = LXXVI, expected result = 76
		@Test
		void testLXXVI() {
			assertEquals(76, romanNumerals.convertRomanNumToInt("LXXVI"));
		}

		// TC21: romanNumber = LXXVIII, expected result = 78
		@Test
		void testLXXVIII() {
			assertEquals(78, romanNumerals.convertRomanNumToInt("LXXVIII"));
		}

		// TC22: romanNumber = LXXXIV, expected result = 84
		@Test
		void testLXXXIV() {
			assertEquals(84, romanNumerals.convertRomanNumToInt("LXXXIV"));
		}
}
