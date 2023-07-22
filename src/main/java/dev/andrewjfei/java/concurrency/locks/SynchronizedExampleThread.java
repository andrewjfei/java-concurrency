package dev.andrewjfei.java.concurrency.locks;

public class SynchronizedExampleThread extends Thread {
    private final SynchronizedExample synchronizedExample;
    private final boolean runSynchronized;

    public SynchronizedExampleThread(SynchronizedExample synchronizedExample, boolean runSynchronized) {
        this.synchronizedExample = synchronizedExample;
        this.runSynchronized = runSynchronized;
    }

    @Override
    public void run() {
        if (runSynchronized) {
            synchronizedExample.executeSynchronizedTask();
        } else {
            synchronizedExample.executeNonSynchronizedTask();
        }
    }

    public static void main(String[] args) {
        SynchronizedExample synchronizedExample = new SynchronizedExample();

        Thread thread1 = new SynchronizedExampleThread(synchronizedExample, true);
        Thread thread2 = new SynchronizedExampleThread(synchronizedExample, true);

        thread1.start();
        thread2.start();
    }
}
