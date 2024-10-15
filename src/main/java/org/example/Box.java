package org.example;

public class Box {
    double width;
    double height;
    double length;

    Box() {
        this(10);
    }

    Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    Box(double size) {
        this(size, size, size);
    }

    double getVolume() {
        return width * height * length;
    }

    void showVolume() {
        double volume = getVolume();
        System.out.println(volume);
    }
}
