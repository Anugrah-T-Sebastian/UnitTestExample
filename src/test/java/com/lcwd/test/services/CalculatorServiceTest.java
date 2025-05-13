package com.lcwd.test.services;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorServiceTest {

    @BeforeClass
    public static void init() {
        System.out.println("Before all test cases");
    }

    //test method of addTwoNumbers
    @Test
    public void addTwoNumbersTest() {
        int result = CalculatorService.addTwoNumbers(12, 45);
        int expected = 57;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void sumAnyNumberTest() {
        int result = CalculatorService.sumAnyNumbers(2, 7, 8, 9);
        int expectedResult = 26;
        Assert.assertEquals(expectedResult, result);
    }
}
