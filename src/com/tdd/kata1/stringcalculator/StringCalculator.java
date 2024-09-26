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

		String[] nums = numbers.split("[,\n]");
		int sum = 0;
		for (String num : nums) {
			sum += Integer.parseInt(num);
		}
		return sum;
	}
}
