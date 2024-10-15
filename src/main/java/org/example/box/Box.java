package org.example.box;

public class Box {
    private double width;
    private double height;
    private double length;

    public Box() {
        this(10);
    }

    public Box(Box another) {
        this(another.width, another.height, another.length);
    }

    public Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public Box(double size) {
        this(size, size, size);
    }

    public void showInfo() {
        System.out.println("Width: " + width + " Height: " + height + " Length: " + length);
    }

    public void setDimens(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public Box copy() {
        return new Box(width, height, length);
    }

    public Box copyDouble() {
        return new Box(width * 2, height * 2, length * 2);
    }

    public int compare(Box another) {
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

    private double getVolume() {
        return width * height * length;
    }

    public void showVolume() {
        double volume = getVolume();
        System.out.println(volume);
    }
}
