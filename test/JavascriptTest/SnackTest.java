package JavascriptTest;

import JavaScript.Snacks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SnackTest {
    @Test
    public void testToReverseNumber(){
        Snacks snacks = new Snacks();
        int [] number = {5,4,9,7,6};
        int [] result = {6,7,9,4,5};
        int [] results = snacks.reverseNumber(number);
        assertArrayEquals(result,results);
    }
    @Test
    public void testToReverseNumber2(){
        Snacks snacks = new Snacks();
        int [] number = {1,2,3,4,5};
        int [] result = {5,4,3,2,1};
        int [] results = snacks.reverseNumber2(number);
        assertArrayEquals(result,results);
    }
}
