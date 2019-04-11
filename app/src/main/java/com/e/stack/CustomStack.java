package com.e.stack;


import java.util.Arrays;

public class CustomStack<T> implements IStack<T>{
    private Object[] array = null;
    private int top = -1;
    private int capacity;
    private static int DEFAULT_CAPACITY = 16;


    public CustomStack(){
        capacity = DEFAULT_CAPACITY;
        array = new Object[capacity];
    }

    @Override
    public void push(T item) {
        if (top == capacity - 1) {
            capacity = (capacity * 3) / 2 + 1;
            Arrays.copyOf(array, capacity);
        }
        top++;
        array[top] = item;
    }

    @Override
    public T pop() {
        return (top >= 0) ? (T)array[top--] : null;
    }

    @Override
    public T top() {
        return top >= 0 ? (T)array[top] : null;
    }

    public int size(){
        return top + 1;
    }

    @Override
    public boolean isEmpty() {
        return (top < 0);
    }

    public String toString(){
        StringBuilder str = new StringBuilder();
        for (int i = top;i >= 0; i--){
            str.append(array[i]);
            str.append("\n");
        }
        return str.toString();
    }
}
