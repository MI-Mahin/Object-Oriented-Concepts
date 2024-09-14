package org.example;
import java.util.ArrayList;
import java.util.List;

// Order class representing a customer's order
class Order {
    private int customerId;
    private String dish;

    public Order(int customerId, String dish) {
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

