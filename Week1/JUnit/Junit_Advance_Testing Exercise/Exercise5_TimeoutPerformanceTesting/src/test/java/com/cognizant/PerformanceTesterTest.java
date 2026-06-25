package com.cognizant;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;

public class PerformanceTesterTest {

    private final PerformanceTester performanceTester = new PerformanceTester();

    @Test
    void testPerformance() {

        Assertions.assertTimeout(
                Duration.ofSeconds(1),
                () -> performanceTester.performTask()
        );

    }

}