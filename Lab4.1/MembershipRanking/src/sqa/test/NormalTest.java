package sqa.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import sqa.main.Ranking;

class NormalTest {
	Ranking ranking;

	@BeforeEach
	void setUp() {
		ranking = new Ranking();
	}

	@ParameterizedTest
	@MethodSource("provideParameStream")
	void testNormalBoundary(int purchaseTotal, int frequency, int pointCollected, String expectedResult) {
		String result = ranking.CalculateMembershipRank(purchaseTotal, frequency, pointCollected);
		assertEquals(expectedResult, result);
	}

	private static Stream<Arguments> provideParameStream() {
		return Stream.of(
				Arguments.of(55000, 4, 100, "Standard"),
				Arguments.of(55000, 4, 101, "Standard"),
				Arguments.of(55000, 4, 550, "Standard"),
				Arguments.of(55000, 4, 999, "Gold"),
				Arguments.of(55000, 4, 1000, "Gold"),
				Arguments.of(55000, 1, 550, "Standard"),
				Arguments.of(55000, 2, 550, "Standard"),
				Arguments.of(55000, 6, 550, "Standard"),
				Arguments.of(55000, 7, 550, "Standard"),
				Arguments.of(10000, 4, 550, "Standard"),
				Arguments.of(10001, 4, 550, "Standard"),
				Arguments.of(99999, 4, 550, "Gold"),
				Arguments.of(10000, 4, 550, "Standard"));
	}

}
