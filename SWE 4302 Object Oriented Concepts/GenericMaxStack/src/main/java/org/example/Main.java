package org.example;
import org.example.GenericMaxStack;
import org.example.FullGenericMaxStackException;
import org.example.EmptyGenericMaxStackException;


public class Main {
    public static void main(String[] args) {
        GenericMaxStack<Integer> stack = new GenericMaxStack<>(10);

        try {
            stack.push(5);
            int poppedValue = stack.pop();
            System.out.println("Popped value: " + poppedValue);
        } catch (FullGenericMaxStackException | EmptyGenericMaxStackException e) {
            System.err.println("Stack operation error: " + e.getMessage());
        }
    }
}