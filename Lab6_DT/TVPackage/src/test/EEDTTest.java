package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import sqa.main.TVPlan;
import sqa.main.TVPlan.TVPackage;


class EEDTTest {
	
	
	@ParameterizedTest
	@CsvFileSource(resources = "/data/eedt-data.csv", numLinesToSkip = 1)
	public void testLETDBill(String pack, boolean offlineDownload, boolean isLive, boolean discount, double expectedResult) {
		TVPlan.TVPackage tvPackage = null;
		switch (pack) {
			case "Standard":
				tvPackage = TVPackage.STANDARD;
				break;
			case "Premium":
				tvPackage = TVPackage.PREMIUM;
				break;
			case "Family":
				tvPackage = TVPackage.FAMILY;
				break;
		}
		TVPlan tvPlan = new TVPlan(offlineDownload, isLive, discount);
		double actualResult = tvPlan.pricePerMonth(tvPackage);
		assertEquals(expectedResult, actualResult);
	}
}
