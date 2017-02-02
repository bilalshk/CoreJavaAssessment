package com.java.thrd;

/**
 * Created by bilalshaikh on 2/2/17.
 */
public class ThreadClient {
    public static void main(String[] args) {

        ThreadClient tc = new ThreadClient();
        ThreadOne tone = new ThreadOne(tc);
        ThreadTwo ttwo = new ThreadTwo(tc);
        Thread t1 = new Thread(tone);
        Thread t2 = new Thread(ttwo);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main thread");
    }
}
