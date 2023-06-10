package man.generate.random.numbers.GenerateRandomNumbers.randomgen;

import java.util.HashMap;

public class RandomGen {

    private static final int TOTAL_NUMBER_GENERATION_CALLS = 100;
    private static final int SIZE = 5;

    private final Integer[] randomNums;
    private final HashMap<Integer, Integer> numberCount;

    public RandomGen() {
        randomNums = Utils.getArrayOfInts(SIZE);
        numberCount = new HashMap<Integer, Integer>();
    }

    public void getProbabilities(){
    	populateNumbersCounter();
        System.out.println("\n\nProbabilities:");
        System.out.println(Utils.printHashMap(calculateNumberDensity()));
        System.out.println("\n\nOccurancies:");
        System.out.println(Utils.printHashMap(numberCount));
    }

    private void populateNumbersCounter() {
    	NumbersCounter.generateNumbersAndCount(numberCount, randomNums, TOTAL_NUMBER_GENERATION_CALLS);
    }

    private HashMap<Integer, Float> calculateNumberDensity() {
    	return DensityHashMapInitializer.initialize(numberCount, TOTAL_NUMBER_GENERATION_CALLS);
    }
    
}