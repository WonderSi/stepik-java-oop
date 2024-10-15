package org.example.test;

public class MyArrayList {
    private String[] array = new String[10];
    private int size = 0;

    public String get(int index) {
        return array[index];
    }

    public void add(String element) {
        array[size] = element;
        size += 1;
        if (size == array.length) {
            String[] newArray = new String[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
    }

    public void remove(int index) {
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[size] = null;
        size -= 1;
    }

    public void remove (String element) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(element)) {
                remove(i);
                return;
            }
        }
    }

    public int getSize() {
        return size;
    }
}
