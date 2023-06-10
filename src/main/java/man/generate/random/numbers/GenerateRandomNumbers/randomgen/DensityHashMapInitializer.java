package man.generate.random.numbers.GenerateRandomNumbers.randomgen;

import java.util.HashMap;

public class DensityHashMapInitializer {
	
	public static HashMap<Integer, Float> initialize(final HashMap<Integer, Integer> numberCount,final int totalCalls) {
        final HashMap<Integer, Float> numberDensity = new HashMap<Integer, Float>();
		for(final Integer number : numberCount.keySet()){
	        final Float density = calculateDensity(numberCount.get(number), totalCalls);
	        numberDensity.put(number, density);
	    }
		return numberDensity;
	}
	
	private static Float calculateDensity(Integer numberOccurances, Integer totalCalls) {
		return (float) numberOccurances / (float) totalCalls;
	}

}
