package Stacks;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {


    @Test
    public void testEnqueueAndDequeue() {
        Queue queue = new Queue(3);
        queue.enqueue(1);
        queue.enqueue(2);
        assertEquals(1, queue.dequeue());
        assertEquals(2, queue.dequeue());
    }

    @Test
    public void testDequeueEmpty() {
        Queue queue = new Queue(3);
        assertThrows(IllegalStateException.class, queue::dequeue);
    }

    @Test
    public void testPeek() {
        Queue queue = new Queue(3);
        queue.enqueue(1);
        assertEquals(1, queue.peek());
    }

    @Test
    public void testPeekEmpty() {
        Queue queue = new Queue(3);
        assertThrows(IllegalStateException.class, queue::peek);
    }

    @Test
    public void testSize() {
        Queue queue = new Queue(3);
        assertEquals(0, queue.size());
        queue.enqueue(1);
        assertEquals(1, queue.size());
        queue.enqueue(2);
        assertEquals(2, queue.size());
        queue.dequeue();
        assertEquals(1, queue.size());
    }

    @Test
    public void testClear() {
        Queue queue = new Queue(3);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.clear();
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testIsEmpty() {
        Queue queue = new Queue(3);
        assertTrue(queue.isEmpty());
        queue.enqueue(1);
        assertFalse(queue.isEmpty());
        queue.dequeue();
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testIsFull() {
        Queue queue = new Queue(3);GIT
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        assertTrue(queue.isFull());
        assertThrows(IllegalStateException.class, () -> queue.enqueue(4));
    }
}