package com.java.stackqueue;

/**
 * Created by bilalshaikh on 1/27/17.
 */
public class StackClient {
    public static void main(String[] args) {
        StackImplementation sc = new StackImplementation();
        try {
            sc.push(1);
            sc.push(2);
            sc.push(3);
            sc.push(4);
            sc.push(5);
            //sc.push(6);
            sc.pop();
            sc.pop();
            sc.pop();
            sc.push(7);
            sc.pop();
            sc.pop();
            sc.pop();
            sc.pop();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println();
            System.out.println("Stack is full");
        }
    }
}
