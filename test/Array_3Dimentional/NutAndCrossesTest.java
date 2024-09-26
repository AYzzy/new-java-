package Array_3Dimentional;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class NutAndCrossesTest {
    @Test
    public void testThatNutIsSpaceAndOneAsAstericks(){
     NutAndCrosses nutAndCrosses = new NutAndCrosses();
     int [][] actual = {{1,1,0},{0,1,0},{1,1,0}};
     String[][] result = nutAndCrosses.convertNutAndCross(actual);
     String [][] expected = {{"*","*"," "},{" ","*"," "},{"*","*"," "}};
     assertArrayEquals(expected,result);
    }

}
