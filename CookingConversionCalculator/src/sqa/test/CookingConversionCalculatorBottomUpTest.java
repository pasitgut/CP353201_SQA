// นายพสิษฐ์ ผลวิเศษพรสุข 663380020-7 sec01

package sqa.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import sqa.main.CookingConversionCalculator;
import sqa.main.LiquidVolumeConverter;
import sqa.main.MassConverter;
import sqa.main.TemperatureConverter;

class CookingConversionCalculatorBottomUpTest {

	@ParameterizedTest
	@CsvFileSource(resources = "/liquid.csv", numLinesToSkip = 1)
	public void testLiquidVolumeConverter(double value, String fromUnit, String toUnit, double expectedResult) {
		LiquidVolumeConverter liquid = new LiquidVolumeConverter();
		double actualResult = liquid.convert(value, fromUnit, toUnit);
		assertEquals(expectedResult, actualResult);
	}
	
	@ParameterizedTest
	@CsvFileSource(resources = "/mass.csv", numLinesToSkip = 1)
	public void testMassConverter(double value, String fromUnit, String toUnit, double expectedResult) {
		MassConverter mass = new MassConverter();
		double actualResult = mass.convert(value, fromUnit, toUnit);
		assertEquals(expectedResult, actualResult);
	}
	
	@ParameterizedTest
	@CsvFileSource(resources = "/temp.csv", numLinesToSkip = 1)
	public void testTemperatureConveter(double value, String fromUnit, String toUnit, double expectedResult) {
		TemperatureConverter temp = new TemperatureConverter();
		double actualResult = temp.convert(value, fromUnit, toUnit);
		assertEquals(expectedResult, actualResult);
	}
	
	@ParameterizedTest 
	@CsvFileSource(resources = "/ccc.csv", numLinesToSkip = 1)
	public void testCookingConversionCalculator(double value, String choice, String fromUnit, String toUnit, double expectedResult) {
		CookingConversionCalculator ccc = new CookingConversionCalculator();
		double actualResult = ccc.convert(value, choice, fromUnit, toUnit);
		assertEquals(expectedResult, actualResult);
	}
}
