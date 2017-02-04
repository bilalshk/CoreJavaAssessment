package com.java.queue;

/**
 * Created by bilalshaikh on 2/5/17.
 */
public class Queue {

    int[] arr;
    int n;
    int front = -1;
    int rear = -1;

    public void setSize(int n) {
        this.n = n;
        arr = new int[n];
    }

    public void add(int e) {
        if (rear == -1) {
            rear++;
            front++;
            arr[rear] = e;
        } else {
            rear++;
            arr[rear] = e;
        }
    }

    public void delete() {
        int del;
        if (rear == -1) {
            System.out.println("Queue is empty");
        } else {
            del = arr[front];
            System.out.println();
            System.out.println(del+ " is deleted from queue");
            front++;
        }
    }

    public void display() {
        System.out.println();
        System.out.println("Queue is");
        for (int i =front; i<=rear; i++) {
            System.out.println(arr[i]);
        }
    }

}
