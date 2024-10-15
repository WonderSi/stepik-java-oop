package org.example;

public class Box {
    double width;
    double height;
    double length;

    Box() {
        this(10);
    }

    Box(Box another) {
        this(another.width, another.height, another.length);
    }

    Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    Box(double size) {
        this(size, size, size);
    }

    void setDimens(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    Box copy() {
        return new Box(width, height, length);
    }

    Box copyDouble() {
        return new Box(width*2, height*2, length*2);
    }

    int compare(Box another) {
        double currentVolume = getVolume();
        double anotherVolume = another.getVolume();
        int result;
        if (currentVolume > anotherVolume) {
            result = 1;
        } else if (currentVolume < anotherVolume) {
            result = -1;
        } else {
            result = 0;
        }

        return result;
    }

    double getVolume() {
        return width * height * length;
    }

    void showVolume() {
        double volume = getVolume();
        System.out.println(volume);
    }
}
