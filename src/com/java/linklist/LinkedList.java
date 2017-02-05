package com.java.linklist;

/**
 * Created by bilalshaikh on 2/5/17.
 */
public class LinkedList {

    Node start;

    class Node {
        int data;
        Node next;

        public Node(int n) {
            this.data = n;
            this.next = null;
        }
    }

    public void addf(int n) {

        Node nn = new Node(n);

        if (start == null) {
            start = nn;
        } else {
            nn.next = start;
            start = nn;
        }
    }

    public void addl(int n) {

        Node nn = new Node(n);
        Node temp = start;

        if (start == null) {
            start = nn;
        } else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = nn;
        }
    }

    public void display() {

        Node temp = start;

        while (temp != null) {
            System.out.println(temp.data + "\t\t");
            temp = temp.next;
        }
    }

    public void addpos(int n, int pos) {

        Node nn = new Node(n);

        Node temp = start;
        Node temp1 = start;

        int i = 0;

        while (i < pos - 1) {

            temp1 = temp;
            temp = temp.next;
            i++;
        }

        temp1.next = nn;
        nn.next = temp;
    }
}