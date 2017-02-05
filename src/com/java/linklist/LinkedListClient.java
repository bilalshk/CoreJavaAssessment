package com.java.linklist;

/**
 * Created by bilalshaikh on 2/5/17.
 */
public class LinkedListClient {
    public static void main(String[] args) {

        LinkedList l = new LinkedList();

        l.addf(1);
        l.addl(2);
        l.addl(3);
        l.addf(9);
        l.addl(4);
        l.addl(5);
        l.addl(6);
        l.addf(0);
        l.addpos(10,3);
        l.display();

    }
}
