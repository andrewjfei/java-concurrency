package dev.andrewjfei.java.concurrency.models;

import dev.andrewjfei.java.concurrency.utils.TaskUtil;

public class ModelExample {
    public ModelExample() {

    }

    public void executeTask() {
        String threadName = Thread.currentThread().getName();
        System.out.println("Starting " + threadName + "...");

        for (int i = 0; i < 5; i++) {
            TaskUtil.sleep(100);
            System.out.println(threadName + " - " + i);
        }
        System.out.println("Stopping " + threadName + "...");
    }
}
