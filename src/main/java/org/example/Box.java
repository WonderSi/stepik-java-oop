package org.example;

public class Box {
    double width;
    double height;
    double length;

    Box() {
        width = 0;
        height = 0;
        length = 0;
    }

    Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    double getVolume() {
        return width * height * length;
    }

    void showVolume() {
        double volume = getVolume();
        System.out.println(volume);
    }
}
