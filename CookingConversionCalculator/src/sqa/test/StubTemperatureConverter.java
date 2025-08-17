// นายพสิษฐ์ ผลวิเศษพรสุข 663380020-7 sec01

package sqa.test;

import sqa.main.TemperatureConverter;

public class StubTemperatureConverter extends TemperatureConverter {
	@Override
	public double convert(double value, String fromUnit, String toUnit) {
		return 86.0;
	}
}
