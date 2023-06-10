package man.generate.random.numbers.GenerateRandomNumbers.randomgen;

import java.util.HashMap;

class NumbersCounter {

	public static void generateNumbersAndCount(HashMap<Integer, Integer> numberCount,
												Integer[] randomNums,
												int totalNumberGenerationCalls) {
		for (int i = 0; i < totalNumberGenerationCalls; i++) {
			final Integer numberKey = Utils.getRandomIntegerFromArray(randomNums);
			numberCount.put(numberKey, numberCount.getOrDefault(numberKey, 0) + 1);
		}
	}

}
