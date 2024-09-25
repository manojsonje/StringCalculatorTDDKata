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

		String[] nums = numbers.split(",");
		if (nums.length == 1) {
			return Integer.parseInt(nums[0]);
		} else {
			return Integer.parseInt(nums[0]) + Integer.parseInt(nums[1]);
		}
	}
}
