package Stacks;

import java.util.Arrays;

public class Set {
    private int[] elements;
    private int size;
    private static final int INITIAL_CAPACITY = 10;

    public Set() {
        elements = new int[INITIAL_CAPACITY];
        size = 0;
    }

    public void add(int item) {
        if (!contains(item)) {
            if (size == elements.length) {
                resize();
            }
            elements[size++] = item;
        }
    }

    public boolean contains(int item) {
        for (int count = 0; count < size; count++) {
            if (elements[count] == item) {
                return true;
            }
        }
        return false;
    }

    public boolean remove(int item) {
        for (int count = 0; count < size; count++) {
            if (elements[count] == item) {
                elements[count] = elements[size - 1];
                elements[size - 1] = 0;
                size--;
                return true;
            }
        }
        return false;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        size = 0;
    }

    private void resize() {
        int newCapacity = elements.length * 2;
        elements = Arrays.copyOf(elements, newCapacity);
    }
}
