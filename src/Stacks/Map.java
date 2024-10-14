package Stacks;

import java.util.Arrays;

public class Map {
    private Object[][] elements;
    private int size;
    private static final int INITIAL_CAPACITY = 10;

    public Map() {
        elements = new Object[INITIAL_CAPACITY][2];
        size = 0;
    }

    public void put(String key, int value) {
        if (containsKey(key)) {
            for (int i = 0; i < size; i++) {
                if (elements[i][0].equals(key)) {
                    elements[i][1] = value;
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
        for (int i = 0; i < size; i++) {
            if (elements[i][0].equals(key)) {
                return elements[i][1];
            }
        }
        return null; // Return null if key is not found
    }

    public boolean containsKey(String key) {
        for (int i = 0; i < size; i++) {
            if (elements[i][0].equals(key)) {
                return true;
            }
        }
        return false;
    }

    public Object remove(String key) {
        for (int i = 0; i < size; i++) {
            if (elements[i][0].equals(key)) {
                Object value = elements[i][1];
                elements[i] = elements[size - 1];
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
        for (int i = 0; i < size; i++) {
            elements[i] = null;
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
