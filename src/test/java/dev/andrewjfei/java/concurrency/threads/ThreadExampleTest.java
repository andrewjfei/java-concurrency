package dev.andrewjfei.java.concurrency.threads;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ThreadExampleTest {
    @Test
    void testExecutionOfMultipleThreads() {
        // Given
        int initialThreadCount = Thread.activeCount();
        int additionalThreadCount = 5;

        // When
        for (int i = 0; i < additionalThreadCount; i++) {
            Thread thread = new ThreadExample();
            thread.start();
        }

        // Then
        Assertions.assertEquals(initialThreadCount + additionalThreadCount, Thread.activeCount());
    }
}
