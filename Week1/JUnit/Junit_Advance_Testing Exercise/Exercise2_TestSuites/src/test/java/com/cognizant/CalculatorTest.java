package com.cognizant;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void testAddition() {
        Assertions.assertEquals(15, calculator.add(10, 5));
    }
}