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

		String delimiter = ",|\n"; // Default delimiters are comma and newline
		if (numbers.startsWith("//")) {
			int delimiterIndex = numbers.indexOf("\n");
			delimiter = numbers.substring(2, delimiterIndex);
			numbers = numbers.substring(delimiterIndex + 1);
		}

		String[] nums = numbers.split(delimiter);
		int sum = 0;
		for (String num : nums) {
			sum += Integer.parseInt(num);
		}
		return sum;
	}
}
