// นายพสิษฐ์ ผลวิเศษพรสุข 663380020-7 sec01

package sqa.test;

import sqa.main.CookingConversionCalculator;

public class Driver {

	public static void main(String[] args) {
		double[] value = {30.0,2.0,1.0}; 
		double[] converterValue = { 0,0,0 };
		String[] choice = {"temperature", "mass", "liquid"};
		String[] fromUnit = {"celsiusfahrenheit", "cup", "cup"};
		String[] toUnit = {"fahrenheit", "gram", "ml"};
		CookingConversionCalculator converter = new CookingConversionCalculator();
		
		for (int i = 0; i<3; i++) {
			converterValue[i] = converter.convert(value[i], choice[i], fromUnit[i], toUnit[i]);
		}
		
		for (int i = 0; i<3; i++) {
			System.out.println(value[i] + " " + fromUnit[i] + " = " + converterValue[i] + " " + toUnit[i]);
		}
	}

}
