package org.example;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> intList = new MyList<>();
        MyList<String> stringList = new MyList<>();

        // Adding items to the lists
        intList.addItem(1);
        intList.addItem(2);
        intList.addItem(3);

        stringList.addItem("Hello");
        stringList.addItem("World");

        // Display the contents of the lists
        System.out.println("Int List:");
        for (int i = 0; i < intList.size(); i++) {
            System.out.println(intList.getItem(i));
        }

        System.out.println("String List:");
        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.getItem(i));
        }

        // Check if the lists are empty
        System.out.println("Is Int List empty? " + intList.isEmpty());
        System.out.println("Is String List empty? " + stringList.isEmpty());

        // Remove an item and print the modified list
        int removedInt = intList.getItem(1);
        System.out.println("Removed item from Int List: " + removedInt);
        System.out.println("Updated Int List:");
        for (int i = 0; i < intList.size(); i++) {
            System.out.println(intList.getItem(i));
        }
    }
}

