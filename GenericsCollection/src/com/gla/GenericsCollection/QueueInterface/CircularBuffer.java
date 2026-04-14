package com.gla.GenericsCollection.QueueInterface;

public class CircularBuffer {

    int[] arr;
    int size, index = 0;

    public CircularBuffer(int size) {
        this.size = size;
        arr = new int[size];
    }

    public void add(int val) {
        arr[index % size] = val;
        index++;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
