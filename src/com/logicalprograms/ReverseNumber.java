package com.logicalprograms;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		System.out.println("Enter Any No.");
		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();
		sc.close();
		reversingNumber(number);
	}

	public static int reversingNumber(int number) {
		int reverse = 0;
		while (number != 0) {
			int remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;
		}
		System.out.println("The reverse of the " + number + " number is: " + reverse);
		return reverse;
	}
}
