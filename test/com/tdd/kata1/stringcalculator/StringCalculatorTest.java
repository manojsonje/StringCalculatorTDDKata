package com.tdd.kata1.stringcalculator;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author Manoj
 *
 */
public class StringCalculatorTest {

    @Test
    public void testEmptyString() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(0, calculator.Add(""));
    }
    
    @Test
    public void testOneNumber() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(1, calculator.Add("1"));
    }
}