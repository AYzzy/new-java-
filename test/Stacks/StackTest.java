package Stacks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    @Test
    public void testPushAndPop() {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testPeek() {
        Stack stack = new Stack();
        stack.push(1);
        assertEquals(1, stack.peek());
        stack.push(2);
        assertEquals(2, stack.peek());
        stack.pop();
        assertEquals(1, stack.peek());
    }

    @Test
    void testIsEmpty() {
        Stack stack = new Stack();
        assertTrue(stack.isEmpty());
        stack.push(1);
        assertFalse(stack.isEmpty());
    }

    @Test
    public void testResize() {
        Stack stack = new Stack();
        for (int i = 0; i < 15; i++) {
            stack.push(i);
        }
        assertEquals(15, stack.getSize());
    }

    @Test
    public void testPopFromEmptyStack() {
        Stack stack = new Stack();
        assertThrows(IllegalStateException.class, stack::pop);
    }
}