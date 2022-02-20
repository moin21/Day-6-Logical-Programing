package com.logicalprograms;

import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String[] args) {
		/*
		 * Taking user input in decimal to convert in binary.
		 */
		Scanner input = new Scanner(System.in);

		System.out.println("Enter number");
		int decimal = input.nextInt();
		decimalToBinary(decimal);
	}

	/*
	 * method to convert Decimal to binary using array
	 */
	public static void decimalToBinary(int decimal) {

		int[] binaryNum = new int[1000];

		int i = 0;
		while (decimal > 0) {
			/*
			 * storing remainder
			 */
			binaryNum[i] = decimal % 2;
			decimal = decimal / 2;
			i++;
		}

		/*
		 * reversing array
		 */
		for (int j = i - 1; j >= 0; j--)
			System.out.print(binaryNum[j]);
	}
}
