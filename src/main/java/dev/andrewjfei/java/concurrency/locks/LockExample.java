package dev.andrewjfei.java.concurrency.locks;

import dev.andrewjfei.java.concurrency.utils.TaskUtil;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample {
    private Lock lock;

    public LockExample() {
        this.lock = new ReentrantLock();
    }

    public void executeNonLockTask() {
        executeTask();
    }

    public void executeLockTask() {
        lock.lock();
        executeTask();
        lock.unlock();
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
