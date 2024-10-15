package org.example.intefaces;

public class WaiterBob implements Waiter {
    @Override
    public void bringOrder(String dish) {
        System.out.println("bringing order " + dish);
    }
}
