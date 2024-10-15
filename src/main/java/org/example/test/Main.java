package org.example.test;


import org.example.inheritance.Cat;
import org.example.inheritance.Lion;

class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Lion lion = new Lion();
        System.out.println(cat.isCanEatPerson());
        System.out.println(lion.isCanEatPerson());
    }
}