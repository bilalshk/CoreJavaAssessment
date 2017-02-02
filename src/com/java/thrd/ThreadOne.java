package com.java.thrd;

/**
 * Created by bilalshaikh on 2/2/17.
 */
public class ThreadOne implements Runnable {
    ThreadClient threadClient;

    ThreadOne(ThreadClient threadClient) {
        this.threadClient = threadClient;
    }

    @Override
    public void run() {
        System.out.println("In Thread One");

    }
}
