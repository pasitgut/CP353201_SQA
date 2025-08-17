// นายพสิษฐ์ ผลวิเศษพรสุข 663380020-7 sec01


package sqa.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testWithStub {
	
	@Test 
	void testLiquidVolumeConverter() {
		StubLiquidVolumeConverter stub = new StubLiquidVolumeConverter();
		double expectedResult = 250.0;
		assertEquals(expectedResult, stub.convert(1, "cup", "ml"));
	}
	
	@Test 
	void testMassConverter() {
		StubMassConverter stub = new StubMassConverter();
		double expectedResult = 125.0;
		assertEquals(expectedResult, stub.convert(1, "cup", "gram"));
	}
	
	@Test 
	void testTemperatureConverter() {
		StubTemperatureConverter stub = new StubTemperatureConverter();
		double expectedResult = 86.0;
		assertEquals(expectedResult, stub.convert(30, "celsiusfahrenheit", "fahrenheit"));
	}
	
}
