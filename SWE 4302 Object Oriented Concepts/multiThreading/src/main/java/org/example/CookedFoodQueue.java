package org.example;
import java.util.ArrayList;
import java.util.List;
// CookedFoodQueue class representing a queue for cooked dishes ready to be served
class CookedFoodQueue {
    private List<CookedFood> cookedFoods = new ArrayList<>();
    private Object cookedFoodLock = new Object(); 
    public void addToQueue(CookedFood cookedFood) {
        synchronized (cookedFoodLock) {
            cookedFoods.add(cookedFood);
        }
    }

    public CookedFood removeFromQueue() {
        synchronized (cookedFoodLock) {
            if (!cookedFoods.isEmpty()) {
                return cookedFoods.remove(0);
            }
        }
        return null;
    }
}
