package Stacks;

public class Stack {
    private int[] elements;
    private int size;
    private static final int INITIAL_CAPACITY = 10;

    public Stack() {
        elements = new int[INITIAL_CAPACITY];
        size = 0;
    }

    public void push(int item) {
        if (size >= elements.length) {
            resize();
        }
        elements[size++] = item;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return elements[--size];
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return elements[size - 1];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    private void resize() {
        int newCapacity = elements.length * 2;
        int[] newElements = new int[newCapacity];
        System.arraycopy(elements, 0, newElements, 0, size);
        elements = newElements;
    }
}

