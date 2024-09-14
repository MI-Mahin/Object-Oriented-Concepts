package org.example;

public class Waiter extends Thread {
    private static int waiterCount = 0;
    private int waiterId;
    private CookedFoodQueue cookedFoodQueue;

    public Waiter(CookedFoodQueue cookedFoodQueue) {
        this.waiterId = ++waiterCount;
        this.cookedFoodQueue = cookedFoodQueue;
    }

    @Override
    public void run() {
        while (true) {

            CookedFood cookedFood = cookedFoodQueue.removeFromQueue();

            if (cookedFood != null) {
                System.out.println("Waiter " + waiterId + " is serving " + cookedFood.getDish() + " to Customer " + cookedFood.getCustomerId());
            }
        }
    }
}

