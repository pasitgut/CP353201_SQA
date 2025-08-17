// นายพสิษฐ์ ผลวิเศษพรสุข 663380020-7 sec01

package sqa.test;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import sqa.main.CookingConversionCalculator;

class CookingConversionCalculatorTopDownTest {

	@ParameterizedTest
	@CsvFileSource(resources = "/topdown.csv", numLinesToSkip = 1)
	public void testTopDownIntegration(double value, String choice, String fromUnit, String toUnit, double expectedResult) {
		CookingConversionCalculator calc = new CookingConversionCalculator();
		double actualResult = calc.convert(value, choice, fromUnit, toUnit);
		assertEquals(expectedResult, actualResult, 0.01);
	}

}
