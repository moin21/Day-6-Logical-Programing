package com.logicalprograms;

import java.util.Scanner;
import java.util.Arrays;
import java.io.*;

public class DecimalToBinaryToDecimal {
	public static void main(String[] args) {
		/*
		 * Taking user input in decimal to convert in binary.
		 */
		Scanner input = new Scanner(System.in);

		System.out.println("Enter number");
		int decimal = input.nextInt();
		binaryToDecimal(reversingNibbles(actualBinaryGenerator(decimalToBinary(decimal))));
	}

	/*
	 * method to convert Decimal to binary using array
	 */
	public static int[] decimalToBinary(int decimal) {

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
		return binaryNum;
	}

	/*
	 * reversing array to generate actual binary code
	 */
	public static int[] actualBinaryGenerator(int[] binaryNum) {

		int[] actualBinary = new int[8];
		int j = 8;
		for (int i = 0; i < 8; i++) {
			actualBinary[j - 1] = binaryNum[i];
			j = j - 1;

		}
		System.out.print("Binary code is: \n");
		for (int l = 0; l < 8; l++) {
			System.out.print(actualBinary[l]);
		}
		return actualBinary;
	}

	public static int[] reversingNibbles(int[] actualBinary) {
		int[] nibble1 = Arrays.copyOfRange(actualBinary, 0, actualBinary.length / 2);
		int[] nibble2 = Arrays.copyOfRange(actualBinary, 4, 8);
		int[] reversedNibbles = new int[8];
		System.arraycopy(nibble2, 0, reversedNibbles, 0, 4);
		System.arraycopy(nibble1, 0, reversedNibbles, 4, 4);

		return reversedNibbles;
	}

	public static void binaryToDecimal(int[] reversedNibbles) {

		String binary = Arrays.toString(reversedNibbles);
		int i = Integer.parseInt(binary, 2);
	}
}
