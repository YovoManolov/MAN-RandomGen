package man.generate.random.numbers.GenerateRandomNumbers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Random;

import org.junit.Test;
import org.mockito.Mock;


public class UtilsTest {
	
	@Mock private Random rd;

    @Test
    public void shouldReturnCorrectDensityAmount() {
    	int numberOfOccurences = 5; 
    	int totalCalls = 10; 
    	
    	final float result = Utils.calculateDensity(numberOfOccurences, totalCalls);
    	
    	assertEquals(0.50f, result, 0.001);
    }

    @Test
    public void shouldReturnIntArrayWithSizeOf5() {
    	Integer generatedIntArray[] = Utils.getArrayOfInts(5);
    	
    	assertEquals(5, generatedIntArray.length);	
    }

    @Test
    public void testGetRandomIntegerFromArray() {
    	Integer randomArray[] = {1, 6, 20, 3, 80};
    	
    	Integer randomValueFromArray = Utils.getRandomIntegerFromArray(randomArray);
    	
    	assertTrue(Arrays.asList(randomArray).contains(randomValueFromArray));
    }
    
}
