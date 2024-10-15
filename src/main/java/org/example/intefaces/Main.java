package org.example.intefaces;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Cat cat = new Cat();
//        Dog dog = new Dog();
//        Bird bird = new Bird();
//        Fish fish = new Fish();
//        ArrayList<AbleToRun> animals = new ArrayList<>();
//        animals.add(cat);
//        animals.add(dog);
//        animals.add(bird);
//        for (AbleToRun animal : animals) {
//            animal.run();
//        }
//        AbleToFly ableToFly = new Bird();
//        ableToFly.fly();
        Director director = new Director();
        Programmer programmer = new Programmer();
        Chef chef = new Chef();

        ArrayList<Worker> workers = new ArrayList<>();
        workers.add(director);
        workers.add(programmer);
        workers.add(chef);
        for (Worker worker : workers) {
            worker.work();
        }

        ArrayList<Driver> drivers = new ArrayList<>();
        drivers.add(programmer);
        drivers.add(chef);
        for (Driver driver : drivers) {
            driver.drive();
        }


    }
}
