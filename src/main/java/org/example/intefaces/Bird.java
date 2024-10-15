package org.example.intefaces;

public class Bird extends Animal implements AbleToFly, AbleToRun{

    @Override
    public void eat() {
        System.out.println("Птичий корм");
    }

    @Override
    public void fly() {
        System.out.println("Птица летит");
    }

    @Override
    public void run(){
        System.out.println("Птица бежит");
    }
}
