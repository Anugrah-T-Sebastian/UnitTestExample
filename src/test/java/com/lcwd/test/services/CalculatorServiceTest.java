package com.lcwd.test.services;

import org.junit.*;

public class CalculatorServiceTest {

    int counter = 0;

    @BeforeClass
    public static void init() {
        System.out.println("Before all test cases");
    }

    @Before
    public void beforeEach() {
        counter = 0;
        System.out.println("Before each test case counter: " + counter);
    }

    @After
    public void afterEach() {
        System.out.println("After each test case");
    }

    @Test(timeout = 2000)
    public void addTwoNumbersTest() {
        for (int i = 0; i < 20; i++) {
            counter++;
        }
        int result = CalculatorService.addTwoNumbers(12, 45);
        int expected = 57;

        System.out.println("addTwoNumbersTest counter: " + counter);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void sumAnyNumberTest() {
        for (int i = 0; i < 40; i++) {
            counter++;
        }
        int result = CalculatorService.sumAnyNumbers(2, 7, 8, 9);
        int expectedResult = 26;
        System.out.println("sumAnyNumberTest counter: " + counter);
        Assert.assertEquals(expectedResult, result);
    }

    @AfterClass
    public static void cleanup() {
        System.out.println("After all test cases");
    }
}
