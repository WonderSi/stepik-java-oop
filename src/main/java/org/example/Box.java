package org.example;

public class Box {
    double width;
    double height;
    double length;

    double getVolume() {
        return width * height * length;
    }

    void showVolume() {
        double volume = getVolume();
        System.out.println(volume);
    }
}
