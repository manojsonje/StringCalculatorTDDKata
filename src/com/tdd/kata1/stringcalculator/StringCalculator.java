package com.tdd.kata1.stringcalculator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Manoj
 *
 */
public class StringCalculator {

	private int callCount = 0;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int Add(String numbers) {
		callCount++;
	    if (numbers.isEmpty()) {
	        return 0;
	    }

	    String delimiter = ",|\n";
	    if (numbers.startsWith("//")) {
	        int delimiterIndex = numbers.indexOf("\n");
	        delimiter = numbers.substring(2, delimiterIndex);
	        numbers = numbers.substring(delimiterIndex + 1);
	    }

	    String[] nums = numbers.split(delimiter);
	    int sum = 0;
	    List<Integer> negatives = new ArrayList<>();

	    for (String num : nums) {
	        int n = Integer.parseInt(num);
	        if (n < 0) {
	            negatives.add(n);
	        }
	        sum += n;
	    }

	    if (!negatives.isEmpty()) {
	        throw new RuntimeException("negative numbers not allowed " + negatives.stream().map(String::valueOf).collect(Collectors.joining(",")));
	    }

	    return sum;
	}
	
	public int GetCalledCount() {
	    return callCount;
	}
}
