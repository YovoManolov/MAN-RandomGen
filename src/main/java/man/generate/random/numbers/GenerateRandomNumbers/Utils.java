package man.generate.random.numbers.GenerateRandomNumbers;

import java.util.Random;

public class Utils {

    private static Random rd = new Random();
    
    public static Integer getRandomIntegerFromArray(Integer randomNums[]){
        return randomNums[rd.nextInt(randomNums.length)];
    }

    public static Integer[] getArrayOfInts(int size) {
        return rd.ints(size).boxed().toArray(Integer[]::new);
    }

    public static Float calculateDensity(Integer numberOccurances, Integer totalCalls) {
        return (float) numberOccurances / (float) totalCalls;
    }


}
