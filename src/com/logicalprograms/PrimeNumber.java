package com.logicalprograms;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		System.out.println("Enter a no. to check if it's a prime number.");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		scanner.close();
		primeChecking(number);
	}

	public static void primeChecking(int number) {
		boolean isPrime = true;
		for (int i = 2; i <= (number / 2); i++) {
			if ((number % i) == 0) {
				isPrime=false;
				break;
			}
		}
		if(isPrime && number >1) {
			System.out.println("It's a prime number");
		}
		else {
			System.out.println("It's not a prime number");
		}
			
	}
}
