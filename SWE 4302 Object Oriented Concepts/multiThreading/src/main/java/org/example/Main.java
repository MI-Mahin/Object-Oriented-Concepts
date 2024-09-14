package org.example;

public class Main {
    public static void main(String[] args) {
        int totalTables = 5;
        int totalChefs = 2;
        int totalWaiters = 3;
        int totalCustomersToServe = 10;

        // Create shared data structures
        OrderQueue orderQueue = new OrderQueue();
        CookedFoodQueue cookedFoodQueue = new CookedFoodQueue();


        Receptionist receptionist = new Receptionist(totalTables);


        Chef[] chefs = new Chef[totalChefs];
        for (int i = 0; i < totalChefs; i++) {
            chefs[i] = new Chef(orderQueue, cookedFoodQueue);
            chefs[i].start();
        }


        Waiter[] waiters = new Waiter[totalWaiters];
        for (int i = 0; i < totalWaiters; i++) {
            waiters[i] = new Waiter(cookedFoodQueue);
            waiters[i].start();
        }


        Customer[] customers = new Customer[totalCustomersToServe];
        for (int i = 0; i < totalCustomersToServe; i++) {
            customers[i] = new Customer(orderQueue, receptionist);
            customers[i].start();
        }


        for (int i = 0; i < totalCustomersToServe; i++) {
            try {
                customers[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Interrupt chefs and waiters to stop their threads
        for (Chef chef : chefs) {
            chef.interrupt();
        }

        for (Waiter waiter : waiters) {
            waiter.interrupt();
        }
    }
}
