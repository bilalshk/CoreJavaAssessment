package com.java.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by bilalshaikh on 2/5/17.
 */
public class QueueClient {
    public static void main(String[] args) throws IOException{

        Queue q = new Queue();

        int n, d, del;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the size of queue: ");
        n = Integer.parseInt(br.readLine());

        q.setSize(n);

        System.out.println();

        for (int i=0; i< n; i++) {
            System.out.print("Enter the element to insert: ");
            d = Integer.parseInt(br.readLine());
            q.add(d);
        }

        q.display();

        System.out.print("How many element to delete: ");
        del = Integer.parseInt(br.readLine());
        for (int j=0; j< del; j++) {
            q.delete();
        }

        System.out.println("After deleting");
        q.display();

    }
}
