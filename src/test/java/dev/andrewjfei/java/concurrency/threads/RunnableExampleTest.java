package dev.andrewjfei.java.concurrency.threads;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RunnableExampleTest {
    @Test
    void testExecutionOfMultipleThreads() {
        // Given
        int initialThreadCount = Thread.activeCount();
        int additionalThreadCount = 5;

        // When
        RunnableExample runnable = new RunnableExample();

        for (int i = 0; i < additionalThreadCount; i++) {
            Thread thread = new Thread(runnable);
            thread.start();
        }

        // Then
        Assertions.assertEquals(initialThreadCount + additionalThreadCount, Thread.activeCount());
    }
}
