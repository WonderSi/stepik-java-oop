package org.example.intefaces;

public class Client {
    void nakeOrder(Waiter waiter, String dish) {
        waiter.bringOrder(dish);
    }
}
