package com.cognizant.exercise2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        int result = calculator.add(10, 5);
        System.out.println("Addition Result = " + result);
        assertEquals(15, result);
    }

    @Test
    void testSubtract() {
        int result = calculator.subtract(10, 5);
        System.out.println("Subtraction Result = " + result);
        assertEquals(5, result);
    }

    @Test
    void testMultiply() {
        int result = calculator.multiply(10, 5);
        System.out.println("Multiplication Result = " + result);
        assertEquals(50, result);
    }
}