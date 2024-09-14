package org.example;

public class Receptionist {
    private static int tableCount = 0;
    private Object tableLock = new Object();
    private int totalTables;

    public Receptionist(int totalTables) {
        this.totalTables = totalTables;
    }

    public void assignTable(Customer customer) {
        synchronized (tableLock) {
            if (tableCount < totalTables) {
                tableCount++;
                System.out.println("Receptionist assigns table " + tableCount + " to Customer " + customer.getCustomerId());
            } else {
                System.out.println("No available tables. Customer " + customer.getCustomerId() + " must wait.");
            }
        }
    }
}

