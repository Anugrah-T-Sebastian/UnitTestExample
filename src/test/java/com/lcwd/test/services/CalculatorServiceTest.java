package com.lcwd.test.services;

import org.junit.*;

public class CalculatorServiceTest {

    @BeforeClass
    public static void init() {
        System.out.println("Before all test cases");
    }

    @Before
    public void beforeEach() {
        System.out.println("Before each test case");
    }

    @After
    public void afterEach() {
        System.out.println("After each test case");
    }

    @Test(timeout = 2000)
    public void addTwoNumbersTest() {
        int result = CalculatorService.addTwoNumbers(12, 45);
        int expected = 57;

        System.out.println("addTwoNumbersTest");
        Assert.assertEquals(expected, result);
    }

    @Test
    public void sumAnyNumberTest() {
        int result = CalculatorService.sumAnyNumbers(2, 7, 8, 9);
        int expectedResult = 26;
        System.out.println("sumAnyNumberTest");
        Assert.assertEquals(expectedResult, result);
    }

    @AfterClass
    public static void cleanup() {
        System.out.println("After all test cases");
    }
}
