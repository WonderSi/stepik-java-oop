package org.example.intefaces;

public class Director implements Worker{
    @Override
    public void work() {
        System.out.println("Директор работает");
    }
}
