package Stacks;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayListTest{
    private ArrayList list;
    @Before
    public void setUp(){
        list = new ArrayList();
    }
    @Test
    public void testThatItIsEmpty(){

        assertEquals(0,list.size());
    }
    @Test
    public void testAddToList() {
        list.add("Hello");
        list.add("World");
        assertEquals("Hello", list.get(0));
        assertEquals("World", list.get(1));
    }

    @Test
    public void testRemoveFromList() {
        list.add("A");
        list.add("B");
        list.add("C");
        list.remove(1);
        assertEquals("A", list.get(0));
        assertEquals("C", list.get(1));
        assertEquals(2, list.size());
    }

    @Test
    public void testSize() {
        assertEquals(0, list.size());
        list.add(1);
        list.add(2);
        assertEquals(2, list.size());
        list.remove(0);
        assertEquals(1, list.size());
    }

    @Test
    public void testContains() {
        list.add("A");
        list.add("B");
        assertTrue(list.contains("A"));
        assertFalse(list.contains("C"));
    }

    @Test
    public void testClear() {
        list.add(1);
        list.add(2);
        list.clear();
        assertEquals(0, list.size());
        assertFalse(list.contains(1));
    }

    @Test
    public void testToArray() {
        list.add("A");
        list.add("B");
        Object[] array = list.toArray();
        assertArrayEquals(new Object[] {"A", "B"}, array);
    }

    @Test
    public void testIndexOutOfBounds() {
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(0));
        list.add("A");
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(1));
    }
    @Test
    public void testArrayCanHoldMoreElements(){
        ArrayList arrayList = new ArrayList();
        int count = -1;
        do{
            arrayList.add("intellect" + ++count);
            System.out.println(arrayList);
        }while(count<=20);

    }

}