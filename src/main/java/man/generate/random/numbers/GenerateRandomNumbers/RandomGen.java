package man.generate.random.numbers.GenerateRandomNumbers;

import java.util.HashMap;
import java.util.Map.Entry;
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
        populateNumberCount();
        System.out.println("\n\nProbabilities:");
        printHashMap(calculateNumberDensity());
        System.out.println("\n\nOccurancies:");
        printHashMap(numberCount);
    }

    private void populateNumberCount() {
        for(int i = 0; i < TOTAL_NUMBER_GENERATION_CALLS; i++){
            final Integer numberKey = Utils.getRandomIntegerFromArray(randomNums);
            numberCount.put(numberKey, numberCount.getOrDefault(numberKey, 0) + 1);
        } 
    }

    private HashMap<Integer, Float>  calculateNumberDensity() {
        final HashMap<Integer, Float> numberDensity = new HashMap<Integer, Float>();
        for(Integer number : numberCount.keySet()){
            final Float density = Utils.calculateDensity(numberCount.get(number), TOTAL_NUMBER_GENERATION_CALLS);
            numberDensity.put(number, density);
        }
        return numberDensity;
    }
 
    private void printHashMap(HashMap<Integer,? extends Number> hashMap){
        for( Entry<Integer, ? extends Number> entry : hashMap.entrySet()){
            System.out.println("" + entry.getKey() + " : "  + entry.getValue());
        }
    }

}