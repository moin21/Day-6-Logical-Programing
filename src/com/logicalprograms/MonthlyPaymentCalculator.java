package com.logicalprograms;

import java.util.Scanner;

public class MonthlyPaymentCalculator {
	public static void main(String[] args) {
		/*
		 * Taking user input for Principal Year and Rate.
		 */
		Scanner input = new Scanner(System.in);

		System.out.println("Enter Principal");
		double P = input.nextInt();
		System.out.println("Enter Years");
		double Y = input.nextInt();
		System.out.println("Enter Rate");
		double R = input.nextInt();
		input.close();
		monthlyPayment(P, Y, R);
	}
	/*
	 * Method to calculate monthly payment using above inputs
	 */
	public static void monthlyPayment(double P, double Y, double R) {
		double payment = 0, n =12*Y, r = R/(1200);
		
		payment = P*r/(1-Math.pow(1+r, -n));
		System.out.println(payment);
		
	}
}
