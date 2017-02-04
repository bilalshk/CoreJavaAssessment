package com.java.stackqueue;

/**
 * Created by bilalshaikh on 1/27/17.
 */
public class StackImplementation {
    public int top = -1;
    int[] a = new int[5];

    public void push (int n) {
        if(top > 5)
        {
            System.out.println();
            System.out.println("Stack is full");
        }
        else{
            System.out.println();
            System.out.println(n+ " is inserted");
            top = top + 1;
            a[top] = n;
        }
    }
    public void pop() {
        if(top == -1){
            System.out.println();
            System.out.println("Stack is empty");
        }
        else{
            System.out.println();
            System.out.println(a[top]+ " is deleted");
            top = top - 1;
        }
    }
}