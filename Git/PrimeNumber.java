package com.capgemini.assesments.first;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter number : ");
		int num = scn.nextInt();
		int a = 1;
		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0) {
				System.out.println("Not Prime");
				a = 0;
			}
		}
		if (a == 1) {
			System.out.println("Prime");
		}
	}
}
