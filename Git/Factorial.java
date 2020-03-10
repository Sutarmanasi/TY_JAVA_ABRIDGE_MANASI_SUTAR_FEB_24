package com.capgemini.assesments.first;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		int i, fact = 1, num;
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter number : ");
		num = scn.nextInt();
		for (i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + num + " is: " + fact);
	}
}
