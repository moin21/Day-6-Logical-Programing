package com.logicalprograms;

import java.util.Scanner;

public class TempratureConverter {
	public static double f, c;
	public static void main(String arg[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose type of conversion \n 1.Fahrenheit to Celsius  \n 2.Celsius to Fahrenheit");
		int selection = sc.nextInt();
		switch (selection) {
		case 1:
			System.out.println("Enter  Fahrenheit temperature");
			f = sc.nextDouble();
			f2c(f);
			break;
		case 2:
			System.out.println("Enter  Celsius temperature");
			c = sc.nextDouble();
			c2f(c);
			break;
		}
	}
	public static void f2c(double f) {
		c=(f-32)*5/9;
  	  System.out.println("Celsius temperature is = "+c);
	}
	public static void c2f(double c) {
		f=((9*c)/5)+32;
  	  System.out.println("Fahrenheit temperature is = "+f);
	}
}