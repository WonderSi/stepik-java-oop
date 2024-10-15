package org.example.inheritance;

public abstract class Shape {
    protected int a;
    protected int b;

    public Shape(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public abstract int getPerimetr();

    public final void showPerimetr() {
        System.out.println(getPerimetr());
    }
    public final int getA() {
        return a;
    }

    public final int getB() {
        return b;
    }

}
