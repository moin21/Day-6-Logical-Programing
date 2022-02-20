package com.logicalprograms;

import java.util.*;
import java.lang.*;

public class VendingMachine {

	/*
	 * function to count and print currency notes
	 */
	public static void countCurrency(int amount) {
		int[] notes = new int[] { 1000, 500, 100, 50, 10, 5, 1 };
		int[] noteCounter = new int[7];

		// count notes using Greedy approach
		for (int i = 0; i < 7; i++) {
			if (amount >= notes[i]) {
				noteCounter[i] = amount / notes[i];
				amount = amount - noteCounter[i] * notes[i];
			}
		}

		// Print notes
		System.out.println("Currency Count ->");
		for (int i = 0; i < 7; i++) {
			if (noteCounter[i] != 0) {
				System.out.println(notes[i] + " : " + noteCounter[i]);
			}
		}
	}

	// driver function
	public static void main(String argc[]) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter amount to withdraw:");
		int amount = input.nextInt();
		countCurrency(amount);
	}

}
