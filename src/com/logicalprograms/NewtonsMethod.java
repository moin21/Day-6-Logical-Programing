package com.logicalprograms;

import java.util.Scanner;

public class NewtonsMethod {
	public static void main(String[] args) {

		/*
		 * user input and initializing t
		 */
		Scanner input = new Scanner(System.in);

		System.out.println("Enter number");
		double c = input.nextDouble();
		input.close();
		double epsilon = 1.0e-15;
		findingSqrt(c, epsilon);

	}

	public static void findingSqrt(double c, double epsilon) {
		double t = c;

		/*
		 * repeating until desired accuracy reached
		 */
		while (Math.abs(t - c / t) > epsilon * t) {
			t = (c / t + t) / 2.0;
		}

		System.out.println(t);
	}
}
