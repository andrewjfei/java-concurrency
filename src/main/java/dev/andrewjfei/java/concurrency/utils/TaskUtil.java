package dev.andrewjfei.java.concurrency.utils;

public class TaskUtil {
    public static void sleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException interruptedException) {
            System.out.println(Thread.currentThread().getName() + " has been interrupted!");
        }
    }
}
