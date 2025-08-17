// นายพสิษฐ์ ผลวิเศษพรสุข 663380020-7 sec01

package sqa.test;

import sqa.main.MassConverter;

public class StubMassConverter extends MassConverter {
	@Override
	public double convert(double value, String fromUnit, String toUnit) {
		return 125.0;
	}
}
