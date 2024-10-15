package org.example.examples;

public class Dog {
    String name;
    String breed;
    double weight;
    int speed;

    String getInfo() {
        run();
        return "Name: " + name + ", Breed: " + breed + ", Weight: " + weight;
    }

    void run() {
        for (int i =0; i<speed; i++) {
            System.out.println("run");
        }
    }
}
