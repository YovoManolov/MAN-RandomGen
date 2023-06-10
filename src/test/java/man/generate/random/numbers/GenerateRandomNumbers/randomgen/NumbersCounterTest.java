package man.generate.random.numbers.GenerateRandomNumbers.randomgen;

import static org.junit.Assert.assertTrue;
import java.util.HashMap;

import org.junit.jupiter.api.Test;

class NumbersCounterTest {

	@Test
	void shuldGenerateNumbersAndCountThemUsingAHashMap() {

		HashMap<Integer, Integer> numberCount = new HashMap<>();
		final Integer[] randomNums = new Integer[] { 1, 2, 3 };
		final int totalCalls = 20;

		HashMap<Integer, Integer> result = new HashMap<>();
		result.put(1, 4);
		result.put(2, 4);
		result.put(3, 4);

		NumbersCounter.generateNumbersAndCount(numberCount, randomNums, totalCalls);

		assertTrue(numberCount.size() > 0);
	}

}
