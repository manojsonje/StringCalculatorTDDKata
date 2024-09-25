package com.tdd.kata1.stringcalculator;

/**
 * @author Manoj
 *
 */
public class StringCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int Add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        return Integer.parseInt(numbers);
    }
}
