package dev.andrewjfei.java.concurrency.threads;

import dev.andrewjfei.java.concurrency.utils.TaskUtil;

public class RunnableExample implements Runnable {
    public RunnableExample() {

    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println("Starting " + threadName + "...");
        TaskUtil.sleep(100);
        System.out.println("Stopping " + threadName + "...");
    }
}
