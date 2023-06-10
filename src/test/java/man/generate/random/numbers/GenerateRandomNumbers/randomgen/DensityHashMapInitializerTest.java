package man.generate.random.numbers.GenerateRandomNumbers.randomgen;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

class DensityHashMapInitializerTest {
	
	@Test
	void shouldInitializeDensityHashMap() {
		HashMap<Integer, Integer> numberCount = new HashMap<>();
		numberCount.put(5, 3);
		numberCount.put(1, 1);
		numberCount.put(7, 4);
		numberCount.put(2, 2);
		
		final HashMap<Integer, Float> densityHashMap = DensityHashMapInitializer.initialize(numberCount, 10);
		
		assertEquals(densityHashMap.get(5), 0.30, 0.001);
		assertEquals(densityHashMap.get(1), 0.10, 0.001);
		assertEquals(densityHashMap.get(7), 0.40, 0.001);
		assertEquals(densityHashMap.get(2), 0.20, 0.001);
		
	}
	
}
