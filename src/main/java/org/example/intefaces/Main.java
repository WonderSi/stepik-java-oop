package org.example.intefaces;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Director director = new Director();
//        Programmer programmer = new Programmer();
//        director.force(programmer);

//        Client client = new Client();
//        WaiterBob bob = new WaiterBob();
//        client.nakeOrder(bob, "Пицца");

        Client client = new Client();
        WaiterBob bob = new WaiterBob();
        client.nakeOrder(new Waiter() {
            @Override
            public void bringOrder(String dish) {
                System.out.println("bringing order " + dish);
            }
        }, "Пицца");
    }
}
