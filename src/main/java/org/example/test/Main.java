package org.example.test;


import org.example.box.Box;
import org.example.box.WeightBox;
import org.example.inheritance.Rectangle;
import org.example.inheritance.Triangle;

class Main {
    public static void main(String[] args) {
//        Cat cat = new Cat();
//        Lion lion = new Lion();
//        cat.eat();
//        lion.eat();

//        Box box = new Box(10);
//        WeightBox weightBox = new WeightBox(10, 20);
//        box.showInfo();
//        weightBox.showInfo();

        Rectangle rectangle = new Rectangle(10,20);
        Triangle triangle = new Triangle(10,10, 10);
        rectangle.showPerimetr();
        triangle.showPerimetr();
    }
}