package org.example;

public class Box {
    double width;
    double height;
    double length;

    void setDimens(double w, double h, double l) {
        width = w;
        height = h;
        length = l;
    }

    double getVolume() {
        return width * height * length;
    }

    void showVolume() {
        double volume = getVolume();
        System.out.println(volume);
    }
}
