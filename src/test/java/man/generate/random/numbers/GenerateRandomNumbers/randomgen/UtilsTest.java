package man.generate.random.numbers.GenerateRandomNumbers.randomgen;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

public class UtilsTest {

	@Mock
	private Random rd;

	@Test
	void shouldReturnIntArrayWithSizeOf5() {
		final Integer generatedIntArray[] = Utils.getArrayOfInts(5);

		assertEquals(5, generatedIntArray.length);
	}

	@Test
	void testGetRandomIntegerFromArray() {
		final Integer randomArray[] = { 1, 6, 20, 3, 80 };

		final Integer randomValueFromArray = Utils.getRandomIntegerFromArray(randomArray);

		assertTrue(Arrays.asList(randomArray).contains(randomValueFromArray));
	}

	@Test
	void shouldPrintHashMap() {
		final String resultToPrint = String.join("\n", "1 : 0.11", "2 : 0.22", "3 : 0.33", "4 : 0.44\n");

		final HashMap<Integer, Float> hashMapToPrint = new HashMap<Integer, Float>();
		hashMapToPrint.put(1, 0.11f);
		hashMapToPrint.put(2, 0.22f);
		hashMapToPrint.put(3, 0.33f);
		hashMapToPrint.put(4, 0.44f);
		
		assertEquals(resultToPrint, Utils.printHashMap(hashMapToPrint));
	}

}
