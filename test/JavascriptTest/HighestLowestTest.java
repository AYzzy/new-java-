package JavascriptTest;

import JavaScript.HighestLowest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class HighestLowestTest {

    @Test
    public void testToReturnLowestAndHighestNumber(){
        HighestLowest highestLowest = new HighestLowest();
        int []input = {12,3,4,5,6,7,8};
        int []expect = {3,12};
        int[] result = highestLowest.highLow(input);
        assertArrayEquals(expect,result);
    }
}
