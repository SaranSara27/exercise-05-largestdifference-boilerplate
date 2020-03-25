package com.stackroute;

import java.util.Scanner;

public class LargestDifference {

	// Do not print anything other than what's expected/asked in problem
	public static void main(String[] args) {
		// Use Scanner to get input from console
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String[] values = input.split(" ");
		int size = Integer.parseInt(values[0].trim());
		int[] numbers = new int[size];
		for (int i = 1; i <= size; i++) {
			numbers[i - 1] = Integer.parseInt(values[i].trim());
		}
		System.out.println(findLargestDifference(numbers));

	}

	public static int findLargestDifference(int[] numbers) {
		int r = 0;
		int indexVal = 0;
		int ind = 0;
		for (int i = 0; i < numbers.length; i++) {
			int fn = numbers[i];
			if (i == numbers.length - 1) {
				break;
			}
			int sn = numbers[i + 1];
			int t = Math.abs(fn - sn);
			if (r <= t) {
				int temp = 0;
				int tempInd = 0;
				if (fn < sn) {
					temp = sn;
					tempInd = i + 1;
				} else {
					temp = fn;
					tempInd = i;

				}
				if (r == t && temp > indexVal) {
					indexVal = temp;
					ind = tempInd;
				} else if (r < t) {
					indexVal = temp;
					ind = tempInd;
				}
				r = t;
			}

		}
		return ind;
	}

}
