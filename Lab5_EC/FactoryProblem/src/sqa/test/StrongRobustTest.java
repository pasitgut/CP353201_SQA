package sqa.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import sqa.main.Income;

class StrongRobustTest {
	private Income income;
	@BeforeEach
	void setUp() {
		income = new Income();
	}

	@ParameterizedTest
	@CsvFileSource(resources = "/data.csv", numLinesToSkip = 1)
	void testIncome(int impeller, int motor, int cover, Double expectedResult) {
		Double result = income.calculateIncome(impeller, motor, cover);
		assertEquals(expectedResult, result);
	}
	
}
