import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelevisionTest {

    Television television = new Television();

    @BeforeEach
    public void setUp(){
        television = new Television();
    }

    @Test
    void testThatTelevisionIsActive() {
        assertFalse(television.isActive());
        television.setActive();
        assertTrue(television.isActive());
    }
    @Test
    void testThatTelevisionIsInactive(){
        assertFalse(television.isActive());
        television.setActive();
        assertTrue(television.isActive());
        television.setInactive();
        assertFalse(television.isActive());
    }
    @Test
    void testThatVolumeIncreases(){
        television.setActive();
        for(int volume =1;volume <=10 ;volume++ ) {
            television.setIncreaseInVolume();
        }
        assertEquals(10,television.getVolumeIncrease());
    }
    @Test
    void testThatVolumeDecreases() {
        television.setActive();
        for (int volume = 1; volume <= 10; volume++) {
            television.setIncreaseInVolume();
        }
        for (int volume = 10; volume >= 1 ; volume--) {
            television.setDecreaseInVolume();
        }
        assertEquals(0,television.getVolumeDecrease());
    }
    @Test
    void testToIncrementChannel(){
        television.setActive();
            for(int channel =1; channel<=10;channel++){
            television.setChannelToIncrement();
            }
        assertEquals(10,television.getChannelToIncrement());
    }
    @Test
    void testToDecrementChannel(){
        television.setActive();
        for(int channel =1; channel<=10;channel++) {
            television.setChannelToIncrement();
        }
        for(int channel =1; channel<=10;channel++) {
            television.setChannelToDecrement();
        }
        assertEquals(2,television.getChannelToDecrement());

    }

}