package man.generate.random.numbers.GenerateRandomNumbers.randomgen;

import java.util.HashMap;
import java.util.Random;
import java.util.Map.Entry;

public class Utils {

	private static Random rd = new Random();

	public static Integer getRandomIntegerFromArray(Integer randomNums[]) {
		return randomNums[rd.nextInt(randomNums.length)];
	}

	public static Integer[] getArrayOfInts(int size) {
		return rd.ints(size).boxed().toArray(Integer[]::new);
	}

	public static String printHashMap(HashMap<Integer, ? extends Number> hashMap) {
		StringBuffer hashMapToPrint = new StringBuffer();
		for (Entry<Integer, ? extends Number> entry : hashMap.entrySet()) {
			hashMapToPrint = hashMapToPrint.append("" + entry.getKey() + " : " + entry.getValue() + "\n");
		}
		return hashMapToPrint.toString();
	}

}
