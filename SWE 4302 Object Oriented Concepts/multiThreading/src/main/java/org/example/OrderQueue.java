package org.example;
import java.util.ArrayList;
import java.util.List;
// OrderQueue class representing a queue for customer orders
class OrderQueue {
    private List<Order> orders = new ArrayList<>();
    private Object orderLock = new Object();

    public void addToQueue(Order order) {
        synchronized (orderLock) {
            orders.add(order);
        }
    }

    public Order removeFromQueue() {
        synchronized (orderLock) {
            if (!orders.isEmpty()) {
                return orders.remove(0);
            }
        }
        return null;
    }
}

