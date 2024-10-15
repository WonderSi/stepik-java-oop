package org.example.test;


import org.example.box.Box;
import org.example.box.WeightBox;

class Main {
    public static void main(String[] args) {
//        Cat cat = new Cat();
//        Lion lion = new Lion();
//        cat.eat();
//        lion.eat();

        Box box = new Box(10);
        WeightBox weightBox = new WeightBox(10, 20);
        box.showInfo();
        weightBox.showInfo();
    }
}