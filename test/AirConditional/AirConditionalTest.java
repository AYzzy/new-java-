package AirConditional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionalTest {
    private AirConditional conditional;
    @BeforeEach
    public void setUp() {
        conditional = new AirConditional();
    }
    @Test
    public void testToShowAcIsOff(){
        assertFalse(conditional.isOn());
    }
    @Test
    public void testToShowIsOn(){
        assertFalse(conditional.isOn());
        conditional.setOn();
        assertTrue(conditional.isOn());
    }
    @Test
    public void testToTurnOnAndTurnOff(){
        assertFalse(conditional.isOn());
        conditional.setOn();
        assertTrue(conditional.isOn());
        conditional.setOff();
        assertFalse(conditional.isOn());
    }
    @Test
    public void testToTurnOnAndIncreaseTemp(){
        assertFalse(conditional.isOn());
        conditional.setOn();
        assertTrue(conditional.isOn());
        conditional.increaseTemperature();
        assertEquals(17,conditional.getTemperature());
    }
    @Test
    public void testToTurnOnAndIncreaseTempTo30(){
        assertFalse(conditional.isOn());
        conditional.setOn();
        assertTrue(conditional.isOn());
        for(int count = 1; count <=14; count++){
            conditional.increaseTemperature();
        }
        assertEquals(30,conditional.getTemperature());
    }
    @Test
    public void testToTurnOnAndIncreaseTempBeyond30(){
        assertFalse(conditional.isOn());
        conditional.setOn();
        assertTrue(conditional.isOn());
        for(int count = 1; count <=15; count++){
            conditional.increaseTemperature();
        }
        assertThrows(RuntimeException.class,()->conditional.increaseTemperature());
    }
    @Test
    public void testToTurnOnAndDecreaseTempFrom30To29(){
        assertFalse(conditional.isOn());
        conditional.setOn();
        assertTrue(conditional.isOn());
        for(int count = 1; count <=14; count++){
            conditional.increaseTemperature();
        }
        assertEquals(30,conditional.getTemperature());
        for(int count =2 ;count > 1; count--) {
            conditional.decreaseTemperature();
        }
        assertEquals(29,conditional.getTemperature());
    }
    @Test
    public void testToTurnOnAndDecreaseTempFrom29To28(){
        assertFalse(conditional.isOn());
        conditional.setOn();
        assertTrue(conditional.isOn());
        for(int count = 1; count <=13; count++){
            conditional.increaseTemperature();
        }
        assertEquals(29,conditional.getTemperature());
        for(int count =2 ;count > 1; count--) {
            conditional.decreaseTemperature();
        }
        assertEquals(28,conditional.getTemperature());
    }
    @Test
    public void testToTurnOnAndDecreaseTempFrom17To16(){
        assertFalse(conditional.isOn());
        conditional.setOn();
        assertTrue(conditional.isOn());
        for(int count = 1; count <=1; count++){
            conditional.increaseTemperature();
        }
        assertEquals(17,conditional.getTemperature());
        for(int count =2 ;count > 1; count--) {
            conditional.decreaseTemperature();
        }
        assertEquals(16,conditional.getTemperature());
    }
    @Test
    public void testToTurnOnAndDecreaseTempBeyond16(){
        assertFalse(conditional.isOn());
        conditional.setOn();
        assertTrue(conditional.isOn());
        for(int count = 1; count <=0; count++){
            conditional.increaseTemperature();
        }
        assertEquals(16,conditional.getTemperature());
        for(int count =2 ;count > 1; count--) {
            conditional.decreaseTemperature();
        }
        assertThrows(RuntimeException.class,()->conditional.increaseTemperature());
    }


}
