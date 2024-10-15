package org.example.box;

public class WeightBox extends Box {

    private double weight;

    public WeightBox() {
        this.weight = 10;
    }

    public WeightBox(Box another, double weight) {
        super(another);
        this.weight = weight;
    }

    public WeightBox(double width, double height, double length, double weight) {
        super(width, height, length);
        this.weight = weight;
    }

    public WeightBox(double size, double weight) {
        super(size);
        this.weight = weight;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Weight Box: " + weight + "kg");
    }
}
