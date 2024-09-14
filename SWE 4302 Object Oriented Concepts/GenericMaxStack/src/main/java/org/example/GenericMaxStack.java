package org.example;

public class GenericMaxStack<T> {
    private int size;
    private int top;
    private T[] elements;

    public GenericMaxStack(int s) {
        size = (s > 0) ? s : 10;
        top = -1;
        elements = (T[]) new Object[size];
    }

    public void push(T pushValue) throws FullGenericMaxStackException {
        if (top == size - 1) {
            throw new FullGenericMaxStackException(String.format("Stack is full, cannot push %s", pushValue));
        }
        elements[++top] = pushValue;
    }

    public T pop() throws EmptyGenericMaxStackException {
        if (top == -1) {
            throw new EmptyGenericMaxStackException("Stack is empty, cannot pop");
        }
        return elements[top--];
    }
}
