/*
 * Copyright 2023 License Header.
 */
package dev.hashnode.kuldeepsidhu;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeAll
    public static void beforeClass() throws Exception {
        System.out.println("In beforeClass method");
    }

    @BeforeEach
    public void before() throws Exception {
        System.out.println("In before method");
        calculator = new Calculator();
    }

    @AfterAll
    public static void afterClass() throws Exception {
        System.out.println("In afterClass method");
    }

    @AfterEach
    public void after() throws Exception {
        System.out.println("In after method");
    }

    @Disabled
    @Test
    void ignoredTest() {
        // ignored test
    }

    @Test
    void testAddition() {
        Assertions.assertEquals(10, calculator.add(7, 3));
    }

    @Test
    void testSubtraction() {
        Assertions.assertEquals(6, calculator.subtract(10, 4));
    }

    @Test
    void testMultiply() {
        Assertions.assertEquals(56, calculator.multiply(8, 7));
    }

    @Test
    void testDivide() {
        Assertions.assertEquals(2, calculator.divide(10, 5));
    }
}