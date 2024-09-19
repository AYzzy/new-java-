import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class MyStackTest {
    private MyStack myStack;

    @BeforeEach
    public void setUp() {
        myStack = new MyStack();
    }
    @Test
    void testThatStackIsEmpty(){
        assertTrue(myStack.isEmpty());
    }
    @Test
    void testThatStackIsNotEmptyWhenElementIsAdded(){
        assertTrue(myStack.isEmpty());
        myStack.push("ade");
        assertFalse(myStack.isEmpty());
    }
    @Test
    void addToStack_removeFromStack_stackIsEmpty(){
        assertTrue(myStack.isEmpty());
        myStack.push("ade");
        assertFalse(myStack.isEmpty());
        myStack.pop("ade");
        assertTrue(myStack.isEmpty());
    }
    @Test
    void addTwoElementsToSTack_removeFromStack_stackIsNotEmpty(){
        assertTrue(myStack.isEmpty());
        myStack.push("ade");
        myStack.push("praise");
        assertFalse(myStack.isEmpty());
        myStack.pop("ade");
        assertFalse(myStack.isEmpty());
    }
    @Test
    void removeElementFromStackWhenListIsEmpty(){
        assertTrue(myStack.isEmpty());
        assertThrows(IllegalArgumentException.class,()->myStack.pop("ade"));

    }
    @Test
    void toGetPeekOfStack(){
        assertTrue(myStack.isEmpty());
        myStack.push("ade");
        myStack.push("praise");
        myStack.push("tobi");
        myStack.push("jack");
        myStack.peek("jack");


    }
}
