package com.lcwd.test.services;

import java.util.Arrays;

public class CalculatorService {
    public static int addTwoNumbers(int a, int b) { return  a + b; }
    public static int productTwoNumbers(int a, int b) { return a * b; }
    public static int divideTwoNumbers(int a, int b) { return  a / b; }
    public static int sumAnyNumbers(int ...numbers) {
        return Arrays
                .stream(numbers)
                .sum();
    }
}
