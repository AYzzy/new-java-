package Stacks;

import java.util.Arrays;

public class Map {
    private Object[][] elements;
    private int size;
    private static final int INITIAL_CAPACITY = 10;

    public Map() {
        elements = new String[INITIAL_CAPACITY][2];
        size = 0;
    }

    public void put(String key, int value) {
        if (containsKey(key)) {
            for (int count = 0; count < size; count++) {
                if (elements[count][0].equals(key)) {
                    elements[count][1] = value;
                    return;
                }
            }
        } else {
            if (size == elements.length) {
                resize();
            }
            elements[size][0] = key;
            elements[size][1] = value;
            size++;
        }
    }

    public Object get(String key) {
        for (int count = 0; count < size; count++) {
            if (elements[count][0].equals(key)) {
                return elements[count][1];
            }
        }
        return null;
    }

    public boolean containsKey(String key) {
        for (int count = 0; count < size; count++) {
            if (elements[count][0].equals(key)) {
                return true;
            }
        }
        return false;
    }

    public Object remove(String key) {
        for (int count = 0; count < size; count++) {
            if (elements[count][0].equals(key)) {
                Object value = elements[count][1];
                elements[count] = elements[size - 1];
                elements[size - 1] = null;
                size--;
                return value;
            }
        }
        return null;
    }

    public int size() {
        return size;
    }

    public void clear() {
        for (int count = 0; count < size; count++) {
            elements[count] = null;
        }
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void resize() {
        elements = Arrays.copyOf(elements, elements.length * 2);
    }
}
