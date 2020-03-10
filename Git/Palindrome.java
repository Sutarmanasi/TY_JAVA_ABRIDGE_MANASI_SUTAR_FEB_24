package com.capgemini.assesments.first;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		int n, rem, reverse = 0, temp;
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter number : ");
		n = scn.nextInt();
		temp = n;
		while (temp != 0) {
			rem = temp % 10;
			reverse = rem + (reverse * 10);
			temp = temp / 10;
		}
		if (n == reverse) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not palindrome");
		}
	}
}
