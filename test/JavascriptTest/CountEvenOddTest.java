package JavascriptTest;

import JavaScript.CountEvenOdd;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CountEvenOddTest {

    @Test
    public void testToCountEvenOddNumbers(){
        CountEvenOdd countEvenOdd = new CountEvenOdd();
        int[] actual = {2,1,5,7,8};
        int [] expected = {2,3};
        int []result = countEvenOdd.evenOddCount(actual);
        System.out.println(Arrays.toString(result));
        assertArrayEquals(expected,result);
    }
}
