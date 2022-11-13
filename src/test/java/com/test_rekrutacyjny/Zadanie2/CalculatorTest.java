package com.test_rekrutacyjny.Zadanie2;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.test_rekrutacyjny.test_rekrutacyjny.Zadanie1.Calculator;

public class CalculatorTest {
    Calculator calculator;

    @BeforeEach                                     
    public void setUp() {
        calculator = new Calculator();
    }

    @Test                                               
    public void testCalculations() throws Exception {
        assertTrue(calculator.Calculate("1,2,3,+") == 6);
        assertTrue(calculator.Calculate("1,2,3+") == 6);
        assertTrue(calculator.Calculate("1,2,3;4..+") == 10);
        assertTrue(calculator.Calculate("1,;;2,3;..4..+") == 10);
        assertTrue(calculator.Calculate("1,;;2,3;....*") == 6);
        assertTrue(calculator.Calculate("1+") == 1);
        assertTrue(calculator.Calculate("1,2+") == 3);
    }
}
