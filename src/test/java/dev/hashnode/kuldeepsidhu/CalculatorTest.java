/*
 * Copyright 2023 License Header.
 */
package dev.hashnode.kuldeepsidhu;

import org.junit.*;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeClass
    public static void beforeClass() throws Exception {
        System.out.println("In beforeClass method");
    }

    @Before
    public void before() throws Exception {
        System.out.println("In before method");
        calculator = new Calculator();
    }

    @AfterClass
    public static void afterClass() throws Exception {
        System.out.println("In afterClass method");
    }

    @After
    public void after() throws Exception {
        System.out.println("In after method");
    }

    @Ignore
    @Test
    public void ignoredTest() {
        // ignored test
    }

    @Test
    public void testAddition() {
        Assert.assertEquals(10, calculator.add(7, 3));
    }

    @Test
    public void testSubtraction() {
        Assert.assertEquals(6, calculator.subtract(10, 4));
    }

    @Test
    public void testMultiply() {
        Assert.assertEquals(56, calculator.multiply(8, 7));
    }

    @Test
    public void testDivide() {
        Assert.assertEquals(2, calculator.divide(10, 5));
    }
}