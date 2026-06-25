package com.cognizant;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EvenCheckerTest {

    private final EvenChecker evenChecker = new EvenChecker();

    @Test
    void testEvenNumber() {
        Assertions.assertTrue(evenChecker.isEven(10));
    }
}