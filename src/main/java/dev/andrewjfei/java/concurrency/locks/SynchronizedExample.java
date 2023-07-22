package dev.andrewjfei.java.concurrency.locks;

import dev.andrewjfei.java.concurrency.utils.TaskUtil;

public class SynchronizedExample {
    public SynchronizedExample() {

    }

    public void executeNonSynchronizedTask() {
        executeTask();
    }

    public synchronized void executeSynchronizedTask() {
        executeTask();
    }

    private void executeTask() {
        String threadName = Thread.currentThread().getName();
        System.out.println("Starting " + threadName + "...");

        for (int i = 0; i < 5; i++) {
            TaskUtil.sleep(100);
            System.out.println(threadName + " - " + i);
        }

        System.out.println("Stopping " + threadName + "...");
    }
}
