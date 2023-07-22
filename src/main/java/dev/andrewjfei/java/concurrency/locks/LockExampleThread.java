package dev.andrewjfei.java.concurrency.locks;

public class LockExampleThread extends Thread {
    private final LockExample lockExample;
    private final boolean runLocked;

    public LockExampleThread(LockExample lockExample, boolean runLocked) {
        this.lockExample = lockExample;
        this.runLocked = runLocked;
    }

    @Override
    public void run() {
        if (runLocked) {
            lockExample.executeLockTask();
        } else {
            lockExample.executeNonLockTask();
        }
    }

    public static void main(String[] args) {
        LockExample lockExample = new LockExample();

        Thread thread1 = new LockExampleThread(lockExample, true);
        Thread thread2 = new LockExampleThread(lockExample, true);

        thread1.start();
        thread2.start();
    }
}
