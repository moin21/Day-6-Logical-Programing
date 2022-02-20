package com.logicalprograms;

import java.util.Scanner;

public class Util {
	public static void main(String[] args) {
		/*
		 * Taking user input for date.
		 */
		Scanner input = new Scanner(System.in);

		System.out.println("Enter Year");
		int y = input.nextInt();
		System.out.println("Enter Month(1-12 for Jan-Dec)");
		int m = input.nextInt();
		System.out.println("Enter Day(0-6 for Sun-Sat)");
		int d = input.nextInt();
		input.close();
		findingDay(y, m, d);
	}

	/*
	 * Method to find Day of week using Gregorian formulas
	 */
	public static void findingDay(int y, int m, int d) {
		int y0, m0, d0, x;
		y0 = y - (14 - m) / 12;
		x = y0 + (y0 / 4) - (y0 / 100) + (y0 / 400);
		m0 = m + 12 * ((14 - m) / 12) - 2;
		d0 = (d + x + (31 * m0) / 12) % 7;
		System.out.println(d0);
	}
}
