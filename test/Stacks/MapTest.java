package Stacks;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class MapTest {

    @Test
    public void testPutAndGet() {
        Map map = new Map();
        map.put("one", 1);
        assertEquals(1, map.get("one"));
        assertNull(map.get("two"));
    }

    @Test
    public void testContainsKey() {
        Map map = new Map();
        map.put("one", 1);
        assertTrue(map.containsKey("one"));
        assertFalse(map.containsKey("two"));
    }

    @Test
    public void testRemove() {
        Map map = new Map();
        map.put("one", 1);
        assertEquals(1, map.remove("one"));
        assertFalse(map.containsKey("one"));
    }

    @Test
    public void testSize() {
        Map map = new Map();
        assertEquals(0, map.size());
        map.put("one", 1);
        assertEquals(1, map.size());
        map.put("two", 2);
        assertEquals(2, map.size());
        map.remove("one");
        assertEquals(1, map.size());
    }

    @Test
    public void testClear() {
        Map map = new Map();
        map.put("one", 1);
        map.clear();
        assertTrue(map.isEmpty());
    }

    @Test
    public void testIsEmpty() {
        Map map = new Map();
        assertTrue(map.isEmpty());
        map.put("one", 1);
        assertFalse(map.isEmpty());
        map.remove("one");
        assertTrue(map.isEmpty());
    }

}