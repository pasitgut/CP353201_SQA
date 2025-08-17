// นายพสิษฐ์ ผลวิเศษพรสุข 663380020-7 sec01

package sqa.test;

import sqa.main.LiquidVolumeConverter;

public class StubLiquidVolumeConverter extends LiquidVolumeConverter {
	@Override
	public double convert(double value, String fromUnit, String toUnit) {
		return 250.0;
	}
}
