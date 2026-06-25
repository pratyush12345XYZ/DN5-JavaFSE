package com.cognizant;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionThrowerTest {

    private final ExceptionThrower exceptionThrower = new ExceptionThrower();

    @Test
    void testThrowException() {

        IllegalArgumentException exception = Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> exceptionThrower.throwException()
        );

        Assertions.assertEquals("This is an exception.", exception.getMessage());
    }
}