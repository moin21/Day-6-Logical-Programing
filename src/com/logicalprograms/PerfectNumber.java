package com.logicalprograms;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		System.out.println("Enter any number to check if it's a perfect number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		isPerfectNumber(n);
	}

	public static int isPerfectNumber(int n) {
		int sum = 0;

		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}

		if (n == sum)
			System.out.println("Entered number is a Perfect Number .");
		else
			System.out.println("Entered number is not a Perfect Number.");
		return sum;

	}

}
