package org.example.inheritance;

public class Rectangle extends Shape {

    public Rectangle(int a, int b) {
        super(a, b);
    }

    @Override
    public int getPerimetr() {
        return (a + b) * 2;
    }
}
