package org.example;
import java.util.ArrayList;
import java.util.List;

// CookedFood class representing a dish that has been cooked and is ready to be served
class CookedFood {
    private int customerId;
    private String dish;

    public CookedFood(int customerId, String dish) {
        this.customerId = customerId;
        this.dish = dish;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getDish() {
        return dish;
    }
}

