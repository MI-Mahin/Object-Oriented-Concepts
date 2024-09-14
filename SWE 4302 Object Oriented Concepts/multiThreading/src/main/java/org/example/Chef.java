package org.example;

import java.util.Random;

public class Chef extends Thread {
    private static int chefCount = 0;
    private int chefId;
    private OrderQueue orderQueue;
    private CookedFoodQueue cookedFoodQueue;

    public Chef(OrderQueue orderQueue, CookedFoodQueue cookedFoodQueue) {
        this.chefId = ++chefCount;
        this.orderQueue = orderQueue;
        this.cookedFoodQueue = cookedFoodQueue;
    }

    @Override
    public void run() {
        while (true) {

            Order order = orderQueue.removeFromQueue();

            if (order != null) {
                System.out.println("Chef " + chefId + " is preparing " + order.getDish() + " for Customer " + order.getCustomerId());


                try {
                    Random random = new Random();
                    int cookingTime = random.nextInt(5000) + 1000; // Simulate cooking time between 1 to 5 seconds
                    Thread.sleep(cookingTime);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


                CookedFood cookedFood = new CookedFood(order.getCustomerId(), order.getDish());
                cookedFoodQueue.addToQueue(cookedFood);

                System.out.println("Chef " + chefId + " has prepared " + order.getDish() + " for Customer " + order.getCustomerId());
            }
        }
    }
}

