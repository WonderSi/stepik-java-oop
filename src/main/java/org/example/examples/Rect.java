package org.example.examples;

public class Rect {
    double length;
    double width;

    void setDimens(double l, double w) {
        length = l;
        width = w;
    }

    double getArea() {
        return length * width;
    }
}
