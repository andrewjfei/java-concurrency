package dev.andrewjfei.java.concurrency.threads;

import dev.andrewjfei.java.concurrency.utils.TaskUtil;

public class ThreadExample extends Thread {
    public ThreadExample() {

    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println("Starting " + threadName + "...");
        TaskUtil.sleep(100);
        System.out.println("Stopping " + threadName + "...");
    }
}
