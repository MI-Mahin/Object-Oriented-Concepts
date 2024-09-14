package org.example;

import java.util.Random;

public class Customer extends Thread {
    private static int customerCount = 0;
    private int customerId;
    private OrderQueue orderQueue;
    private Receptionist receptionist;

    public Customer(OrderQueue orderQueue, Receptionist receptionist) {
        this.customerId = ++customerCount;
        this.orderQueue = orderQueue;
        this.receptionist = receptionist;
    }

    @Override
    public void run() {
        // Randomly order dishes
        String[] dishes = {"Burger", "Pizza", "Pasta"};
        Random random = new Random();
        int numOrders = random.nextInt(dishes.length) + 1; // Random number of dishes to order

        System.out.println("Customer " + customerId + " is placing an order.");

        for (int i = 0; i < numOrders; i++) {
            String dish = dishes[random.nextInt(dishes.length)];
            Order order = new Order(customerId, dish);
            orderQueue.addToQueue(order);
            System.out.println("Customer " + customerId + " ordered " + dish);
        }

        // Customer is assigned a table by the receptionist
        receptionist.assignTable(this);

        // Customer waits until the food is served
        try {
            this.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Customer " + customerId + " is leaving.");
    }

    public int getCustomerId() {
        return customerId;
    }
}

