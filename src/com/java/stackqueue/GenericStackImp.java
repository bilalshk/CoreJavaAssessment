package com.java.stackqueue;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;

/**
 * Created by bilalshaikh on 2/2/17.
 */
public class GenericStackImp<T> {

    public int capacity = 5;
    public int top = 0;
    List<T> gens = new ArrayList<T>(capacity);

    public void push(T element) throws UserException {
        if (top >= capacity) {
            System.out.println("Stack is full");
        } else {

            gens.add(top,element);
            top++;
        }
    }

    public void pop() throws UserException {
        if (top == 0) {
            System.out.println("Stack is empty");
        } else {
            top--;
            gens.remove(top);

        }
    }

    public static void main(String[] args) throws UserException{

        GenericStackImp<GenericStack> gsi = new GenericStackImp<>();
        GenericStack gsi1 = GenericStack.obj(1, "One");
        GenericStack gsi2 = GenericStack.obj(2, "Two");
        GenericStack gsi3 = GenericStack.obj(3, "Three");
        GenericStack gsi4 = GenericStack.obj(4, "Four");
        GenericStack gsi5 = GenericStack.obj(5, "Five");

        gsi.push(gsi1);
        System.out.println(gsi1.getData());
        System.out.println();

        gsi.push(gsi2);
        System.out.println(gsi2.getData());
        System.out.println();

        gsi.push(gsi3);
        System.out.println(gsi3.getData());
        System.out.println();

        gsi.push(gsi4);
        System.out.println(gsi4.getData());
        System.out.println();

        gsi.push(gsi5);
        System.out.println(gsi5.getData());
        System.out.println();

        gsi.pop();
        System.out.println(gsi.top);
        System.out.println();

        gsi.pop();
        System.out.println(gsi.top);
        System.out.println();

        gsi.pop();
        System.out.println(gsi.top);
        System.out.println();

        gsi.pop();
        System.out.println(gsi.top);
        System.out.println();

        gsi.pop();
        System.out.println(gsi.top);
        System.out.println();

    }
    public static class UserException extends Exception {
        UserException(String errorMessage) {
            super(errorMessage);
        }
    }
}
