package GeoPoliticalZone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ZoneTest {
    Zone zone;
    @Test
    public void testThatMethodExist(){
        Zone zone;
    }

    @Test
    public void testThatNorth_Central_givesDescription(){
        zone=Zone.NORTH_CENTRAL;
        String result = "Benue\nKogi\nKwara\nNasarawa\nNiger\nPlateau\nFederalCapitalTerritory (Abuja)";
        assertEquals(zone,result);
    }
}