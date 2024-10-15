package Stacks;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SetTest {
    private Set mySet;

    @Before
    public void setUp() {
        mySet = new Set();
    }

    @Test
    public void testToAddToStack() {
        mySet.add(1);
        mySet.add(2);
        mySet.add(2);
        assertEquals(2, mySet.size());
    }

    @Test
    public void testToSeeContainerContainItems() {
        mySet.add(1);
        assertTrue(mySet.contains(1));
        assertFalse(mySet.contains(2));
    }

    @Test
    public void testRemoveFromStack() {
        mySet.add(1);
        mySet.add(2);
        assertTrue(mySet.remove(1));
        assertFalse(mySet.contains(1));
        assertEquals(1, mySet.size());
        assertFalse(mySet.remove(3));
    }

    @Test
    public void testSizeOfStack() {
        assertEquals(0, mySet.size());
        mySet.add(1);
        assertEquals(1, mySet.size());
        mySet.add(2);
        assertEquals(2, mySet.size());
    }

    @Test
    public void testIsEmpty() {
        assertTrue(mySet.isEmpty());
        mySet.add(1);
        assertFalse(mySet.isEmpty());
        mySet.clear();
        assertTrue(mySet.isEmpty());
    }

    @Test
    public void testToClearStack() {
        mySet.add(1);
        mySet.add(2);
        mySet.clear();
        assertEquals(0, mySet.size());
        assertTrue(mySet.isEmpty());
    }
}