package test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import sqa.main.CountWordClumps;

class WordClumpsTest {
	
	@ParameterizedTest
	@MethodSource("paramProvider")
	void testClump(int[] inputData, int expectedResult) {
		int actualResult = CountWordClumps.countClumps(inputData);
		assertEquals(expectedResult, actualResult);
	}
	
	
	private static Stream<Arguments> paramProvider() {
		return Stream.of(Arguments.of(null, 0), 
				Arguments.of(new int[]{}, 0),
				Arguments.of(new int[] {1,2,3,3,4,4}, 2),
				Arguments.of(new int[] {1,2,3,4,5,6}, 0)
				);
	}
}
