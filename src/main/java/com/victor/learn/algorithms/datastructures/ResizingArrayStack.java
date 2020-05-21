package com.victor.learn.algorithms.datastructures;

public class FixedCapacityStack<T> {
    private T[] a;
    private int n;

    public FixedCapacityStack(int capacity) {
        this.a = (T[]) new Object[capacity];
    }
    
    public boolean isEmpty() {
        return n == 0;
    }
    
    public int size(){
        return n;
    }
    
    public void push(T item) {
        a[n++] = item;
    }

    public T pop() {
        return a[--n];
    }
        
}
