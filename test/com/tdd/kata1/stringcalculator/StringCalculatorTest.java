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
    
    @Test
    public void testTwoNumbers() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(3, calculator.Add("1,2"));
    }
    
    @Test
    public void testThreeNumbers() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(6, calculator.Add("1,2,3"));
    }
    
    @Test
    public void testMultipleNumbers() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(10, calculator.Add("1,2,3,4"));
    }
    
    @Test
    public void testNewLinesBetweenNumbers() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(6, calculator.Add("1\n2,3"));
    }
    
    @Test
    public void testDifferentDelimiter() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(3, calculator.Add("//;\n1;2"));
    }
    
    @Test
    public void testNegativeNumbersThrowException() {
        StringCalculator calculator = new StringCalculator();
        Exception exception = assertThrows(RuntimeException.class, () -> {
            calculator.Add("1,-2,3");
        });
        assertEquals("negative numbers not allowed -2", exception.getMessage());
    }
    
    @Test
    public void testMultipleNegativeNumbersThrowException() {
        StringCalculator calculator = new StringCalculator();
        Exception exception = assertThrows(RuntimeException.class, () -> {
            calculator.Add("-1,-2,3");
        });
        assertEquals("negative numbers not allowed -1,-2", exception.getMessage());
    }
    
    @Test
    public void testGetCalledCount() {
        StringCalculator calculator = new StringCalculator();
        calculator.Add("1,2");
        calculator.Add("3,4");
        assertEquals(2, calculator.GetCalledCount());
    }
    
    @Test
    public void testNumbersGreaterThan1000ToBeIgnored() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(2, calculator.Add("2,1001"));
    }
}